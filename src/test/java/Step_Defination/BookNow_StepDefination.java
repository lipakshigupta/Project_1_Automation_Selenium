package Step_Defination;

import Pages.BasePage;
import Pages.BasicDetails_Action;
import Pages.BookNow_Action;
import Pages.DataBaseUtility;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookNow_StepDefination {
    BookNow_Action Ba = new BookNow_Action();

    @Then("^User Search Consultant$")
    public void EnterSearchConsultant() throws Throwable {
        Ba.EnterDataToEst();
        Ba.EnterDataTospec();
        Ba.Enterservice();
    }

    @And("^User click on search Button$")
    public void ClickOnSearch() throws Throwable {
        Ba.ClickOnSearch();
    }

    @And("^User Click on BookNow$")
    public void ClickOnBook() throws Throwable {
        Ba.ClickOnBookNow();
    }

    @And("^User Verify Specialization Error message$")
    public void VerifySpeMessage() throws Throwable {
        Ba.VerifySpecMesg();
    }

    @And("^User Verify Establishment Error message$")
    public void VerifyEstMessage() throws Throwable {
        Ba.VerifyEstMesg();
    }

    @And("^User Verify Service field Error message$")
    public void VerifySerMessage() throws Throwable {
        Ba.VerifySerMesg();
    }

    @And("^User Verify able to click on More Detials$")
    public void VerifyBook() throws Throwable {
        Ba.clickonMoreDetails();
    }

    @And("^User Book consultant from calendar(.*)$")
    public void BookCalendar(String date) throws Throwable {
        Ba.BookDeatils(date.trim());
    }

    @And("^User Verify calendar$")
    public void VerifyCal() throws Throwable {
        Ba.VerifyCal();
    }


    @Then("User Cancel Booking (.*)")
    public void userCancelBooking(String text) throws Throwable {
        Ba.CancelBooking(text);
    }
    @Then("Verify Booking is cancelled")
    public void VerifyCancelBooking() throws Throwable {
        Ba.VerifyCancelBooking();
    }

    @Given("^User Clean Otp for Mobile Number (.*)$")
    public void userCleanOtpForMobileNumber(String mobile) {
        String query = "Delete from where='"+mobile.trim()+"'";
        DataBaseUtility da = new DataBaseUtility();
        da.readData(query);
    }

    @Given("User re-navigate to KuchToh application")
    public void userReNavigateToKuchTohApplication() {
        BasePage.driver.get("http://localhost:42000/auth/register");
    }
}
