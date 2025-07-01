package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import utilities.AllertHandler;

import static org.junit.Assert.*;

public class LoginStepDev {
    WebDriver driver;

    @Given("user open the home page Demoblaze")
    public void UserOpenTheHomePageDemoblaze() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com");
    }

    @When("user click Log in")
    public void UserClickLogIn() {
        driver.findElement(By.id("login2")).click();
        try {
            Thread.sleep(1000); // tunggu modal muncul
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("user input {string} as username")
    public void UserInput_as_username(String username) {
        driver.findElement(By.id("loginusername")).clear();
        driver.findElement(By.id("loginusername")).sendKeys(username);
    }

    @When("user input {string} as password")
    public void user_input_as_password(String password) {
        driver.findElement(By.id("loginpassword")).clear();
        driver.findElement(By.id("loginpassword")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }

    @Then("user will redirect to home page")
    public void user_will_redirect_to_home_page() {
        try {
            Thread.sleep(2000); // tunggu sampai login selesai
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean isLoggedIn = driver.findElement(By.id("nameofuser")).isDisplayed();
        assertTrue("Login success and user redirected", isLoggedIn);
        driver.quit();
    }

    @Then("system show message {string}")
    public void verifyMessage(String message){
        AllertHandler allertHandler = new AllertHandler();
        String actualAlertMessage = allertHandler.getAlertText();
        System.out.println("actualAlertMessage : " + actualAlertMessage);
    }

}
