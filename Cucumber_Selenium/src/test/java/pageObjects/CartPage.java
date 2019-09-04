package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.WaitHelper;

public class CartPage {

	private WebDriver driver;

	WaitHelper waitHelper;
	public String quanValue;

	@FindBy(linkText = "Printed Chiffon Dress")
	public static WebElement printed_dress;

	@FindBy(id = "quantity_wanted")
	public static WebElement quantity_wanted;

	@FindBy(id = "add_to_cart")
	public static WebElement add_to_cart;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickPrintedDress() {
		printed_dress.click();
	}

	public void sendKeysQuality() {
		quantity_wanted.clear();
		quantity_wanted.sendKeys("2");

		quanValue = quantity_wanted.getAttribute("value");
	}

	public void clickAddToCart() {
		add_to_cart.click();
		if (quanValue.equals("2")) {
			System.out.println("Dress is validated in cart");
		}
	}

}
