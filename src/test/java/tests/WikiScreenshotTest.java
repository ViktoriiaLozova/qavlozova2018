package tests;
/*
Navigate to https://en.wikipedia.org/wiki/Main_Page
Take Screenshot of the first Image  in the “Did you know...” container
Take Screenshot of the “In the news” container
*/

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.WikiPage;
import runners.ChromeRunner;

import java.io.IOException;

public class WikiScreenshotTest {

    static WebDriver webDriver;

    @Before
    public void setUp() {
        webDriver = ChromeRunner.initChromeDriver();
        webDriver.get("https://en.wikipedia.org/wiki/Main_Page");
    }

    @After
    public void quitDriver() {
        webDriver.close();
    }

    @Test
    public void checkScreenShotsTest() throws IOException {
        WikiPage wikiPage = new WikiPage(webDriver);
        wikiPage.takeScreenShotFirst();
        wikiPage.takeScreenShotSecond();
    }


}
