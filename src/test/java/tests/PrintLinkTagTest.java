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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import runners.ChromeRunner;

import java.util.List;

public class PrintLinkTagTest {

    private static WebDriver driver;

    @Before
    public void setUp() {
        //driver = IERunner.initIEDriver();
        driver = ChromeRunner.initChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
    }

    @After
    public void quiteDriver() {
        driver.close();
    }

    @Test
    public void printTagElementsTest() {
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        System.out.println(linkElements.size());
        for (int i = 0; i < linkElements.size(); i++) {
            System.out.println(linkElements.get(i).getText());
        }
    }
}
