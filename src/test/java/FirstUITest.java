import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstUITest {
    @Test
    public void firstSeleniumTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/belevitnev/IdeaProjects/testFortJuly2022/chromedriver_2");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("testfort");
        driver.quit();
    }

    @Test
    public void firstSeleniumTestWithManager() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("testfort");
        driver.quit();
    }

    @Test
    public void firstSeleniumTestWithManagerLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.i.ua/");
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("lhgoerh");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("lhgoerhbdfdfg");
        driver.findElement(By.xpath("//input[@title='Вхід на пошту']")).click();
        driver.quit();
    }
}
