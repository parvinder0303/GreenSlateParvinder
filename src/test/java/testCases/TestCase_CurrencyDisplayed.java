package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TestCase_CurrencyDisplayed extends BaseClass {

	@Test
	public void SelectedCurrencyDisplayed() {
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver);
		hp.clickCurrencyDropDown();
		hp.clickToChangeCurrency();
		System.out.println(hp.getCurrency());
		//String sign=hp.getCurrency();
		//String pr=hp.getPriceValue();
		//System.out.println(pr);
		//System.out.println(sign);
		if(hp.getPriceValue().contains(hp.getCurrency())) {
			System.out.println("Product price is displayed in the selected currency");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Product price is displayed in the selected currency");
			Assert.assertTrue(false);
		}
	}
}
