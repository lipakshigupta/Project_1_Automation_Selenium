package Step_Defination;

import Pages.BasePage;
import Pages.DataBaseUtility;
import Pages.Login_Action;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class SignUp_StepDefination extends  BasePage{
//    WebDriver driver = null;
    Login_Action coj= null;
    DataBaseUtility db= null;

    //static WebDriver driver;

    @Given("^User navigate to KuchToh application$")
    public void navigate_to_application() throws Throwable {
        coj = new Login_Action(driver);


    }
    @Given("^Delete User details for the username (.*)$")
    public void delete(String UserName){
        db = new DataBaseUtility();
        String query = "Delete FROM public.users where name = '"+UserName.trim()+"'";
        db.readData(query);

    }


    @When("^User Enter UserName (.*)$")
    public void Enter_UserName(String usrname) throws Throwable {
        coj.enter_UserName(usrname);
        System.out.println("UserName");
    }

    @When("^User Enter Mobile Number (.*)$")
    public void Enter_Mobile_Number(String PhnNumber) throws Throwable {
        coj.enter_PhoneNumber(PhnNumber);
        System.out.println("MobileNumber");
    }
    @Then("^User Logout application$")
    public void Logout() throws Throwable {
        coj.Logout();
    }


    @When("^User Enter Password (.*)$")
    public void Enter_Password(String Pwd) throws Throwable {
        coj.enter_Password(Pwd);
        System.out.println("Password");
    }

    @When("^User Accept Term and conditions$")
    public void  Accept_Term_and_conditions() throws Throwable {
        coj.AcceptTermCondition();
        System.out.println("TermAndCondition");
        coj.click_GetStarted();
    }

    @Then("^Navigate to Next page$")
    public void Navigate_to_Next_page() throws Throwable {
        System.out.println("NextPage");
    }

    @Then("^Click on Get Started Button$")
    public void click_Getstarted() throws Throwable {
        coj.click_GetStarted();

    }
    @Then("^Verify User Get Error Message for password$")
    public void VerifyErrorMessagePwd() throws Throwable {
       coj.VerifyErrorMessagePwd();
    }
    @Then("^Verify User should get term condition error message$")
    public void VerifyErrorMessageTerm() throws Throwable {
        coj.VerifyErrorMessageTerm();
    }
    @Then("^Verify User should get basic qualification error message$")
    public void VerifyErrorMessageBasicQua() throws Throwable {
        coj.VerifyErrorMessageBasicQua();
    }
    @Then("^Verify User should get invalid phoneno error message$")
    public void VerifyErrorMessagePhn() throws Throwable {
        coj.VerifyErrorMessagePhn();
    }
    @Then("^Verify User should get username error message$")
    public void VerifyErrorMessageUser() throws Throwable {
        coj.VerifyErrorMessageUser();
    }

    @Then("^User Enter OTP(.*)$")
    public void EnterOTP(String value) throws Throwable {
        coj.EnterOTP(value);
        deadWait(3000);
        coj.VerifyOTP();
//        deadWait(5000);

    }

    @Then("^Click On verify OTP$")
    public void VerifyOTP() throws Throwable {
        coj.VerifyOTP();
        deadWait(2000);

    }

    @Then("^Verify User Land on BookNow Page$")
    public void VerifyBooKNowPage() throws Throwable {
        coj.verifyBookNowPage();
    }

    @Then("^Verify User Land on Next Page$")
    public void VerifyPage() throws Throwable {
        coj.verifyPage();
    }

    @When("^User Enter Basic Qualification$")
    public void EnterBasicQualification() throws Throwable {
        coj.EnterBasicQualification();
//        coj.AcceptTermCondition();
//        System.out.println("TermAndCondition");
//        coj.click_GetStarted();
    }

    @Then("^User should Land on medical registration page$")
    public void VerifyMedicalRegPage() throws Throwable {
        BasePage.deadWait(5000);
        coj.VerifyMedicalRegPage();
    }

    @When("^User Enters Registration Details as Below$")
    public void registrationDetails(DataTable data){
        coj.enter_UserName(data.raw().get(0).get(0));
        System.out.println("UserName");
        coj.enter_PhoneNumber(data.raw().get(0).get(1));
        System.out.println("MobileNumber");
        coj.enter_Password(data.raw().get(0).get(2));
        System.out.println("MobileNumber");
        coj.EnterBasicQualification();
//        /coj.Qualification();
        coj.AcceptTermCondition();
        System.out.println("TermAndCondition");
        coj.click_GetStarted();
    }

    }
