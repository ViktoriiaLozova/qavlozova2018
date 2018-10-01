package webDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private By welcomeMessage = By.xpath("//h2[@class='uiHeaderTitle']");
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void textPresentOnThePage(String message){
        WebElement textOnThePage = driver.findElement(welcomeMessage);
        textOnThePage.getText().equals(message);
        Assert.assertEquals(message, textOnThePage.getText());
    }
}
