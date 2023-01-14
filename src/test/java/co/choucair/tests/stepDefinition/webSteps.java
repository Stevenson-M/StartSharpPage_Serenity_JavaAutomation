package co.choucair.tests.stepDefinition;

import co.choucair.pageObjects.BusinessUnitsPage;
import co.choucair.pageObjects.LoginPage;
import co.choucair.pageObjects.MeetingsPage;
import co.choucair.utils.WebData;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import org.choucair.reporting.Reporter;
import org.junit.Assert;
import co.choucair.pageObjects.MainDashPage;


public class webSteps {
    private MainDashPage mainDashPage;
    private LoginPage loginPage;
    private BusinessUnitsPage businessUnitsPage;
    private MeetingsPage meetingsPage;



    @Given("I am on StartSharp login page")
    public void iAmOnStartSharpLoginPage() {
        Reporter.info("I am on StartSharp login page");
        loginPage = new LoginPage(webHooks.getDriver());
    }

    @And("I login with the admin credentials")
    public void iLoginWithTheAdminCredentials() {
        loginPage.clickSingInButtonGoToMainDashPage();
    }

    @Given("I want to create a new organization")
    public void iWantToCreateANewOrganization() {
        Reporter.info("I want to create a new organization");
        mainDashPage = new MainDashPage(webHooks.getDriver());
        mainDashPage.clickOrganizationDropDownButton();
        mainDashPage.goToBusinessUnitsPage();
        businessUnitsPage = new BusinessUnitsPage(webHooks.getDriver());
        businessUnitsPage.clickNewBusinessUnitsButton();

    }

    @When("I fill new business unit form")
    public void iFillNewBusinessUnitForm() {
        Reporter.info("I fill new business unit form");
        businessUnitsPage.fillInputName(WebData.returnData("businessUnitName"));
        businessUnitsPage.clickSelectParentBusinessUnit();
        businessUnitsPage.clickSaveNewOrganizationButton();
    }

    @Then("I should create a new organization successfully and see the the pop up with the message \"Save success\"")
    public void iShouldCreateANewOrganizationSuccessfullyAndSeeTheThePopUpWithTheMessageSaveSuccess() {
        Reporter.info("I should create a new organization successfully");
        Assert.assertEquals("Save success", businessUnitsPage.getSuccessMessage());
    }

    @Given("I want to add a meeting")
    public void iWantToCreateANewMeeting() {
        Reporter.info("I want to create a new meeting");
        mainDashPage = new MainDashPage(webHooks.getDriver());
        mainDashPage.clickMeetingDropDownButton();
        mainDashPage.goToMeetingsPage();
        meetingsPage = new MeetingsPage(webHooks.getDriver());
        meetingsPage.clickNewMeetingButton();
    }

    @When("I fill new meeting form")
    public void iFillNewMeetingForm() {
        Reporter.info("I fill new meeting form");
        meetingsPage.fillNewMeetingForm(WebData.returnData("meetingName"), WebData.returnData("meetingNumber"));
    }

    @Then("I should create a new meeting successfully and see the the pop up with the message \"Save success\"")
    public void iShouldCreateANewMeetingSuccessfullyAndSeeTheThePopUpWithTheMessageSaveSuccess() {
        Reporter.info("I should create a new meeting successfully");
        Assert.assertEquals("Save success", meetingsPage.getSuccessMessage());
    }

}