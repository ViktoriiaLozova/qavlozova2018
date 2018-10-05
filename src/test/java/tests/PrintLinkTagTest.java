package tests;
/*
Navigate to the interested webpage for e.g. https://en.wikipedia.org/wiki/Main_Page
Create a list of type WebElement to store all the Link elements in to it.
Collect all the links from the webpage. All the links are associated with the Tag ‘a‘.
Now iterate through every link and print the Link Text on the console screen.
*/

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.WikiPage;
import runners.ChromeRunner;

public class PrintLinkTagTest {

    private WebDriver webDriver;

    @Before
    public void setUp() {
        //webdriver = IERunner.initIEDriver();
        webDriver = ChromeRunner.initChromeDriver();
        webDriver.get("https://en.wikipedia.org/wiki/Main_Page");
    }

    @After
    public void quiteDriver() {
       webDriver.close();
    }

    @Test
    public void printTagElementsTest() {
        WikiPage wikiPage = new WikiPage(webDriver);
        wikiPage.printLinkList();
    }
}
