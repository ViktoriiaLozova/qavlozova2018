package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ScreenShotUtils;

import java.io.IOException;

public class WikiPage {
    private WebDriver driver;

    @FindBy(xpath = "//span[@id='Did_you_know...']/../following-sibling::*//img")
    WebElement firstScreen;

    @FindBy(xpath = "//div[@id='mp-itn']")
    WebElement secondScreen;

    public WikiPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void takeScreenShotFirst() throws IOException {
        ScreenShotUtils.createScreenShotFromElement(driver, firstScreen, "First_screenshot.png");
    }

    public void takeScreenShotSecond() throws IOException {
        ScreenShotUtils.createScreenShotFromElement(driver, secondScreen, "Second_screenshot.png");
    }
}
