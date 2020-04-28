package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    // Use Cucumber to bind feature files steps to Java code
    // Glue code - Step implementation


    //Selenium WebDriver
    WebDriver driver;

    // Bind this function to the GIVEN step in the scenario
    @Given("the user is on the login page")
    public void user_on_login_page(){
        //Initiate the WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MatheusSimoesMinguin\\Documents\\estudos\\Courses\\bdd\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        //Navigate to the login page
        driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");

        // This step basically sets Up the precondition using Selenium
    }

    // Bind this function to the WHEN step in the scenario
    @When("the user enters valid credentials")
    public void user_enters_valid_credentials(){
        driver.findElement(By.id("txtUsername")).sendKeys("opensourcecms");
        driver.findElement(By.id("txtPassword")).sendKeys("opensourcecms");
        driver.findElement(By.id("btnLogin")).click();

        //This one sets up the manipulation needed
    }

    // Bind this function to the THEN step in the scenario
    @Then("the user should be able to view its account balance")
    public void user_should_see_account_balance(){

        // And finally, this part here tests the behavior of our application
        // We check if the actual behavior was the expected one
        WebElement logoHeader = driver.findElement(By.id("companyLogoHeader"));
        Assert.assertEquals(Boolean.TRUE, logoHeader.isDisplayed());
    }
}
