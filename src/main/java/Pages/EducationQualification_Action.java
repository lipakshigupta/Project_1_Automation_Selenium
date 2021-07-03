package Pages;

import io.cucumber.messages.internal.com.google.protobuf.Internal;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EducationQualification_Action{

    WebDriver driver = null;
    WebDriverWait wait = null;
    long smallWait_seconds = 20;
    Login_WebElement lw = new Login_WebElement();
    EducationQualification_WebElement Ew = new EducationQualification_WebElement();

    public EducationQualification_Action() {
        this.driver = BasePage.driver;
        wait = new WebDriverWait(this.driver, smallWait_seconds);
    }

    public void Enter_qualification(String quali){
        By xQua = Ew.getQualification();
        wait.until(ExpectedConditions.visibilityOfElementLocated(xQua)).sendKeys(quali);

    }

    public void Enter_YrOfPassing(String YrOfPassing){
        By Yr = Ew.getYrPassing();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Yr)).sendKeys(YrOfPassing);

    }

    public void Enter_Collage(String collage){
        By col = Ew.getCollage();
        wait.until(ExpectedConditions.visibilityOfElementLocated(col)).sendKeys(collage);

    }


    public void Enter_SecondEducationDetails(String quali,String collg,String yr){
        By xQua = Ew.getQualification2();
        By yrs = Ew.getYrPassing2();
        By col = Ew.getCollage2();
        wait.until(ExpectedConditions.visibilityOfElementLocated(xQua)).sendKeys(quali);
        wait.until(ExpectedConditions.visibilityOfElementLocated(yrs)).sendKeys(yr);
        wait.until(ExpectedConditions.visibilityOfElementLocated(col)).sendKeys(collg);

    }
//
//    public void Enter_YrOfPassing(String YrOfPassing){
//        By Yr = Ew.getYrPassing();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(Yr)).sendKeys(YrOfPassing);
//
//    }
//
//    public void Enter_Collage(String collage){
//        By col = Ew.getCollage();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(col)).sendKeys(collage);
//
//    }

    public void VerifyBasicPage(){
        By BasPg = Ew.getBasicPage();
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(BasPg)).getText();
        Assert.assertTrue(text.equals("Basic details"));

    }

    public void AddEducation(){
        By AddEdu = Ew.getAddEdu();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddEdu)).click();

    }

    public void SubEducation(){
        By SubEdu = Ew.getSubEdu();
        wait.until(ExpectedConditions.visibilityOfElementLocated(SubEdu)).click();

    }

    public void VerifyNotPresent(){
        By qu2 = Ew.Qualification2;
        Integer x = driver.findElements(qu2).size();
        Assert.assertTrue(x.equals(0));

    }

}
