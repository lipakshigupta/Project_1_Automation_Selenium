package Step_Defination;

import Pages.BasePage;
import Pages.Login_Action;
import Pages.MedicalReg_Action;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MedicalRegistration_StepDefination  {

    MedicalReg_Action ma = new MedicalReg_Action();

    @When("^User enter Registration number (.*)$")
    public void Enter_RegName(String Regusrname) throws Throwable {
        ma.Enter_RegName(Regusrname);
    }
    @When("^User enter Registration council (.*)$")
    public void Enter_RegCouncil(String counil) throws Throwable {
        ma.Enter_RegCouncil(counil);
    }
    @When("^User enter Registration year (.*)$")
    public void Enter_RegYr(String yr) throws Throwable {
        ma.Enter_RegYr(yr);
    }

    @When("^User click on Next Button$")
    public void ClickNextBtn() throws Throwable {
        ma.ClickNextBtn();
    }

    @Then("^Verify User lands on Education page$")
    public void VerifyEduPage() throws Throwable {
        ma.VerifyEduPage();
    }

    @Then("^Verify User Get reg error message$")
        // Write code here that turns the phrase above into concrete actions
       public void VerifyRegErr() throws Throwable{
        ma.VerifyRegErr();
    }

    @Then("^Verify User Get Reg council error message$")
    public void VerifyRegcouncilErr() throws Throwable{
        ma.VerifyRegcouncilErr();
    }

    @Then("^Verify User Get Reg yr error message$")
        public void VerifyRegyrErr() throws Throwable{
        ma.VerifyRegyrErr();
        }

}
