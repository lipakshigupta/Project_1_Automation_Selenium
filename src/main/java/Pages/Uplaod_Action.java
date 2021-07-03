package Pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Uplaod_Action {

    WebDriver driver = null;
    WebDriverWait wait = null;
    long smallWait_seconds = 20;
    Login_WebElement lw = new Login_WebElement();

    public Uplaod_Action() {
        this.driver = BasePage.driver;
        wait = new WebDriverWait(this.driver, smallWait_seconds);
    }

    public void UplaodFiles(String frameName, String path){
//        driver.findElement(By.xpath("//label[text()='Photo ID proof ']/following-sibling::div//input[2]")).sendKeys("C://Users//Kislaye Raj//Pictures//Untitled.png");
//        driver.findElement(By.xpath("//label[text()=' Photo ']/following-sibling::div//input[2]")).sendKeys("C://Users//Kislaye Raj//Pictures//Untitled.png");
//        driver.findElement(By.xpath("//label[contains(text(),'Registration proof for')]/following-sibling::div//input[2]")).sendKeys("C://Users//Kislaye Raj//Pictures//Untitled.png");
//        driver.findElement(By.xpath("//label[contains(text(),'Degree/Certificate proof of')]/following-sibling::div//input[2]")).sendKeys("C://Users//Kislaye Raj//Pictures//Untitled.png");
//        driver.findElement(By.xpath("//label[contains(text(),'Degree/Certificate proof')]/following-sibling::div//input[2]")).sendKeys("C://Users//Kislaye Raj//Pictures//Untitled.png");

        BasePage.deadWait(5000);
        if (frameName.equals("Photo")) driver.findElement(By.xpath("//label[text()=' "+frameName.trim()+" ']/following-sibling::div//input[2]")).sendKeys(path.trim());
        else driver.findElement(By.xpath("//label[contains(text(),'"+frameName.trim()+"')]/following-sibling::div//input[2]")).sendKeys(path.trim());
        BasePage.deadWait(5000);
        //System.out.println("Done");
    }

    public void clickFinish() throws Throwable {
        driver.findElement (By.xpath("//*[@id='wizardProfile']//button[@class ='btn btn btn-info btn-wd btn-default']")).click();
    }

    public void clickOkFinish() throws Throwable {
        driver.findElement (By.xpath("//button[@class=\"swal2-confirm swal2-styled\"]")).click();
    }

    public void VerifyMessageSucess() throws Throwable {
     String verifymessage  = driver.findElement (By.xpath("//*[@id=\"swal2-content\"]")).getText();
     Assert.assertEquals(verifymessage,"You have been onboarded now, lets start with providing the services!");
    }
}
