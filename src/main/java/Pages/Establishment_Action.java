package Pages;

import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Establishment_Action {

        WebDriver driver = null;
        WebDriverWait wait = null;
        long smallWait_seconds = 20;
        Login_WebElement lw = new Login_WebElement();
        Establishment_WebElement mw = new Establishment_WebElement();
        BookNow_WebElement Bw = new BookNow_WebElement();

        public Establishment_Action() {
            this.driver = BasePage.driver;
            wait = new WebDriverWait(this.driver, smallWait_seconds);
        }

        public void Enter_EstNamw(String name){
            By nameXpath = mw.getEstName();
            wait.until(ExpectedConditions.visibilityOfElementLocated(nameXpath)).sendKeys(name);
        }

    public void Enter_EstAdd(String add){
        By nameXpath = mw.getEstAdd();
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameXpath)).sendKeys(add);
        BasePage.deadWait(2000);
        driver.findElement(By.xpath("//*[@id=\"addressSuggestionUl\"][1]")).click();
//        assert (text.equals("The Registration council1 field is required"));
    }

    public void VerifyPage(){
            BasePage.deadWait(5000);
        String text = driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText();
        Assert.assertTrue(text.equals("Congratulations"));
    }


    public void ClickOK(){
        BasePage.deadWait(2000);
        driver.findElement(By.xpath("//button[@class=\"swal2-confirm swal2-styled\"]")).click();
    }

    public void Enter_EstYr(String yr){
        By nameXpath = mw.getEstYr();
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameXpath)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameXpath)).sendKeys(yr);
    }

    public void VerifyDashboardPage(){
        BasePage.deadWait(5000);
        String text = driver.findElement(By.xpath("//*[@id=\"__layout\"]//div[1]/h2")).getText();
        Assert.assertTrue(text.equals("Check your Bookings\n" + "Calendar"));
    }

}
