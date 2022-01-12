package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement myaccount;
	
	@FindBy(linkText="Register")
	WebElement register;
	
	@FindBy(xpath="//input[@name='search']")
	WebElement InputSearch;
	
	@FindBy(xpath="//span[@class='input-group-btn']")
	WebElement Click_Search;
	
	@FindBy(id="form-currency")
	WebElement ClickCurrency;
	
	@FindBy(xpath="//form[@id='form-currency']//li/button[normalize-space()='€ Euro']")
	WebElement ChangeCurrency;
	
	@FindBy(xpath="//form[@id='form-currency']//strong")
	WebElement currencySelected;
	
	@FindBy(xpath="//p[@class='price']")
	WebElement locatePrice;
	
	public void click_myAccount() {
		myaccount.click();
	}
	
	public void click_Register() {
		register.click();
	}
	
	public void input_Search(String product) {
		InputSearch.sendKeys(product);
	}
	
	public void clickOnSearch() {
		Click_Search.click();
	}
	
	public void clickCurrencyDropDown() {
		ClickCurrency.click();
	}
	
	public void clickToChangeCurrency() {
		ChangeCurrency.click();
	}
	
	public String getCurrency() {
		return currencySelected.getText();
	}
	
	public String getPriceValue() {
	return locatePrice.getText();
	}
}
