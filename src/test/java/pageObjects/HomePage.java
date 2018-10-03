package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//h2[@class='uiHeaderTitle'")
    WebElement welcomeMessage;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void textPresentOnThePage(String message) {
        Assert.assertEquals(message, welcomeMessage.getText());
    }
}
