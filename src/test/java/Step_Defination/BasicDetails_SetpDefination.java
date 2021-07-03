package Step_Defination;

import Pages.BasicDetails_Action;
import Pages.MedicalReg_Action;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class BasicDetails_SetpDefination {

BasicDetails_Action Ba = new BasicDetails_Action();

    @When("^User enter basic Details$")
    public void EnterBasicDetails(DataTable data) throws Throwable {
        Ba.EnterBasicDetails(data.raw().get(0).get(0),data.raw().get(0).get(1));
//        MA.ClickNextBtn();

    }

    @When("^User enter All basic Details$")
    public void AllEnterBasicDetails(DataTable data) throws Throwable {
        Ba.AllEnterBasicDetails(data.raw().get(0).get(0),data.raw().get(0).get(1),data.raw().get(0).get(2));
    }

    @When("^Verify user gets DOB error message$")
    public void VerifyDOBerror() throws Throwable {
        Ba.DOBErrorMesg();

    }


    @When("^Verify User get email error message$")
    public void VerifyEmailerror() throws Throwable {
        Ba.EmailErrorMesg();

    }

    @When("^Verify user lands on service page$")
    public void VerifyServicePage() throws Throwable {
        Ba.VerifyServicePage();
    }


}
