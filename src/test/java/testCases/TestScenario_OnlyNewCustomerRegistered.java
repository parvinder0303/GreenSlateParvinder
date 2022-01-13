package testCases;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.accountRegister;
import pageObjects.accountSuccess;
import testBase.BaseClass;

public class TestScenario_OnlyNewCustomerRegistered extends BaseClass{
	
	@BeforeMethod
	public void OpenCartUrl() {
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void newUserRegistration() {
		
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
		
		//accountSuccess as=new accountSuccess(driver);
		//as.accountCreated();
		
		try {
		if(driver.getPageSource().contains("Your Account Has Been Created!")) {
			System.out.println("Website allows new user to register");
			hp.click_myAccount();
			accountSuccess as=new accountSuccess(driver);
			as.clickLogout();
		}
		else if(driver.getPageSource().contains(" Warning: E-Mail Address is already registered!")){
			System.out.println("Website doesn't allow already existing user to register");
		}
		}
		catch(Exception e) {
			System.out.println("Not letting new user register");
		}
		
			
	}
	
	@Test(priority=2)
public void existingUserRegistration() {
		
		HomePage hp=new HomePage(driver);
		hp.click_myAccount();
		hp.click_Register();
		
		accountRegister ar=new accountRegister(driver);
		ar.enterFirstName("Parvinder");
		ar.enterLastName("Singh");
		ar.enterEmail("abc@gmail.com");
		ar.enterTelephone("1234567890");
		ar.enterPassword("qwertyuiop");
		ar.enterConfirmPassword("qwertyuiop");
		ar.click_PrivacyPolicy();
		ar.click_Continue();
		
		//accountSuccess as=new accountSuccess(driver);
		//as.accountCreated();
		
		
		try {
		if(driver.getPageSource().contains("Your Account Has Been Created!")) {
			System.out.println("Website allows old user to register");
			hp.click_myAccount();
			accountSuccess as=new accountSuccess(driver);
			as.clickLogout();
		}
		else if(driver.getPageSource().contains(" Warning: E-Mail Address is already registered!")){
			System.out.println("Website doesn't allow already existing user to register");
		}	
	}
		catch(Exception e) {
			System.out.println("Some issue with the registration process");
		}
	}
	
	public String random_String() {
		String got_String=RandomStringUtils.randomAlphabetic(5);
		return got_String;
	}
	

}
