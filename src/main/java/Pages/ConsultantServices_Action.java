package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConsultantServices_Action {

    WebDriver driver = null;
    WebDriverWait wait = null;
    long smallWait_seconds = 20;
    Login_WebElement lw = new Login_WebElement();
    //BasicDetails_WebElement BW = new BasicDetails_WebElement();

    public ConsultantServices_Action() {
        this.driver = BasePage.driver;
        wait = new WebDriverWait(this.driver, smallWait_seconds);
    }

    public void EnterAddress(String start, String end, String day, String address, String SpecializationVal,
                             String Service, String experience, String priceval ) {
        driver.findElement(By.xpath("//input[@name=\"address\"]")).sendKeys(address);
        BasePage.deadWait(5000);
        try{
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.getElementsByClassName('col-sm-12')[0].lastChild.firstElementChild.firstElementChild.click()");

        }catch(Exception e){

        }
        BasePage.deadWait(2000);
        By start_timeSlot = By.xpath("//div[@class='row justify-content-center align-items-center']/div[1]//div[@class=\"el-date-editor mr-1 el-input el-input--prefix el-input--suffix el-date-editor--time-select\"]/input");
        By starttime = By.xpath("//div[@class='el-picker-panel__content el-scrollbar__wrap']//div[@class='time-select-item' and  text()='"+start+"']");
//        By x = By.xpath("//div[@class='row justify-content-center align-items-center']/div['el-date-editor mr-1 el-input el-input--prefix el-input--suffix el-date-editor--time-select']//input");
        driver.findElement(start_timeSlot).click();
        BasePage.deadWait(1000);
        driver.findElement(starttime).click();
        BasePage.deadWait(2000);
        By end_timeSlot = By.xpath("//div[@class='row justify-content-center align-items-center']/div[2]//div[@class=\"el-date-editor mr-1 el-input el-input--prefix el-input--suffix el-date-editor--time-select\"]/input");
        By endtime = By.xpath("//body/div[4]//div[@class='el-picker-panel__content el-scrollbar__wrap']//div[1]//div[@class='time-select-item' and  text()='"+end+"']");
        driver.findElement(end_timeSlot).click();
        BasePage.deadWait(2000);
        driver.findElement(endtime).click();
        By Day_Drpdwn = By.xpath("//div[@class='row justify-content-center align-items-center']/div[3]//input[@class='el-input__inner']");
//        By dayofweek = By.xpath("//div[@class='el-picker-panel__content el-scrollbar__wrap']//div[@class='time-select-item' and  text()='"+day+"']");
        By dayofweek= By.xpath("//body/div[5]//ul[@class='el-scrollbar__view el-select-dropdown__list']/li[@class='el-select-dropdown__item select-info']/span[ text()='"+day+"']");
        BasePage.deadWait(2000);
        driver.findElement(Day_Drpdwn).click();
        BasePage.deadWait(2000);
        driver.findElement(dayofweek).click();
        driver.findElement(By.xpath("//html")).click();
        BasePage.deadWait(2000);
        By Specialization = By.xpath("//div[@id='1']//div[@id='multi'][2]//div[@class='el-input el-input--large el-input--suffix']/input");
        By Specialization_drpdwn =By.xpath("//body/div[6]//ul[@class='el-scrollbar__view el-select-dropdown__list']/li[@class='el-select-dropdown__item select-info']/span[ text()='"+SpecializationVal+"']");
        driver.findElement(Specialization).click();
        BasePage.deadWait(2000);
        driver.findElement(Specialization_drpdwn).click();
        BasePage.deadWait(2000);
        By service = By.xpath("//div[@id='1']//div[@id='multi'][2]/div/div[2]//div[@class='el-input el-input--large el-input--suffix']/input");
        By Service_drpdwn =By.xpath("//body/div[7]//ul[@class='el-scrollbar__view el-select-dropdown__list']/li[@class='el-select-dropdown__item select-info']/span[ text()='"+Service+"']");
        driver.findElement(service).click();
        BasePage.deadWait(2000);
        driver.findElement(Service_drpdwn).click();
        By Experience = By.xpath("//div[@id='1']//div[@id='multi'][2]/div/div[3]//input[@name='Experience of.1']");
//        By Experience_drpdwn =By.xpath("//body/div[7]//ul[@class='el-scrollbar__view el-select-dropdown__list']/li[@class='el-select-dropdown__item select-info hover']/span[ text()='"+"Consultation"+"']");
        driver.findElement(Experience).click();
        driver.findElement(Experience).sendKeys(experience);
        By price = By.xpath("//div[@id='1']//div[@id='multi'][2]/div/div[4]//input[@name='price for Consultation']");
//        By Experience_drpdwn =By.xpath("//body/div[7]//ul[@class='el-scrollbar__view el-select-dropdown__list']/li[@class='el-select-dropdown__item select-info hover']/span[ text()='"+"Consultation"+"']");
        driver.findElement(price).click();
        driver.findElement(price).sendKeys(priceval);


    }
}
