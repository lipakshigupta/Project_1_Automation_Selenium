package Step_Defination;

import Pages.Calendar_Action;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Calendar_StepDefinations {
    Calendar_Action Ca = new Calendar_Action();

    @And("User Click on Calendar")
    public void userClickOnCalendar() {
       Ca.ClickonCalendar();
    }

    @Then("User Verify month on calendar")
    public void userVerifyMonthOnCalendar() {
        Ca.ClickonCalendar_Month();
    }

    @And("User Verify week on calendar")
    public void userVerifyWeekOnCalendar() {
        Ca.ClickonCalendar_week();
    }

    @And("User Verify day on calendar")
    public void userVerifyDayOnCalendar() {
        Ca.ClickonCalendar_day();
    }
}
