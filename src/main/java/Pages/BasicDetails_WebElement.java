package Pages;
import org.openqa.selenium.By;

public class BasicDetails_WebElement {

    public By getGenderMale() {
        return GenderMale;
    }

    public By getGenderFemale() {
        return GenderFemale;
    }

    public By getGenderOther() {
        return GenderOther;
    }

    public By getAbout() {
        return About;
    }

    public By getDOB() {
        return DOB;
    }

    public By getEmail() {
        return Email;
    }

    public By getNextBtnBasic() {
        return NextBtnBasic;
    }

    public By getBasicDetailsPg() {
        return BasicDetailsPg;
    }

    By GenderMale = By.xpath("//*[@value = \"0\"]");
    By GenderFemale = By.xpath("//*[@value = \"1\"]");
    By GenderOther = By.xpath("//*[@value = \"2\"]");
    By About = By.xpath("//*[@name =\"email\"]");
    By DOB = By.xpath("//*[@id=\"5\"]//input[@class=\"el-input__inner\"]");
    By Email = By.xpath("//*[@id=\"5\"]//input[@name=\"email\"]");
    By NextBtnBasic = By.xpath("//*[@class =\"btn btn-next btn-wd btn-info\"]");
    By BasicDetailsPg = By.xpath("//*[@id=\"5\"]//h5");
    By DobErr = By.xpath("//*[@id=\"5\"]//label[2]");

    public By getDobErr() {
        return DobErr;
    }

    public By getEmailErr() {
        return EmailErr;
    }

    By EmailErr = By.xpath("//*[@id=\"5\"]//label[2]");

    public By getServicePg() {
        return servicePg;
    }

    By servicePg = By.xpath("//*[@id=\"7\"]/div/div[1]/div/h4");


}
