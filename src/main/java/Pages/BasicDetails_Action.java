package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicDetails_Action {
    WebDriver driver = null;
    WebDriverWait wait = null;
    long smallWait_seconds = 20;
    Login_WebElement lw = new Login_WebElement();
    BasicDetails_WebElement BW = new BasicDetails_WebElement();

    public BasicDetails_Action() {
        this.driver = BasePage.driver;
        wait = new WebDriverWait(this.driver, smallWait_seconds);
    }

    public void EnterBasicDetails(String dob, String e){
        By Dob = BW.getDOB();
        By email = BW.getEmail();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(gender)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Dob)).sendKeys(dob);
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(e);
    }

    public void AllEnterBasicDetails(String dob, String e,String abt){
//        By gender = BW.getGenderFemale();
        By Dob = BW.getDOB();
        By email = BW.getEmail();
        By about = BW.getAbout();
        String selectFemale = "document.getElementsByClassName('form-check form-check-radio form-check-inline')[1].firstElementChild.firstElementChild.click()";
        JavascriptExecutor js = (JavascriptExecutor)BasePage.driver;
        js.executeScript(selectFemale);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(gender)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(about)).sendKeys(abt);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Dob)).sendKeys(dob);
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(e);


    }

    public void DOBErrorMesg(){
        By DobMsg = BW.getDobErr();
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(DobMsg)).getText();
        Assert.assertTrue(text.equals("The Date of birth field is required"));
    }

    public void EmailErrorMesg(){
        By EmailMsg = BW.getEmailErr();
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(EmailMsg)).getText();
        Assert.assertTrue(text.equals("The email field is required"));
    }

    public void VerifyServicePage(){
        By page = BW.getServicePg();
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(page)).getText();
        Assert.assertTrue(text.equals("KuchToh Services *"));
    }
}
