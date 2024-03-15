package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Driver {

    public static WebDriver driver = null;
    public static final int seconds = Integer.parseInt(ConfigHelper.getProperty("defaultTimeout"));
    public static final Duration DEFAULT_TIMEOUT = Duration.ofSeconds(seconds);

    public static String rootURL;
    public static void startDriver()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void navigateTo(String targetURL)
    {
        driver.navigate().to(targetURL);
    }

    public static void ShutDown()
    {
        driver.quit();
    }
}
