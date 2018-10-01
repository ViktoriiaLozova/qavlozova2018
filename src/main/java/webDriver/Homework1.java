package webDriver;
/*
Launch new Browser
Open URL http://facebook.com
Type Login
Type Password
Click on Вход button
Check that you have logged in
Close the Browser
*/

import org.openqa.selenium.WebDriver;

public class Homework1 {
    public static void main(String[] args) {
        WebDriver webDriver = ChromeRunner.initChromeDriver();
        webDriver.get("http://facebook.com");

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.typeLogin("lozova.vic@gmail.com");
        loginPage.typePassword("P@ssword123");
        loginPage.clickLogIn();

        HomePage homepage = new HomePage(webDriver);
        homepage.textPresentOnThePage("Добро пожаловать на Facebook, VikaTest!");

        webDriver.close();
    }

}
