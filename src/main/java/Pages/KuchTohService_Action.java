package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KuchTohService_Action {
    WebDriver driver = null;
    WebDriverWait wait = null;
    long smallWait_seconds = 20;
    Login_WebElement lw = new Login_WebElement();
    KuchTohService_WebElement BW = new KuchTohService_WebElement();

    public KuchTohService_Action() {
        this.driver = BasePage.driver;
        wait = new WebDriverWait(this.driver, smallWait_seconds);
    }

    public void SelectAvailableForConsultant(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(BW.getAvailableConsultant_script());
   }

    public void SelectLookingForConsultant(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(BW.getLookingConsultant_script());
    }

    public void VerifyDocumentUploadPage(){
        By txt =  BW.getUploadDocumentPage();
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(txt)).getText();
        Assert.assertTrue(text.equals("Document proofs"));

    }
}
