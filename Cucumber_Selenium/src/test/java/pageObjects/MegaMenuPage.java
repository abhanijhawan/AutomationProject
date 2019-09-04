package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.WaitHelper;

public class MegaMenuPage {
	
private WebDriver driver;
	
	WaitHelper waitHelper;
	
	@FindBy(linkText="DRESSES")
	public static WebElement DRESSES;
	
	@FindBy(linkText="SUMMER DRESSES")
	public static WebElement SUMMER_DRESSES;
	
	public MegaMenuPage(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		waitHelper=new WaitHelper(driver);
		waitHelper.WaitForElement(DRESSES ,60);
	 }
	
	public void hoverDresses()
	{
		Actions hover = new Actions(driver);
		hover.moveToElement(DRESSES).build().perform(); 
	}
	
	public void clickSummerDresses()
	{
		SUMMER_DRESSES.click(); 
	}
}
