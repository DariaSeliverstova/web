package netology;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebTest {

    //private WebDriver driver;


    //@BeforeAll
    //static void setUpAll() {
        //System.setProperty("webdriver.chrome.driver", "driver/mac/chromedriver2");
    //}

    //public class CardTest {
        private WebDriver driver;

        @BeforeAll
        public static void setupClass() {
            WebDriverManager.chromedriver().setup();
        }

    @BeforeEach
    void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get("http://localhost:9999/%22");
    }


        @Test
        void shouldBeSuccess() {
       driver.get("http://localhost:9999/%22");
            driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Иванов Тарас Игнатьевич");
            driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79264775516");
            driver.findElement(By.className("checkbox__box")).click();
            driver.findElement(By.className("button")).click();
            String actualText = driver.findElement(By.cssSelector("[data-test-id=order-success")).getText();
            String expectedText = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
            assertEquals(expectedText.trim(), actualText.trim());

    //@Test
    //void test() {
        //driver.get("http://localhost:9999");

        //List<WebElement> elements = driver.findElements(By.className("input__control"));
        //elements.get(0).sendKeys("Селиверстова Дарья");
        //elements.get(1).sendKeys("+74951384061");
        //driver.findElement().sendKeys("Селиверстова Дарья");
        //driver.findElement().sendKeys("+74951384061");
        //driver.findElement(By.className("checkbox__box")).click();
        //driver.findElement(By.className("button button_view_extra button_size_m button_theme_alfa-on-white")).click();
        //String text = driver.findElement(By.className("Success_successBlock__2L3Cw")).getText();
        //assertEquals("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.",text.trim());

        //System.out.println();
    //}

    //@BeforeEach
    //void setUP(){
        //driver = new ChromeDriver();


    //}
    //@BeforeEach
    //void setUp(){
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--disable-dev-shm-usage");
       //options.addArguments("--no-sandbox");
        //options.addArguments("--headless");
        //driver = new ChromeDriver(options);
    //}

   // @AfterEach
    //void tearDown() {
        //driver.quit();
        //driver = null;
    }
}

