package co.choucair.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessUnitsPage extends BasePage {

    @FindBy(css = "body.full-height-page:nth-child(2) main.s-main:nth-child(4) section.content div.s-Serenity-Pro-Organization-BusinessUnitGrid.s-Pro-Organization-BusinessUnitGrid.s-BusinessUnitGrid.s-DataGrid.require-layout.route-handler.responsive-height:nth-child(3) div.grid-toolbar.s-Serenity-Toolbar.s-Toolbar.clearfix div.tool-buttons div.buttons-outer div.buttons-inner div.tool-button.add-button.icon-tool-button:nth-child(1) div.button-outer > span.button-inner")
    private WebElement newBusinessUnitsButton;

    @FindBy(css = "#Serenity_Pro_Organization_BusinessUnitDialog3_Name")
    private WebElement inputName;

    @FindBy(xpath = "//span[@id='select2-chosen-1']")
    private WebElement selectParentBusinessUnit;

    @FindBy(id = "select2-result-label-2")
    private WebElement selectParentBusinessUnitOption;

    @FindBy(className = "toast-message")
    private WebElement successMessage;

    @FindBy(css = "body.full-height-page.modal-dialog-open:nth-child(2) div.ui-dialog.ui-corner-all.ui-widget.ui-widget-content.ui-front.s-Dialog.s-Serenity-Pro-Organization-BusinessUnitDialog.s-Pro-Organization-BusinessUnitDialog.s-BusinessUnitDialog.ui-draggable.ui-resizable.flex-layout:nth-child(8) div.s-TemplatedDialog.ui-dialog-content.ui-widget-content:nth-child(2) div.s-DialogContent div.s-DialogToolbar.s-Serenity-Toolbar.s-Toolbar.clearfix div.tool-buttons div.buttons-outer div.buttons-inner div.tool-button.apply-changes-button.icon-tool-button:nth-child(2) div.button-outer span.button-inner > i.fa.fa-clipboard-check.text-purple")
    private WebElement saveNewOrganizationButton;

    public BusinessUnitsPage(WebDriver driver) {
        super(driver);
    }

    public void clickNewBusinessUnitsButton() {
        clickElement(newBusinessUnitsButton);
    }

    public void fillInputName(String name) {
        waitForVisibility(inputName);
        typeOnInput(inputName, name);
    }

    public void clickSelectParentBusinessUnit() {
        clickElement(selectParentBusinessUnit);
        clickElement(selectParentBusinessUnitOption);
    }

    public void clickSaveNewOrganizationButton() {
        clickElement(saveNewOrganizationButton);
    }

    public String getSuccessMessage() {
        waitForVisibility(successMessage);
        return successMessage.getText();
    }
}
