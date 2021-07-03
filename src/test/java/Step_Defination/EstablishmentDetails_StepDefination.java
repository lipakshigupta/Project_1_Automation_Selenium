package Step_Defination;

import Pages.BookNow_WebElement;
import Pages.Establishment_Action;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EstablishmentDetails_StepDefination {

Establishment_Action Ea = new Establishment_Action();
BookNow_WebElement ba = new BookNow_WebElement();

    @When("^User enter Establishment Details$")
    public void EnterEstablishmentDetails(DataTable data) throws Throwable {
//        Ea.Enter_EstAdd(data.raw().get(0).get(0));
        Ea.Enter_EstYr(data.raw().get(0).get(1));
        Ea.Enter_EstNamw(data.raw().get(0).get(0));
//        MA.ClickNextBtn();
    }

    @When("^User enter Address (.*)$")
    public void EnterAdd(String add) throws Throwable {
        Ea.Enter_EstAdd(add);



    }

    @When("^Verify User get Congratulation page$")
    public void VerfyPage() throws Throwable {
        Ea.VerifyPage();

    }

    @When("^Click ok on Congratulation page$")
    public void ClickOK() throws Throwable {
        Ea.ClickOK();

    }


    @Then("Verify User Land on Dashboard page")
    public void verifyUserLandOnDashboardPage() {
        Ea.VerifyDashboardPage();
    }
}
