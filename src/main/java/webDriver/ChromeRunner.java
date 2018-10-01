package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeRunner {
    public static void main(String[] args) {
        initChromeDriver();
    }

    public static WebDriver initChromeDriver() {
        String exePath = "C:\\Users\\Simba\\Downloads\\chromedriver_last\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }
}
