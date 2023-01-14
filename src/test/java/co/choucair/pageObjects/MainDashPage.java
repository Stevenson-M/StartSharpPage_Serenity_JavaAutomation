package co.choucair.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class MainDashPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Organization')]")
    private WebElement organizationDropDownButton;

    @FindBy(xpath = "//span[normalize-space()='Business Units']")
    private WebElement businessUnitsButton;

    @FindBy(xpath = "//body/aside[@id='s-sidebar']/div[2]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[1]")
    private WebElement meetingDropDownButton;

    @FindBy(xpath = "//span[contains(text(),'Meetings')]")
    private WebElement meetingsButton;

    public MainDashPage(WebDriver driver) {
        super(driver);
    }

    public void clickOrganizationDropDownButton() {
        clickElement(organizationDropDownButton);
    }

    public BusinessUnitsPage goToBusinessUnitsPage() {
        clickElement(businessUnitsButton);
        return new BusinessUnitsPage(getDriver());
    }

    public void clickMeetingDropDownButton() {
        clickElement(meetingDropDownButton);
    }

    public MeetingsPage goToMeetingsPage() {
        clickElement(meetingsButton);
        return new MeetingsPage(getDriver());
    }

}

