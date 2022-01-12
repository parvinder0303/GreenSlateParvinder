package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountRegister {

	WebDriver driver;
	
	public accountRegister(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-firstname")
	WebElement FirstName;
	
	@FindBy(id="input-lastname")
	WebElement LastName;
	
	@FindBy(id="input-email")
	WebElement Email;
	
	@FindBy(id="input-telephone")
	WebElement Telephone;
	
	@FindBy(id="input-password")
	WebElement Password;
	
	@FindBy(id="input-confirm")
	WebElement ConfirmPassword;
	
	@FindBy(name="agree")
	WebElement PrivacyPolicy;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Continue;
	
	public void enterFirstName(String fname) {
		FirstName.sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		LastName.sendKeys(lname);
	}
	
	public void enterEmail(String email) {
		Email.sendKeys(email);
	}
	
	public void enterTelephone(String telephone) {
		Telephone.sendKeys(telephone);
	}
	
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirmpassword) {
		ConfirmPassword.sendKeys(confirmpassword);
	}
	
	public void click_PrivacyPolicy() {
		PrivacyPolicy.click();
	}
	
	public void click_Continue() {
		Continue.click();
	}
	
}
