package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static WebDriver driver;

    //Open Chorome
    public static WebDriver getDriver(){
        if (driver == null) {
           driver = WebDriverManager.chromedriver().create();
           driver.manage().window().maximize();
           driver.get("https://www.demoblaze.com/");
        }
        return driver;
    }

    //Close Chorome
    public  static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // Set to null after quitting
        }
    }
}
