import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import main.Main;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class YandexMarketTests {

    private static AndroidDriver<MobileElement> driver;

    @BeforeAll
    public static void setUp() {
        try {
            driver = Main.initializeDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return;
        }
    }
    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @BeforeEach
    public void closeAuthorizationWindow() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.yandex.market:id/empty_search_query_text")));
        if (driver.findElements(By.id("ru.yandex.market:id/agree_to_license")).size() > 0) {
            driver.findElement(By.id("ru.yandex.market:id/agree_to_license")).click();
        }
    }

    @Test
    public void testAddToCart() {
        // Код теста на добавление товара в корзину
    }

    @Test
    public void testRemoveFromCart() {
        // Код теста на удаление товара из корзины
    }
}