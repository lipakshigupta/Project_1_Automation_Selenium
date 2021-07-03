package Pages;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Action {
    WebDriver driver = null;
    WebDriverWait wait = null;
    long smallWait = 500;
    Login_WebElement lw = new Login_WebElement();

    public Login_Action(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, smallWait);
    }

    public void enter_UserName(String userName) {
        By UserName = lw.getUserName();
        wait.until(ExpectedConditions.visibilityOfElementLocated(UserName)).sendKeys(userName);

    }

    public void enter_PhoneNumber(String PhnNumber) {
        By phnNumber = lw.phoneNumber_xpath;
        wait.until(ExpectedConditions.visibilityOfElementLocated(phnNumber)).sendKeys(PhnNumber);
    }

    public void Logout() {
        By Lg = lw.getLogout();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Lg)).click();
    }

    public void enter_Password(String pwd) {
        By pwd_xpath = lw.pwd_xpath;
        wait.until(ExpectedConditions.visibilityOfElementLocated(pwd_xpath)).sendKeys(pwd);

    }

    public void click_GetStarted() {
        By submit_xpath = lw.submit_xpath;
        wait.until(ExpectedConditions.visibilityOfElementLocated(submit_xpath)).click();
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){

        }

    }
    public void VerifyErrorMessagePwd() {
        By ErrorMsg = lw.verifyError;
        String text = driver.findElement(ErrorMsg).getText();
        assert (text.equals("The password field must be at least 5 characters"));
    }
    public void VerifyErrorMessageTerm() {
//        By ErrorMsg = lw.verifyError;
        BasePage.deadWait(3000);
        String text = driver.findElement(By.xpath("//*[@id=\"__layout\"]//span[@class=\"danger\"]")).getText();
        assert (text.equals("The Terms and Conditions field is required"));
    }
    public void VerifyErrorMessageBasicQua() {
        By ErrorMsg = lw.verifyError;
        String text = driver.findElement(ErrorMsg).getText();
        assert (text.equals("The basic qualification field is required"));
    }
    public void VerifyErrorMessagePhn() {
        By ErrorMsg = lw.verifyError;
        String text = driver.findElement(ErrorMsg).getText();
        assert (text.equals("The phone number field must be at least 10 characters"));
    }
    public void VerifyErrorMessageUser() {
        driver.findElement(By.xpath("//*[@class=\"toasted-container top-center\"]")).isDisplayed();
    }


    public void verifyBookNowPage() {
//        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='content']/div[1]/div/h2")));
        String text = driver.findElement(By.xpath("//div[@class='content']/div[1]/div/h2")).getText();
        Assert.assertTrue(text.equals("Hire Covid Staff\nBook now"));
    }

    public void verifyPage() {
        String text = driver.findElement(By.xpath("//*[@id=\"__layout\"]//b")).getText();
        Assert.assertTrue(text.equals("Logout"));
    }


    public void EnterBasicQualification() {
        By EnterBasicQu = lw.getQualification();
        wait.until(ExpectedConditions.visibilityOfElementLocated(EnterBasicQu)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[2]/span[\"Dentist\"]"))).click();
    }

    public void AcceptTermCondition() {
        By AccepTerm = lw.getTermCondition();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AccepTerm)).click();
    }

    public void VerifyMedicalRegPage() {
        String text = driver.findElement(By.xpath("//*[@id=\"1\"]/div/h5")).getText();
        Assert.assertTrue(text.equals("Medical registration"));
    }

    public void EnterOTP(String phonenumber){
        DataBaseUtility db = new DataBaseUtility();
        String query = "Select otp from otps where phone = '"+phonenumber.trim()+"'";
        String a = db.readData(query).toString();
//        String a = "0781";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__layout\"]//input[@name=\"referalcode\"]"))).sendKeys(a);
    }
    public void VerifyOTP(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__layout\"]//button[@class=\"btn mb-3 btn-block btn-info btn-lg\"]"))).click();
    }
}