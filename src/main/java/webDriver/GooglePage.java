package webDriver;

import org.openqa.selenium.*;

public class GooglePage {
    private By searchField = By.id("lst-ib");
    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeKeyWord(String keyWord) {
        WebElement search = driver.findElement(searchField);
        search.clear();
        search.sendKeys(keyWord);
        search.sendKeys(Keys.ENTER);
    }

    public void clickNext() {
        WebElement nextButton = driver.findElement(By.id("pnnext"));
        nextButton.click();
    }

    public boolean isNextButtonPresent() {
        try {
            driver.findElement(By.id("pnnext"));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }
}
