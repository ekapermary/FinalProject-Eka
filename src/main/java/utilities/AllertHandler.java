package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AllertHandler {

    WebDriver driver = DriverManager.getDriver();

    public String getAlertText() {
        waitAllert();
        String alertText = driver.switchTo().alert().getText();
        return alertText;
    }

    public void waitAllert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
}
