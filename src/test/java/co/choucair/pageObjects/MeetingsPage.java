package co.choucair.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MeetingsPage extends BasePage {

    @FindBy(css = "body.full-height-page:nth-child(2) main.s-main:nth-child(4) section.content div.s-Serenity-Pro-Meeting-MeetingGrid.s-Pro-Meeting-MeetingGrid.s-MeetingGrid.s-DataGrid.require-layout.route-handler.responsive-height:nth-child(5) div.grid-toolbar.s-Serenity-Toolbar.s-Toolbar.clearfix div.tool-buttons div.buttons-outer div.buttons-inner div.tool-button.add-button.icon-tool-button:nth-child(1) div.button-outer > span.button-inner")
    private WebElement newMeetingButton;

    @FindBy(id = "Serenity_Pro_Meeting_MeetingDialog10_MeetingName")
    private WebElement meetingNameField;

    @FindBy(id = "Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber")
    private WebElement meetingNumberField;

    @FindBy(id = "select2-chosen-7")
    private WebElement locationDropDown;

    @FindBy(id = "select2-results-7")
    private WebElement locationDropDownOption;


    @FindBy(id = "select2-chosen-9")
    private WebElement organizerDropDown;

    @FindBy(id = "select2-result-label-77")
    private WebElement organizerDropDownOption;

    @FindBy(id = "select2-chosen-10")
    private WebElement reporterDropDown;

    @FindBy(id = "select2-result-label-177")
    private WebElement reporterDropDownOption;

    @FindBy(className = "toast-message")
    private WebElement successMessage;

    @FindBy(css = "body.full-height-page:nth-child(2) main.s-main:nth-child(4) section.content div.s-TemplatedDialog.s-Serenity-Pro-Meeting-MeetingDialog.s-Pro-Meeting-MeetingDialog.s-MeetingDialog.flex-layout.s-Panel:nth-child(7) div.s-DialogContent.ui-tabs.ui-corner-all.ui-widget.ui-widget-content div.tab-pane.s-TabInfo.ui-tabs-panel.ui-corner-bottom.ui-widget-content:nth-child(2) div.s-DialogToolbar.s-Serenity-Toolbar.s-Toolbar.clearfix div.tool-buttons div.buttons-outer div.buttons-inner div.tool-button.apply-changes-button.icon-tool-button:nth-child(2) div.button-outer span.button-inner > i.fa.fa-clipboard-check.text-purple")
    private WebElement saveMeetingButton;


    public MeetingsPage(WebDriver driver) {
        super(driver);
    }

    public void clickNewMeetingButton() {
        clickElement(newMeetingButton);
    }

    public void fillNewMeetingForm(String meetingName, String meetingNumber) {
        typeOnInput(meetingNameField, meetingName);
        typeOnInput(meetingNumberField, meetingNumber);
        clickElement(locationDropDown);
        clickElement(locationDropDownOption);
        clickElement(organizerDropDown);
        clickElement(organizerDropDownOption);
        clickElement(reporterDropDown);
        clickElement(reporterDropDownOption);
        clickElement(saveMeetingButton);
    }

    public String getSuccessMessage() {
        waitForVisibility(successMessage);
        return successMessage.getText();
    }

}



