package Pages;

import org.openqa.selenium.By;

public class Login_WebElement {

    public By getPhoneNumber_xpath() {
        return phoneNumber_xpath;
    }

    public By getPwd_xpath() {
        return pwd_xpath;
    }

    public By getSubmit_xpath() {
        return submit_xpath;
    }

    public By getVerifyPhnError() {
        return verifyError;
    }

    public By getUserName() {
        return UserName;
    }
    public By getQualification() {
        return Qualification;
    }
    public By getTermCondition() {
        return TermCondition;
    }

    By UserName = By.name("full name");
    By Qualification = By.xpath("//*[@id=\"__layout\"]//input[@class=\"el-input__inner\"]");
    By TermCondition = By.name("Terms and Conditions");

    By submit_xpath=By.xpath("//button[@type=\"submit\"]");
    By verifyError = By.xpath("//*[@id=\"__layout\"]//label");
    By phoneNumber_xpath = By.name("phone number");
    By pwd_xpath = By.name("password");

    public By getLogout() {
        return Logout;
    }

    By Logout = By.xpath("//*[@id=\"__layout\"]//b");
}
