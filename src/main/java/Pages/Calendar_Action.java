package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar_Action {
    WebDriver driver = null;
    WebDriverWait wait = null;
    long smallWait_seconds = 20;
    Login_WebElement lw = new Login_WebElement();
    Calendar_Webelement Cw = new Calendar_Webelement();

    public Calendar_Action() {
        this.driver = BasePage.driver;
        wait = new WebDriverWait(this.driver, smallWait_seconds);
    }

    public void ClickonCalendar(){
        By cal = Cw.getCalendar();
        wait.until(ExpectedConditions.visibilityOfElementLocated(cal)).click();
    }

    public void ClickonCalendar_Month(){
        By calMon = Cw.getCal_month();
        wait.until(ExpectedConditions.visibilityOfElementLocated(calMon)).click();
    }

    public void ClickonCalendar_week(){
        By calWeek = Cw.getCal_week();
        wait.until(ExpectedConditions.visibilityOfElementLocated(calWeek)).click();
    }

    public void ClickonCalendar_day(){
        By calDay = Cw.getCal_day();
        wait.until(ExpectedConditions.visibilityOfElementLocated(calDay)).click();
    }
}
