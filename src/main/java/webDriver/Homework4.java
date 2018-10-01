package webDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

/*
For  Chrome, IE and Safari – open the browser
2. Goto google.com
3. Search for something that:
	3.1 is located on the first page of search results
	3.2  is located  further then 10th page
	3.3   is not in the search results
4. Save  screenshot if result is found
5. Provide user with the corresponding error message if result is not found
6. Print to Console  Page number if result is found

Example:
1. We  enter “selenium automation testing”  and find that “seleniumhq.org”  is on the 1st page
2. We  enter “осциллограф”  and find that “vit.ua”  is on the 17th page
3. We enter “абракадабра”  and find that “kpi.ua” is not in the search results

*/
public class Homework4 {
    private static WebDriver driver = ChromeRunner.initChromeDriver();
    //private static  WebDriver driver = IERunner.initIEDriver();

    public static void main(String[] args) {
        searchForKey("selenium automation testing", "https://www.seleniumhq.org/", "FirstPageScreen.png");
        searchForKey("sea", "https://www.seastarfestival.com/en/", "SecondPageScreen.png");
        searchForKey("abrakrahabra", "https://www.kpi.ua/", "ThirdPageScreen.png");
        driver.close();
    }

    private static void searchForKey(String key, String expectedUrl, String screenName) {
        driver.get("https://www.google.com/");
        GooglePage googlePage = new GooglePage(driver);
        googlePage.typeKeyWord(key);
        int pageCount = 1;
        while (true) {
            try {
                driver.findElement(By.xpath("//a[@href='" + expectedUrl + "']"));
                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                try {
                    FileUtils.copyFile(scrFile, new File(screenName));
                } catch (IOException e) {
                    System.out.println(e.getMessage());

                }
                break;
            } catch (NoSuchElementException e) {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
                if (googlePage.isNextButtonPresent()) {
                    googlePage.clickNext();
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
