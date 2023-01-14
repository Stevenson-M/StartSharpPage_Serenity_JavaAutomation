package co.choucair.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "LoginPanel0_Username")
    private WebElement loginInput;

    @FindBy(id = "LoginPanel0_Password")
    private WebElement passwordInput;

    @FindBy(id = "LoginPanel0_LoginButton")
    private WebElement singInButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
        Note:This method is not used because when the web page charge the login form is already filled

        public void fillLoginForm (String user, String password){
        waitForVisibility(loginInput);
        loginInput.sendKeys(user);
        waitForVisibility(passwordInput);
        passwordInput.sendKeys(password);
    }**/

    public MainDashPage clickSingInButtonGoToMainDashPage(){
        clickElement(singInButton);
        return new MainDashPage(getDriver());
    }
}
