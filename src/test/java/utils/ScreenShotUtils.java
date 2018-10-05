package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenShotUtils {

    public static void createScreenShotFromElement(WebDriver webDriver, WebElement webElement, String path) throws IOException {
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

    public static void captureWholeScreen(WebDriver driver, String screenName) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(screenName));
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
