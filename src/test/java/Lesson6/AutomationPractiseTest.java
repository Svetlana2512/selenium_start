package Lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractiseTest {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @Test
    void putDressToCart() {
        new LoginPage(driver)
                .login("Svetlana@test.ru", "Svetlana")
                .navigationBlock.clickTShirtsButtonInTShirtsSubmenu()
                .selectSize("S")
                .selectPrice(100)
                .addTShirtToCartByName("Faded")
                .checkTotalSumm("$18.51");
    }

    @AfterEach
    void killDriver() {
        driver.quit();
    }
}
