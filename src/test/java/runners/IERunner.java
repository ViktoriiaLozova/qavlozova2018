package runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IERunner {

    public static WebDriver initIEDriver() {
        String exePath = "C:\\Users\\Simba\\Downloads\\IEDriverServer_2\\IEDriverServer.exe";
        System.setProperty("webdriver.ie.driver", exePath);
        WebDriver driver = new InternetExplorerDriver();;
        driver.manage().window().maximize();
        return driver;
    }

}
