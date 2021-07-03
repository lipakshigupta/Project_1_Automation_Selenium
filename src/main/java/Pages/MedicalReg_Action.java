package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MedicalReg_Action {
    WebDriver driver = null;
    WebDriverWait wait = null;
    long smallWait_seconds = 20;
    Login_WebElement lw = new Login_WebElement();
    MedicalRegistration_WebElement mw = new MedicalRegistration_WebElement();

    public MedicalReg_Action() {
        this.driver = BasePage.driver;
        wait = new WebDriverWait(this.driver, smallWait_seconds);
    }

    public void Enter_RegName(String number){
        By no = mw.getRegNumber();
//        driver.findElement(no).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(no)).sendKeys(number);
    }

    public void Enter_RegCouncil(String RegCouncil){
        By council = mw.getRegCouncil();
        wait.until(ExpectedConditions.visibilityOfElementLocated(council)).click();
        By council_list_xpath = By.xpath("//ul[@class='el-scrollbar__view el-select-dropdown__list']/li/span[text()='"+RegCouncil+"']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(council_list_xpath)).click();
    }

    public void Enter_RegYr(String yr){
        By year = mw.getRegYr();
        wait.until(ExpectedConditions.visibilityOfElementLocated(year)).sendKeys(yr);
    }

    public void ClickNextBtn(){
        By btn = mw.getNextBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(btn)).click();
    }

    public void VerifyEduPage(){
        By Vpage = mw.getEduPage();
        String val = wait.until(ExpectedConditions.visibilityOfElementLocated(Vpage)).getText();
        Assert.assertTrue(val.equals("Educational qualification"));
    }

    public void VerifyRegyrErr(){
        By errm = mw.getErrRegYr();
        String text = driver.findElement(errm).getText();
        assert (text.equals("The Registration year1 field is required"));
    }
    public void VerifyRegErr(){
        By errm = mw.getErrRegNumber();
        String text = driver.findElement(errm).getText();
        assert (text.equals("The Registration no.1 field is required"));
    }
    public void VerifyRegcouncilErr(){
        By errm = mw.getErrRegCouncil();
        String text = driver.findElement(errm).getText();
        assert (text.equals("The Registration council1 field is required"));
    }

}
