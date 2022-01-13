package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.YourStore;
import testBase.BaseClass;

public class TestScenario_SearchOrderSpecificProduct extends BaseClass{

	@Test
	public void SearchOrderProduct() {
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		String productSearching=rb.getString("searchProduct");
		
		HomePage hp=new HomePage(driver);
		hp.input_Search(productSearching);
		hp.clickOnSearch();
		
		YourStore ys=new YourStore(driver);
		//System.out.println(ys.getProductName());
		//String pro=ys.getProductName();
		try {
		if(productSearching.equalsIgnoreCase(ys.getProductName())){
		ys.clickaddToCart();
		System.out.println(ys.ProductAdded());
		if(ys.ProductAdded().startsWith("Success")){
			//There is no product that matches the search criteria.
		System.out.println("Search Product is successfully added");
		//Assert.assertTrue(true);
		}
		else {
			System.out.println("Search product is not added");
		}
		}
		}
		catch(Exception e){
			if(ys.ProductNotPresent().equals("There is no product that matches the search criteria.")){
			System.out.println("Product is not present");
			//Assert.assertTrue(false);
		}
	}
	}
}
