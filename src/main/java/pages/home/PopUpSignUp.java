package pages.home;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;

public class PopUpSignUp extends BasePage {

    @FindBy(id = "sign-username")
    WebElement usernameField;

    @FindBy(id = "sign-password")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
    WebElement signUpButton;

    @FindBy(id = "login2")
    WebElement linkSignUp;

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    // ✅ Tambahkan method ini
    public String getAlertMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String message = alert.getText();
        alert.accept();
        return message;
    }
}

