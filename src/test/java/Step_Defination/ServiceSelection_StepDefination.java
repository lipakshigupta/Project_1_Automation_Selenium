package Step_Defination;

import Pages.KuchTohService_Action;
import cucumber.api.java.en.When;

public class ServiceSelection_StepDefination {
    KuchTohService_Action Ka = new KuchTohService_Action();
    @When("^User select Available for consultant$")
    public void SelectAvailConsultant() throws Throwable {
        Ka.SelectAvailableForConsultant();
    }

    @When("^User select Looking for consultant$")
    public void SelectLookingConsultant() throws Throwable {
        Ka.SelectLookingForConsultant();
    }

    @When("^Verify user lands on Document upload page$")
    public void VerifyDocumentUploadPage() throws Throwable {
        Ka.VerifyDocumentUploadPage();
    }
}
