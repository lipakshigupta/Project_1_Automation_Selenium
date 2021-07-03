package Step_Defination;

import Pages.BasePage;
import Pages.EducationQualification_Action;
import Pages.MedicalReg_Action;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QualificationPage_StepDefination {

    EducationQualification_Action Ea = new EducationQualification_Action();
    MedicalReg_Action Ma = new MedicalReg_Action();

    @When("^User enter collage name (.*)$")
    public void Enter_collageName(String colg) throws Throwable {
        Ea.Enter_Collage(colg);
    }
    @When("^User enter Qualification Details$")
    public void Enter_QualificationDetails(DataTable data) throws Throwable {
        Ea.Enter_Collage(data.raw().get(0).get(0));
        Ea.Enter_qualification(data.raw().get(0).get(1));
        Ea.Enter_YrOfPassing(data.raw().get(0).get(2));
    }


    @When("^User enter Second Education Details$")
    public void Enter_QualificationDetailsSecond(DataTable data) throws Throwable {
        Ea.Enter_SecondEducationDetails(data.raw().get(0).get(0),data.raw().get(0).get(1),
                data.raw().get(0).get(2));
        Ma.ClickNextBtn();
    }


    @When("^User enter year of passing (.*)$")
    public void Enter_YrOfPassing(String yr) throws Throwable {
        Ea.Enter_YrOfPassing(yr);
    }

    @Then("^Verify User lands on Basic details page$")
    public void VerifyBasicPage() throws Throwable {
        Ea.VerifyBasicPage();
    }


    @When("^User enter Second Education Details (.*),(.*),(.*)$")
    public void EnterSecondEdu(String quali,String colg, String y) throws Throwable {
        Ea.Enter_SecondEducationDetails(quali,colg,y);
        BasePage.deadWait(5000);
    }

    @When("^User click on add education field$")
    public void AddEducation() throws Throwable {
        Ea.AddEducation();
    }
    @When("^User click on Sub education field")
    public void SubEducation() throws Throwable {
        Ea.SubEducation();
    }

    @When("^User Verify second qualification details not present$")
    public void VerifyNotPresent() throws Throwable {
        Ea.VerifyNotPresent();
    }

}
