package tests;/*
Launch new Browser
Open URL http://facebook.com
Type Login
Type Password
Click on Вход button
Check that you have logged in
Close the Browser
*/

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import runners.ChromeRunner;

public class FacebookLoginTest {

    private WebDriver webDriver;

    @Before
    public void setUp() {
        webDriver = ChromeRunner.initChromeDriver();
        webDriver.get("http://facebook.com");
    }

    @After
    public void quiteDriver() {
        webDriver.close();
    }

    @Test
    public void loginFacebookTest() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.typeLogin("lozova.vic@gmail.com");
        loginPage.typePassword("P@ssword123");
        loginPage.clickLogIn();

        HomePage homepage = new HomePage(webDriver);
        homepage.textPresentOnThePage("Добро пожаловать на Facebook, VikaTest!");

    }

}
