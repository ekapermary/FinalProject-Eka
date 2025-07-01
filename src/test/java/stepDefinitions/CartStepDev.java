//package stepDefinitions;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.cucumber.java.en.*;
//import static org.junit.Assert.*;
//
//public class CartStepDev {
//
//    WebDriver driver;
//
//    //@Given("user on the home page")
//    public void user_on_the_home_page() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.demoblaze.com");
//    }
//
//    @When("user input {string} as username")
//    public void user_input_as_username(String username) {
//        driver.findElement(By.id("login2")).click();
//        pause(1000);
//        driver.findElement(By.id("loginusername")).sendKeys(username);
//    }
//
//    @When("user input {string} as password")
//    public void user_input_as_password(String password) {
//        driver.findElement(By.id("loginpassword")).sendKeys(password);
//        driver.findElement(By.xpath("//button[text()='Log in']")).click();
//        pause(2000);
//    }
//
//    //@Then("user will redirect to home page")
//    public void user_will_redirect_to_home_page() {
//        boolean loggedIn = driver.findElement(By.id("nameofuser")).isDisplayed();
//        assertTrue("Login success", loggedIn);
//    }
//
//    @Given("user is on the product page")
//    public void user_is_on_the_product_page() {
//        driver.get("https://www.demoblaze.com"); // default to home
//    }
//
//    @When("user click image product")
//    public void user_click_image_product() {
//        // Klik produk pertama di daftar (bisa disesuaikan dengan nama produk)
//        driver.findElement(By.cssSelector(".card-title a")).click();
//        pause(1000);
//    }
//
//    @When("user click Add to cart")
//    public void user_click_add_to_cart() {
//        driver.findElement(By.linkText("Add to cart")).click();
//        pause(2000);
//        driver.switchTo().alert().accept();
//    }
//
//    @When("user click cart redirect to page cart")
//    public void user_click_cart_redirect_to_page_cart() {
//        driver.findElement(By.id("cartur")).click();
//        pause(2000);
//    }
//
//    @When("user click place order")
//    public void user_click_place_order() {
//        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
//        pause(1000);
//    }
//
//    @When("user input form check out for example data :")
//    public void user_input_form_check_out(io.cucumber.datatable.DataTable dataTable) {
//        var data = dataTable.asMaps().get(0);
//        driver.findElement(By.id("name")).sendKeys(data.get("name"));
//        driver.findElement(By.id("country")).sendKeys(data.get("country"));
//        driver.findElement(By.id("city")).sendKeys(data.get("city"));
//        driver.findElement(By.id("card")).sendKeys(data.get("card"));
//        driver.findElement(By.id("month")).sendKeys(data.get("month"));
//        driver.findElement(By.id("year")).sendKeys(data.get("year"));
//    }
//
//    @When("user click Purchase")
//    public void user_click_purchase() {
//        driver.findElement(By.xpath("//button[text()='Purchase']")).click();
//        pause(2000);
//    }
//
//    @Then("payment success and show notification {string}")
//    public void payment_success_and_show_notification(String expectedMessage) {
//        String text = driver.findElement(By.cssSelector(".sweet-alert h2")).getText();
//        assertEquals(expectedMessage, text);
//    }
//
//    @Then("payment faild and show notification {string}")
//    public void payment_faild_and_show_notification(String expectedMessage) {
//        // Assume alert for missing field
//        String alertText = driver.switchTo().alert().getText();
//        assertEquals(expectedMessage, alertText);
//        driver.switchTo().alert().accept();
//    }
//
//    @And("user close pop up notification")
//    public void user_close_pop_up_notification() {
//        driver.findElement(By.xpath("//button[text()='OK']")).click();
//        pause(1000);
//    }
//
//    @When("user click delete")
//    public void user_click_delete() {
//        driver.findElement(By.xpath("//a[text()='Delete']")).click();
//        pause(2000);
//    }
//
//    @Then("the product should be removed from the cart")
//    public void the_product_should_be_removed_from_the_cart() {
//        boolean isCartEmpty = driver.findElements(By.xpath("//tr[@class='success']")).isEmpty();
//        assertTrue("Cart is empty", isCartEmpty);
//        driver.quit();
//    }
//
//    // Helper pause
//    private void pause(long millis) {
//        try { Thread.sleep(millis); } catch (InterruptedException e) { e.printStackTrace(); }
//    }
//
//}
