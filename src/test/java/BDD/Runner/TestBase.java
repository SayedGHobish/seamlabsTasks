package BDD.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

public class TestBase extends AbstractTestNGCucumberTests {
    public static WebDriver driver;

    @BeforeTest
    public void openURL()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://homzmart.com/en/");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    @AfterTest
    public void closeURL()
    {driver.quit();}
}
