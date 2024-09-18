package by.onliner.irinanovik;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void testLoginWithEmptyData() {
        WebDriver driver = new ChromeDriver(driver);
        driver.get ("https://www.onliner.by/");
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonLogin();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickButtonEnter(driver);
    }
}
