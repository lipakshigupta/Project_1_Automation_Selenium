package Step_Defination;

import Pages.ConsultantServices_Action;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConsultantBooking_StepDefination {
    ConsultantServices_Action CA = new ConsultantServices_Action();

    @Then("^User enters Consultant page Data$")
    public void EnterConsultantdetails(DataTable data) throws Throwable {
        CA.EnterAddress(data.raw().get(0).get(0), data.raw().get(0).get(1),
                data.raw().get(0).get(2),data.raw().get(0).get(3),data.raw().get(0).get(4),data.raw().get(0).get(5),
                data.raw().get(0).get(6),data.raw().get(0).get(7));

    }
}
