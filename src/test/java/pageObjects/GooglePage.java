package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ScreenShotUtils;

public class GooglePage {

    private WebDriver driver;

    @FindBy(id = "lst-ib")
    WebElement searchField;

    @FindBy(id = "pnnext")
    WebElement nextButton;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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
            try {
                driver.findElement(By.xpath("//a[@href='" + expectedUrl + "']"));
                ScreenShotUtils.captureWholeScreen(driver, screenName);
                break;
            } catch (NoSuchElementException e) {
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

    private void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

}
