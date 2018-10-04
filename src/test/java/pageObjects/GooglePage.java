package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import utils.ScreenShotUtils;

import java.util.List;

public class GooglePage extends BasePage {

    @FindBy(id = "lst-ib")
    WebElement searchField;

    @FindBy(id = "pnnext")
    WebElement nextButton;

    public GooglePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void typeKeyWord(String keyWord) {
        searchField.clear();
        searchField.sendKeys(keyWord);
        searchField.sendKeys(Keys.ENTER);
    }

    public void clickNext() {
        nextButton.click();
    }

    public boolean isNextButtonPresent() {
        try {
            nextButton.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    public void searchForKey(String key, String expectedUrl, String screenName) {
        typeKeyWord(key);
        int pageCount = 1;
        while (true) {
            List<WebElement> webElements = webDriver.findElements(By.xpath("//a[@href='" + expectedUrl + "']"));
            boolean isAtLeastOneUrlPresent = !webElements.isEmpty();
            if (isAtLeastOneUrlPresent) {
                ScreenShotUtils.captureWholeScreen(webDriver, screenName);
                break;
            } else {
                scrollToBottom();
                if (isNextButtonPresent()) {
                    clickNext();
                    pageCount++;
                } else {
                    System.out.println("No such element found");
                    return;
                }
            }
        }
        System.out.println("Page number: " + pageCount);
    }


}
