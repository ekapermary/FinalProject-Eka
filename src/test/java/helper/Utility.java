package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver; //
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Utility {
    public static WebDriver webDriver; // Tambahkan ini

    // Open Chrome
    public static void startWebDriver() {
        WebDriverManager.chromedriver().setup();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("safebrowsing.enabled", false);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-notifications");
        options.addArguments("--incognito");
        //options.addArguments("--headless");

        webDriver = new ChromeDriver(options);
        webDriver.manage().window().fullscreen();
        webDriver.get("https://www.demoblaze.com/");
    }

    // Close Chrome
    public static void quitDriver() {
        webDriver.quit();
    }
}
