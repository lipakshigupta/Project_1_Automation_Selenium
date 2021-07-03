package Pages;

import org.openqa.selenium.By;

public class EducationQualification_WebElement {


    public By getQualification() {
        return Qualification;
    }

    public By getCollage() {
        return Collage;
    }

    public By getYrPassing() {
        return YrPassing;
    }

    public By getNextBtnEdu() {
        return NextBtnEdu;
    }

    public By getBasicPage() {
        return BasicPage;
    }

    By Collage = By.name("Your college/univeristy 1");
    By YrPassing =By.name("Your educationcal year 1");

    public By getCollage2() {
        return Collage2;
    }

    public By getYrPassing2() {
        return YrPassing2;
    }

    public By getQualification2() {
        return Qualification2;
    }

    By Collage2 = By.name("Your college/univeristy 2");
    By YrPassing2 =By.name("Your educationcal year 2");
    By Qualification2 = By.name("Your qualification 2");
    By Qualification = By.name("Your qualification 1");
    By NextBtnEdu =By.xpath("//*[@id=\"wizardProfile\"]//button[@class=\"btn btn-next btn-wd btn-info\"]");
    By BasicPage = By.xpath("//*[@id=\"5\"]//h5");

    public By getSubEdu() {
        return SubEdu;
    }

    By SubEdu = By.xpath("//*[@id=\"multi\"]/div[4]/button[2]/i");

    public By getAddEdu() {
        return AddEdu;
    }

    By AddEdu = By.xpath("//*[@id=\"multi\"]/div[4]");
    }
