package webDriver;

/*
Navigate to https://en.wikipedia.org/wiki/Main_Page
Take Screenshot of the first Image  in the “Did you know...” container
Take Screenshot of the “In the news” container
*/

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Homework2 {
    public static void main(String[] args) throws IOException {
        WebDriver webDriver = ChromeRunner.initChromeDriver();
        webDriver.get("https://en.wikipedia.org/wiki/Main_Page");

        WebElement firstImage = webDriver.findElement(By.xpath("//span[@id='Did_you_know...']/../following-sibling::*//img"));
        createScreenShotFromElement(webDriver, firstImage, "First_screenshot.png");

        WebElement secondScreen = webDriver.findElement(By.xpath("//div[@id='mp-itn']"));
        createScreenShotFromElement(webDriver, secondScreen, "Second_screenshot.png");

        webDriver.close();
    }

    private static void createScreenShotFromElement(WebDriver webDriver, WebElement webElement, String path) throws IOException {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webElement);
        actions.perform();

        File screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        BufferedImage fullImg = ImageIO.read(screenshot);

        Point point = webElement.getLocation();
        int eleWidth = webElement.getSize().getWidth();
        int eleHeight = webElement.getSize().getHeight();

        BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(),
                eleWidth, eleHeight);
        ImageIO.write(eleScreenshot, "png", screenshot);

        File screenshotLocation = new File(path);
        FileUtils.copyFile(screenshot, screenshotLocation);

    }


}
