package io.cucumber.skeleton;

import io.cucumber.java.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebStepDefinitions {
    private static WebDriver driver;
    private Scenario scenario;

    @BeforeAll
    public static void setUp() {
        // This property is optional.
        // If not specified, WebDriver searches the path for chromedriver in your environment variables
        // Example path for Linux or Mac:
        System.setProperty("webdriver.chrome.driver", "/Users/victe/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @BeforeEach
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("I go to the home page")
    public void iGoToTheHomePage() throws InterruptedException {
        driver.get("http://tutorialsninja.com/demo/");
        Thread.sleep(1000);
    }

    @Then("I should see a {string} button/text")
    public void iShouldSeeAButton(String text) throws InterruptedException {
        By byXPath = By.xpath("//*[contains(text(),'" + text + "')]");
        boolean present = driver.findElements(byXPath).size() > 0;
        Assertions.assertTrue(present);
        Thread.sleep(1000);
    }

    @When("I click on {string} button")
    public void iClickOnButton(String button_text) throws InterruptedException {
        driver.findElement(By.linkText(button_text)).click();
        Thread.sleep(1000);
    }

    @And("I click on {string} to submmit")
    public void iClickOnSubmmit(String text) throws InterruptedException {
        driver.findElement(By.id(text)).click();
        Thread.sleep(1000);
    }

    @When("user enters {string} and {string}")
    public void user_enters_parameters(String email, String pass) throws InterruptedException {
        driver.findElement(By.id("input-email")).sendKeys(email);
        Thread.sleep(500);
        driver.findElement(By.id("input-password")).sendKeys(pass);
        Thread.sleep(500);
    }

    @When("user enters parameters")
    public void user_enters_parameters() throws InterruptedException {
        String fname = "Skone";
        String lname = "Atomo";
        String mail = "gqshadqaaaazhir@gmail.com";
        String tel = "666777999";
        String pass = "12345";
        String cPass = "12345";
        String text="agree";

        driver.findElement(By.id("input-firstname")).sendKeys(fname);
        Thread.sleep(500);
        driver.findElement(By.id("input-lastname")).sendKeys(lname);
        Thread.sleep(500);
        driver.findElement(By.id("input-email")).sendKeys(mail);
        Thread.sleep(500);
        driver.findElement(By.id("input-telephone")).sendKeys(tel);
        Thread.sleep(500);
        driver.findElement(By.id("input-password")).sendKeys(pass);
        Thread.sleep(500);
        driver.findElement(By.id("input-confirm")).sendKeys(cPass);
        Thread.sleep(500);
        driver.findElement(By.name(text)).click();
    }

    @And("user clicks on {string} to submit form")
    public void user_clicks_on(String text) throws InterruptedException {
        driver.findElement(By.className(text)).click();
        Thread.sleep(1000);
    }

    @And("user clicks on {string} to submmit form")
    public void user_clicks(String text) throws InterruptedException {
        driver.findElements(By.className(text)).get(1).click();
        Thread.sleep(1000);
    }

    @Then("user is navigated to the {string} page")
    public void user_is_navigated_to_the_home_page(String text) throws InterruptedException {
        Assertions.assertEquals(text,driver.getTitle());
        Thread.sleep(1000);
    }

    /// CARLOS
    @Then("I should find a search button")
    public void iShouldSeeASearch() throws InterruptedException {
        int nelement = driver.findElements(By.id("search")).size();
        boolean present = nelement > 0;
        Assertions.assertTrue(present);
        Thread.sleep(1000);
    }
    @When("I write a product like {string}")
    public void IWriteACorrectProduct(String text){
        driver.findElement(By.name("search")).sendKeys(text);
    }

    @And("I click on search button")
    public void IClickOnSearchButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[contains(@class,'btn btn-default')]")).click();
        Thread.sleep(1000);
    }

    @Then("I should see information of {string}")
    public void SeeSearchInformation(String text) throws InterruptedException {
        By byXPath = By.xpath("//*[contains(text(),'" + text + "')]");
        boolean present = driver.findElements(byXPath).size() > 0;
        Assertions.assertTrue(present);
        Thread.sleep(1000);
    }

    @When("I click on a add to cart in product {string}")
    public void ClickAddToCart(String number) throws InterruptedException {
        driver.findElement(By.xpath("//button[contains(@onclick,'" + number + "')]")).click();
        Thread.sleep(1000);
    }

    @And("I click on cart button")
    public void ClickOnCartButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[contains(@class, 'btn btn-inverse btn-block btn-lg dropdown-toggle')]")).click();
        Thread.sleep(1000);
    }

    @And("I click on delete product")
    public void ClickOnDeleteProduct() throws InterruptedException {
        driver.findElement(By.xpath("//button[contains(@title,'Remove')]")).click();
        Thread.sleep(1000);
    }

    @When("I click on a contact us text")
    public void ClickContactUs() throws InterruptedException {
        driver.findElement(By.xpath("//*[contains(text(),'Contact Us')]")).click();
        Thread.sleep(1000);
    }

    @And("I type my {string} which is {string} in the form")
    public void TypeTextInTheForm(String text1, String text2) throws InterruptedException {
        driver.findElement(By.id("input-" + text1)).sendKeys(text2);
        Thread.sleep(1000);
    }

    @And("I click on submit button")
    public void ClickSubmitButton() throws InterruptedException {
        driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
        Thread.sleep(1000);
    }

    @AfterEach()
    public static void tearDown() {
        driver.close();
        driver.quit();
    }
}
