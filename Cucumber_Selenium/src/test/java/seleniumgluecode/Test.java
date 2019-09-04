package seleniumgluecode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MegaMenuPage;

public class Test 
{
	HomePage homePage;
	LoginPage loginPage;
	MegaMenuPage megaMenuPage;
	CartPage cartPage;
	
	public static WebDriver driver;
	
	@Given("^User is at the Home page$")
	public void user_is_on_homepage() throws Throwable{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abha\\eclipse-workspace\\Cucumber_Selenium\\exefiles\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://www.automationpractice.com/");
	}
	
	@When ("^user navigates to the Login Page$")
	public void user_navigates_to_the_Login_Page() throws Throwable{
		
		homePage = new HomePage(driver);
		homePage.clickSignIn();
	}
	
    @And ("^enters invalid email id$")
	public void enters_invalid_email_id() throws Throwable{
    	
    	loginPage = new LoginPage(driver);    	
    	loginPage.enterEmail("abha.nijhawan23gmail.com");
    	loginPage.clickSubmit();		    	
    }
	
    @Then ("^error message comes$")
	public void error_message_comes() throws Throwable{    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
    	System.out.println("Invalid email id");
    }
	
    @And ("^enters valid email id$")
   	public void enters_valid_email_id() throws Throwable{
    	loginPage = new LoginPage(driver);    	
    	loginPage.enterEmail("abha.nijhawan23@gmail.com");
    	loginPage.clickSubmit();      	
    }
    
    @Then ("^successfully registered$")
    public void successfully_registered() throws Throwable{
    	System.out.println("Successfully Registered");
    }
      
    @When ("^user hovers on DRESSES$")
    public void user_hovers_on_DRESSES() throws Throwable{
    	
    	megaMenuPage = new MegaMenuPage(driver);
    	megaMenuPage.hoverDresses();  	
    }
    
    @And ("^clicks on SUMMER DRESSES$")
    public void clicks_on_SUMMER_DRESSES() throws Throwable{
    	megaMenuPage = new MegaMenuPage(driver);
    	megaMenuPage.clickSummerDresses();	
    }
    
    @Then ("^megamenu working fine$")
    public void megamenu_working_fine() throws Throwable{
    	System.out.println("Megamenu is working fine");
    }
    
    @When ("^user selects a dress$")
    public void user_selects_a_dress() throws Throwable{
    	cartPage = new CartPage(driver);
    	cartPage.clickPrintedDress();
    }
    
    @And ("^enters quantity as two and clicks on add to cart and validate details$")
    public void enters_quantity_as_two_and_clicks_on_add_to_cart() throws Throwable{
    	
    	cartPage = new CartPage(driver);
    	cartPage.sendKeysQuality();
    	cartPage.clickAddToCart();
    }
        
    
	
}
