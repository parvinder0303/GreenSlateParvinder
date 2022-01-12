package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.YourStore;
import testBase.BaseClass;

public class TestCase_SearchAndOrderProduct extends BaseClass{

	@Test
	public void SearchOrderProduct() {
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver);
		hp.input_Search("phone");
		hp.clickOnSearch();
		
		YourStore ys=new YourStore(driver);
		ys.clickaddToCart();
		ys.ProductAdded();
	}
}
