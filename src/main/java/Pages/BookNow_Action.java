package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookNow_Action {
    WebDriver driver = null;
    WebDriverWait wait = null;
    long smallWait_seconds = 20;
    Login_WebElement lw = new Login_WebElement();
    BookNow_WebElement BW = new BookNow_WebElement();

    public BookNow_Action() {
        this.driver = BasePage.driver;
        wait = new WebDriverWait(this.driver, smallWait_seconds);
    }

    public void ClickOnBookNow(){
        By btn = BW.getBookNow();
        wait.until(ExpectedConditions.visibilityOfElementLocated(btn)).click();
    }

    public void VerifySpecMesg(){
        By err = BW.getSpecErr();
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(err)).getText();
        Assert.assertTrue(text.equals("The specialization field is required"));
    }


    public void VerifyEstMesg(){
        By err = BW.getYourEstErr();
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(err)).getText();
        Assert.assertTrue(text.equals("The establishment field is required"));
    }

    public void VerifySerMesg(){
        By err = BW.getServiceErr();
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(err)).getText();
        Assert.assertTrue(text.equals("The service field is required"));
    }

    public void EnterDataTospec(){
        By btn = BW.getSpec();
        By Spec = BW.getSpecText();
        wait.until(ExpectedConditions.visibilityOfElementLocated(btn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Spec)).click();
    }

    public void EnterDataToEst(){
        By btn = BW.getYourEst();
        By Est_new = By.xpath("//body/div[3]//ul/li[1]/span");
//                By.xpath("//body/div[3]//ul[@class='el-scrollbar__view el-select-dropdown__list']/li[@class='el-select-dropdown__item select-info hover']/span");
        wait.until(ExpectedConditions.visibilityOfElementLocated(btn)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(Est_new)).click();
    }

    public void Enterservice(){
        By btn = BW.getService();
        By sevtex = BW.getServiceText();
        wait.until(ExpectedConditions.visibilityOfElementLocated(btn)).click();
        BasePage.deadWait(2000);
        driver.findElement(By.xpath("//body/div[5]//ul[1]/li[1]/span")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
//                ("//*[@class='el-scrollbar__view el-select-dropdown__list']" +
//                        "/li[@class='el-select-dropdown__item select-info hover']/span[1]"))).click();
    }

    public void ClickOnSearch(){
        By btn = BW.getSearchBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(btn)).click();
    }
    public void clickonMoreDetails() {
        By btn = By.xpath("//button[@class='btn btn-info']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(btn)).click();

    }
    public void CancelBooking(String text){
        Boolean x = driver.findElement(By.xpath("//a[@class='fc-day-grid-event fc-h-event fc-event fc-start fc-end event-green fc-draggable']")).isDisplayed();
        BasePage.deadWait(3000);
        if (x.equals(false)) {
            driver.findElement(By.xpath("//button[@aria-label='next']")).click();
        }
        driver.findElement(By.xpath("//a[@class='fc-day-grid-event fc-h-event fc-event fc-start fc-end event-green fc-draggable']")).click();
        BasePage.deadWait(5000);
        String  txt = driver.findElement(By.xpath("//div[@id='myModal___BV_modal_body_']")).getText();
        Assert.assertTrue(text.contains((txt.split("\\n"))[2]));
        driver.findElement(By.xpath("//div[@id='myModal___BV_modal_body_']/button")).click();
    }

    public void VerifyCal(){
        Boolean x = driver.findElement(By.xpath("//a[@class='fc-day-grid-event fc-h-event fc-event fc-start fc-end event-green fc-draggable']")).isDisplayed();
//          Integer value =driver.findElements(By.xpath("//a[@class='fc-day-grid-event fc-h-event fc-event fc-start fc-end event-green fc-draggable']")).size();
        BasePage.deadWait(3000);
        if (x.equals(false)) {
            driver.findElement(By.xpath("//button[@aria-label='next']")).click();
        }
        driver.findElement(By.xpath("//a[@class='fc-day-grid-event fc-h-event fc-event fc-start fc-end event-green fc-draggable']")).click();
        BasePage.deadWait(5000);
        String BookingData= driver.findElement(By.id("myModal___BV_modal_body_")).getText();
        BasePage.deadWait(3000);
    }



    public void VerifyCancelBooking(){
        BasePage.deadWait(5000);
        Integer x = driver.findElements(By.xpath("//a[@class='fc-day-grid-event fc-h-event fc-event fc-start fc-end event-green fc-draggable']")).size();
        Assert.assertTrue(x.equals(0));
    }

        public void BookDeatils(String Dateval) {
            By timeinput = By.xpath("//input[@name='Terms and Conditions']");
            driver.findElement(timeinput).sendKeys("");
//            driver.findElement(timeinput).sendKeys("2021-07-03 00:00");
            driver.findElement(timeinput).sendKeys(Dateval);
            driver.findElement(By.xpath("/html/body//div[@class='modal-content']//div[4]/button[2]")).sendKeys(Keys.ENTER);
            BasePage.deadWait(3000);
            driver.findElement(By.xpath("//div[@class='text-center ']//button[@class='btn btn-info'][2]")).sendKeys(Keys.ENTER);
            BasePage.deadWait(8000);

        }
    }

