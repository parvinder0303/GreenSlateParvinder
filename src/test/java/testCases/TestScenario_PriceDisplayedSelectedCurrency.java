package testCases;

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
	public void DefaultCurrencyDisplayed() {        	 
		
		
		HomePage hp=new HomePage(driver);
		System.out.println(hp.getCurrency());
		if(hp.getPriceValue().contains(hp.getCurrency())) {
			System.out.println("Product price is displayed  in the $ US Dollar currency");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Product price is displayed in the selected currency");
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=2)
	public void EuroCurrencyDisplayed() {        	 
		
		
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
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=3)
	public void PoundCurrencyDisplayed() {        	 
		
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
			Assert.assertTrue(false);
		}
	}
}
