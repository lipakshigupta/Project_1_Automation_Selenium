package Step_Defination;

import Pages.BasePage;
import Pages.DataBaseUtility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AdminPanel_StepDefination {


    @Then("Click on Admin Panel")
    public void clickOnAdminPanel() {
     WebElement xpth = BasePage.driver.findElement(By.xpath("//*[@class=\"sidebar-wrapper ps ps--active-x\"]"));
        Actions action = new Actions(BasePage.driver);
        action.moveToElement(xpth).click().perform();
//        BasePage.driver.findElement(By.xpath("//a[@class=\"nuxt-link-active\"]")).click();
//        BasePage.deadWait(8000);
    }

    @Then("Click on Booking Details")
    public void clickOnBookingDetails() {
//        BasePage.driver.findElement(By.xpath("//a[@class='active nuxt-link-active']")).click();
        Actions action = new Actions(BasePage.driver);
        action.moveToElement(BasePage.driver.findElement(By.xpath("//ul[@class='nav']"))).sendKeys(Keys.ARROW_DOWN).build().perform();
        BasePage.deadWait(2000);
        JavascriptExecutor js = (JavascriptExecutor) BasePage.driver;
        try {
            js.executeScript("document.getElementsByClassName('sidebar-wrapper ps ps--active-y')[0].scrollBy(0,100)");
        }catch (Exception ex)
        {
//      Supress Error
        }
        BasePage.deadWait(2000);
//        action.moveToElement(BasePage.driver.findElement(By.xpath("//div[@class='sidebar-wrapper ps ps--active-y']/ul/li[7]/a"))).click().perform();
        BasePage.driver.findElement(By.xpath("//div[@class='sidebar-wrapper ps ps--active-y']/ul/li[4]/a")).click();

        BasePage.deadWait(8000);

    }

    @Then("Click on Admin Search Consultant")
    public void clickOnAdminSearchConsultant() {
//        BasePage.driver.findElement(By.xpath("//a[@class='active nuxt-link-active']")).click();
        Actions action = new Actions(BasePage.driver);
        action.moveToElement(BasePage.driver.findElement(By.xpath("//ul[@class='nav']"))).sendKeys(Keys.ARROW_DOWN).build().perform();
        BasePage.deadWait(2000);
        JavascriptExecutor js = (JavascriptExecutor) BasePage.driver;
        try {
            js.executeScript("document.getElementsByClassName('sidebar-wrapper ps ps--active-y')[0].scrollBy(0,280)");
        }catch (Exception ex)
        {
//      Supress Error
        }
        BasePage.deadWait(2000);
//        action.moveToElement(BasePage.driver.findElement(By.xpath("//div[@class='sidebar-wrapper ps ps--active-y']/ul/li[7]/a"))).click().perform();
        BasePage.driver.findElement(By.xpath("//div[@class='sidebar-wrapper ps ps--active-y']/ul/li[7]/a")).click();

        BasePage.deadWait(8000);
        
    }

    @And("Verify Search Consultant")
    public void verifySearchConsultant() {
        Integer Count = BasePage.driver.findElements(By.xpath("//table/tbody/tr")).size();
        List<String> UserID = new ArrayList<>();
        BasePage.driver.findElement(By.xpath("//html")).click();
        IntStream.rangeClosed(1,Count).boxed().collect(Collectors.toList()).forEach(i->{
                    String x = BasePage.driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td")).getText();
                    UserID.add(x);
                });


        DataBaseUtility da =  new
                DataBaseUtility();
        String Count_Db = da.readData("Select count(*) as otp from public.consultant_search_results");

        Assert.assertTrue(Count_Db.equals(Count.toString()));

    }

    @And("Verify Booking Details")
    public void verifyBookingDetails() {
        Integer Count = BasePage.driver.findElements(By.xpath("//table/tbody/tr")).size();
        List<String> UserID = new ArrayList<>();
        BasePage.driver.findElement(By.xpath("//html")).click();
        IntStream.rangeClosed(1,Count).boxed().collect(Collectors.toList()).forEach(i->{
            String x = BasePage.driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td")).getText();
            UserID.add(x);
        });


        DataBaseUtility da =  new
                DataBaseUtility();
        String Count_Db = da.readData("Select count(*) as otp from public.booking_services");

        Assert.assertTrue(Count_Db.equals(Count.toString()));

    }

    @And("Verify Booking Status")
    public void verifyBookingStaus() {
        Integer Count = BasePage.driver.findElements(By.xpath("//table/tbody/tr")).size();
        List<String> bookingStatus = new ArrayList<>();
        BasePage.driver.findElement(By.xpath("//html")).click();
        IntStream.rangeClosed(1,Count).boxed().collect(Collectors.toList()).forEach(i->{
            String x = BasePage.driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[11]")).getText();
            bookingStatus.add(x);
        });

        DataBaseUtility da =  new
                DataBaseUtility();
        String Count_Db = da.readData("Select count(*) as otp from public.booking_services where booking_status='Booked'");
        System.out.println(bookingStatus);
        String UICount = String.valueOf(Collections.frequency(bookingStatus,"Booked"));
        Assert.assertTrue(Count_Db.equals(UICount));
        String Count_Db_cancel = da.readData("Select count(*) as otp from public.booking_services where booking_status='Cancelled'");
        System.out.println(bookingStatus);
        String UICount_cancel = String.valueOf(Collections.frequency(bookingStatus,"Cancelled"));
        Assert.assertTrue(Count_Db_cancel.equals(UICount_cancel));


    }

    @Then("Click on Admin Details")
    public void clickOnAdminDetails() {
//        BasePage.driver.findElement(By.xpath("//a[@class='active nuxt-link-active']")).click();
        Actions action = new Actions(BasePage.driver);
        action.moveToElement(BasePage.driver.findElement(By.xpath("//ul[@class='nav']"))).sendKeys(Keys.ARROW_DOWN).build().perform();
        BasePage.deadWait(2000);

//        action.moveToElement(BasePage.driver.findElement(By.xpath("//div[@class='sidebar-wrapper ps ps--active-y']/ul/li[7]/a"))).click().perform();
        BasePage.driver.findElement(By.xpath("//div[@class='sidebar-wrapper ps ps--active-y']/ul/li[1]/a")).click();

        BasePage.deadWait(8000);

    }

    @And("Verify Admin User Count")
    public void verifyAdminUserCount() {

        Integer Count = BasePage.driver.findElements(By.xpath("//table[@class='table table-bordered table-hover table-striped table-dark']/tbody/tr")).size();
        System.out.println(Count);
        List<String> Users = new ArrayList<>();
        BasePage.driver.findElement(By.xpath("//html")).click();
        IntStream.rangeClosed(1,Count).boxed().collect(Collectors.toList()).forEach(i->{
            String x = BasePage.driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-striped table-dark']/tbody/tr[" + i + "]/td[1]")).getText();
            Users.add(x);
        });

        System.out.println(Users);

        DataBaseUtility da =  new
                DataBaseUtility();
        String Count_Db = da.readData("Select count(*) as otp from public.users");
        Assert.assertTrue(Count_Db.equals(Count.toString()));

    }

    @Then("verify Toggle disable")
    public void verifyToggleDisable() {
        DataBaseUtility da = new DataBaseUtility();
        BasePage.driver.findElement(By.xpath("//html")).click();
        String UserId = BasePage.driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-striped table-dark']/tbody/tr[1]/td[4]")).getText().split(",")[0].split(":")[1];
        String Beforetoggle = da.readData("Select enabled as otp from public.users where id='"+UserId+"'");
        BasePage.driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-striped table-dark']/tbody/tr[1]/td[1]//div[@class='bootstrap-switch-container']/span[@class='bootstrap-switch-label']")).click();
        BasePage.deadWait(5000);
        String Aftertoggle = da.readData("Select enabled as otp from public.users where id='"+UserId+"'");
        Assert.assertFalse(Beforetoggle.equals(Aftertoggle));

    }
}
