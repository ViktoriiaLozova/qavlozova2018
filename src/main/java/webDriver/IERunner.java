package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IERunner {
    public static void main(String[] args) {
        initIEDriver();
    }

    public static WebDriver initIEDriver() {
        String exePath = "C:\\Users\\Simba\\Downloads\\IEDriverServer_2\\IEDriverServer.exe";
        System.setProperty("webdriver.ie.driver", exePath);
        WebDriver driver = new InternetExplorerDriver();;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

}
