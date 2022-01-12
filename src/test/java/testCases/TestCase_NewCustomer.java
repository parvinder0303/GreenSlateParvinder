package testCases;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.accountRegister;
import pageObjects.accountSuccess;
import testBase.BaseClass;

public class TestCase_NewCustomer extends BaseClass{
	
	@Test
	public void testAccountRegistration() {
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver);
		hp.click_myAccount();
		hp.click_Register();
		
		accountRegister ar=new accountRegister(driver);
		ar.enterFirstName("Parvinder");
		ar.enterLastName("Singh");
		ar.enterEmail(random_String()+"@gmail.com");
		ar.enterTelephone("1234567890");
		ar.enterPassword("qwertyuiop");
		ar.enterConfirmPassword("qwertyuiop");
		ar.click_PrivacyPolicy();
		ar.click_Continue();
		
		accountSuccess as=new accountSuccess(driver);
		as.accountCreated();
		
		if(driver.getPageSource().contains("Your Account Has Been Created!")) {
			System.out.println("Website allows new user to register");
		}
		else {
			System.out.println("Website doesn't allow new user to register");
		}
	}
	
	public String random_String() {
		String got_String=RandomStringUtils.randomAlphabetic(5);
		return got_String;
	}
	

}
