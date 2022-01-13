package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TestScenario_PriceDisplayedSelectedCurrency extends BaseClass {

	@BeforeMethod
	public void getWindowSettings() {
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	public void DefaultCurrencyDisplayed() throws IOException {        	 
		
		
		HomePage hp=new HomePage(driver);
		System.out.println(hp.getCurrency());
		if(hp.getPriceValue().contains(hp.getCurrency())) {
			System.out.println("Product price is displayed  in the $ US Dollar currency");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Product price is displayed in the selected currency");
			screenShotCapture(driver, "Product price is not present in Euro");
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=2)
	public void EuroCurrencyDisplayed() throws IOException {        	 
		
		
		HomePage hp=new HomePage(driver);
		hp.clickCurrencyDropDown();
		hp.clickToChangeCurrencyEuro();
		System.out.println(hp.getCurrency());
		if(hp.getPriceValue().contains(hp.getCurrency())) {
			System.out.println("Product price is displayed  in the € Euro currency");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Product price is displayed in the € Euro currency");
			screenShotCapture(driver, "Product price is not present in Euro");
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=3)
	public void PoundCurrencyDisplayed() throws IOException {        	 
		
		HomePage hp=new HomePage(driver);
		hp.clickCurrencyDropDown();
		hp.clickToChangeCurrencyPound();
		System.out.println(hp.getCurrency());
		if(hp.getPriceValue().contains(hp.getCurrency())) {
			System.out.println("Product price is displayed  in the £ Pound Sterling currency");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Product price is displayed in the £ Pound Sterling currency");
			screenShotCapture(driver, "Product price is not present in Euro");
			Assert.assertTrue(false);
		}
	}
}
