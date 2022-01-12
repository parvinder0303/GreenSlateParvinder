package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourStore {

	WebDriver driver;
	
	public YourStore(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Add to Cart']")
	WebElement AddToCart;
	
	@FindBy(xpath="//div[contains(text(), ' Success: You have added ')]")
	WebElement SuccessAddedMessage;
	
	public void clickaddToCart() {
		AddToCart.click();
	}
	
	public void ProductAdded() {
		try{
			SuccessAddedMessage.getText();
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	
	
}
