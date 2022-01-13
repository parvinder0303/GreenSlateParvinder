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
	
	@FindBy(xpath="//div[contains(text(), 'Success: You have added ')]")
	WebElement SuccessAddedMessage;
	
	@FindBy(xpath="//div[normalize-space()=' Warning: E-Mail Address is already registered!']")
	WebElement AlreadyExistUser;
	
	@FindBy(xpath="//div[@class='caption']/h4/a")
	WebElement productName;
	
	@FindBy(xpath="//p[normalize-space()='There is no product that matches the search criteria.']")
	WebElement ProductNotFoundMessage;
	
	public void clickaddToCart() {
		AddToCart.click();
	}
	
	public String ProductAdded() {
		try{
			return SuccessAddedMessage.getText();
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}
	
	public boolean isDisplayedProductName() {
		return productName.isDisplayed();
	}
	
	
	public String getProductName() {
		return productName.getText();
	}
	
	public String ProductNotPresent() {
		return ProductNotFoundMessage.getText();
	}
	
}
