package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
   private By loginField = By.id("email");
   private By passwordField = By.id("pass");
   private By loginButton = By.xpath("//input[@data-testid='royal_login_button']");
   private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeLogin(String login){
      WebElement loginElement = driver.findElement(loginField);
      loginElement.clear();
      loginElement.sendKeys(login);
   }

   public void typePassword(String password){
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.clear();
        passwordElement.sendKeys(password);
   }

   public void clickLogIn() {
        WebElement clickEnterElement = driver.findElement(loginButton);
        clickEnterElement.click();
   }
}
