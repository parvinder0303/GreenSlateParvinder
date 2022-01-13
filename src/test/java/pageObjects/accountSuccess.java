package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class accountSuccess {
	
	WebDriver driver;
	
	public accountSuccess(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[@normalize-space()='Your Account Has Been Created!']")
	WebElement accountConfirmationMessage;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement Logout;

	public void accountCreated() {
		try {
		accountConfirmationMessage.getText();
	}
		catch(Exception e) {
			e.getMessage();
		}
}
	
	public void clickLogout() {
		Logout.click();
}
}
