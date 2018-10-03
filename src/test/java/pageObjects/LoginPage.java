package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "email")
    WebElement loginField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(xpath = "//input[@data-testid='royal_login_button']")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void typeLogin(String login) {
        loginField.clear();
        loginField.sendKeys(login);
    }

    public void typePassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLogIn() {
        loginButton.click();
    }
}
