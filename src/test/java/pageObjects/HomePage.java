package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//h2[@class='uiHeaderTitle'")
    WebElement welcomeMessage;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void textPresentOnThePage(String message) {
        Assert.assertEquals(message, welcomeMessage.getText());
    }
}
