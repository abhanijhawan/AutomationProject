package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.WaitHelper;

public class HomePage{
	 
	private WebDriver driver;
	
	WaitHelper waitHelper;
	
	@FindBy(linkText="Sign in")
	public static WebElement sign_in;
	
	public HomePage(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		waitHelper=new WaitHelper(driver);
		waitHelper.WaitForElement(sign_in ,60);
	 }
	
	public void clickSignIn()
	{
		sign_in.click();;
	}
	
	
	

}
