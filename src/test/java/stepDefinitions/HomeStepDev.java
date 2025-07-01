package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.home.PopUpSignUp;
import utilities.AllertHandler;

import static org.junit.Assert.assertEquals;

public class HomeStepDev {
    private final PopUpSignUp popUpSignUp  = new PopUpSignUp();
    private final HomePage homePage = new HomePage();

    WebDriver driver;

    @Given("user on the home page")
    public void userOnTheHomePage() {
        HomePage homePage = new HomePage();
    }

    @When("user click Sign up button")
    public void userClickSignUpButton() throws InterruptedException {
        homePage.clickSignUpLink();
        Thread.sleep(500);
    }

    @And("user input username {string}")
    public void userInputUsername(String username) {
       popUpSignUp.enterUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        popUpSignUp.enterPassword(password);
    }

     @And("user click Sign Up")
    public void userClickSignUp() {
        popUpSignUp.clickSignUpButton();
    }

    @Then("user show message {string}")
    public void verifyMessage(String message){
        AllertHandler allertHandler = new AllertHandler();
        String actualAllertMessage = allertHandler.getAlertText();
        System.out.println("actualAllertMessage : "+ actualAllertMessage);
        //Assert.assertEquals(message "Alert message does not match", expectedAlertMessage, actualAllertMessage);
    }

}
