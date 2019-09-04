package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.WaitHelper;

public class LoginPage{
	
	private WebDriver driver;
	
	@FindBy(id="email_create")
	WebElement email_create;
	
	@FindBy(id="SubmitCreate")
	WebElement SubmitCreate;
	
	WaitHelper waitHelper;
	
	public LoginPage(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		waitHelper=new WaitHelper(driver);
		waitHelper.WaitForElement(email_create,60);
	 }
	
	public void enterEmail(String email_create)
	{
		this.email_create.sendKeys(email_create);
	}
	
	public void clickSubmit()
	{
		SubmitCreate.click();;
	}
	

}