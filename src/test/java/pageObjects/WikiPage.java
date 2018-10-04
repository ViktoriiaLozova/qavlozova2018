package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ScreenShotUtils;

import java.io.IOException;
import java.util.List;

public class WikiPage extends BasePage {

    @FindBy(xpath = "//span[@id='Did_you_know...']/../following-sibling::*//img")
    WebElement firstScreen;

    @FindBy(xpath = "//div[@id='mp-itn']")
    WebElement secondScreen;

    @FindBy(tagName = "a")
    List<WebElement> linkElements;

    public WikiPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void takeScreenShotFirst() throws IOException {
        ScreenShotUtils.createScreenShotFromElement(webDriver, firstScreen, "First_screenshot.png");
    }

    public void takeScreenShotSecond() throws IOException {
        ScreenShotUtils.createScreenShotFromElement(webDriver, secondScreen, "Second_screenshot.png");
    }

    public void printLinkList() {
        List<WebElement> linkListElements = linkElements;
        System.out.println(linkListElements.size());
        for (int i = 0; i < linkListElements.size(); i++) {
            System.out.println(linkListElements.get(i).getText());
        }
    }
}
