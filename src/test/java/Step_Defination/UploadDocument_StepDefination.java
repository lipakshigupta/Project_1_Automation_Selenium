package Step_Defination;

import Pages.BasePage;
import Pages.MedicalReg_Action;
import Pages.Uplaod_Action;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UploadDocument_StepDefination {

    Uplaod_Action Ua = new Uplaod_Action();
    MedicalReg_Action ma = new MedicalReg_Action();

    @When("^User Upload files$")
    public void UploadFile(DataTable table) throws Throwable {
        for(int i = 1; i<table.raw().size();i++){
            Ua.UplaodFiles(table.raw().get(i).get(0),table.raw().get(i).get(1));
        }
    }

    @When("^User click Finish$")
    public void finish() throws Throwable{
        Ua.clickFinish();
    }
    @Then("^User click ok on Finish popup$")
    public void OkFinishPopup() throws Throwable{
        BasePage.deadWait(2000);
        Ua.clickOkFinish();
    }

    @When("^Verify after finish user get successfull message$")
    public void SuccessfullMessage() throws Throwable{
        BasePage.deadWait(2000);
        Ua.VerifyMessageSucess();

    }

}
