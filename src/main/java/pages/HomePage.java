package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "signin2")
    WebElement signUpLink;

    @FindBy(id = "login2")
    WebElement loginLink;

    @FindBy(id = "cartur")
    WebElement cartLink;

    @FindBy(id = "about")
    WebElement AboutUsLink;

    @FindBy(id = "contact")
    WebElement contactLink;

    @FindBy(id = "nava")
    WebElement HomeLink;

    public void clickSignUpLink() {
        signUpLink.click();
    }
    public void clickLoginLink() {
        loginLink.click();
    }
    public void clickCartLink() {
        cartLink.click();
    }
    public void clickAboutUsLink() {
        AboutUsLink.click();
    }
    public void clickContactLink() {
        contactLink.click();
    }
    public void clickHomeLink() {
        HomeLink.click();
    }
}
