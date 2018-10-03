package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.GooglePage;
import runners.ChromeRunner;

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
public class GoogleSearchTest {

    static WebDriver driver;

    @Before
    public void setUp() {
        //driver = IERunner.initIEDriver();
        driver = ChromeRunner.initChromeDriver();
        driver.get("https://www.google.com/");
    }

    @After
    public void quiteDriver() {
        driver.close();
    }

    @Test
    public void googleSearchTest() {
        GooglePage googlePage = new GooglePage(driver);
        googlePage.searchForKey("selenium automation testing", "https://www.seleniumhq.org/", "FirstPageScreen.png");
        googlePage.searchForKey("sea", "https://www.seastarfestival.com/en/", "SecondPageScreen.png");
        googlePage.searchForKey("abrakrahabra", "https://www.kpi.ua/", "ThirdPageScreen.png");
    }

}
