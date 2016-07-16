package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import PageLocators.HomePageLocators;

public class HomePage {
	public static WebDriver driver;
	public static WebDriverWait sync;
	public static String startImg;
	public static String CurrentImg;
	public static int count=0;

	
	public static void Verify_logo(WebDriver driver,WebDriverWait sync)
	{
		try
		{
		HomePageLocators.logo(driver, sync);
		Reporter.log("Presence of logo is verified");
		}
		catch(Exception e)
		{
			//Reporter.log("Logo is missing");
			Assert.fail("logo is mising");
			
		}
		
	}
	
	public static void Verify_SearchBar(WebDriver driver,WebDriverWait sync)
	{
		try
		{
		HomePageLocators.SearchBar(driver, sync);
		Reporter.log("Presence of SearchBar is verified");
		}
		catch(Exception e)
		{
			//Reporter.log("Logo is missing");
			Assert.fail("SearchBar is missing");
			
		}	
	}
	
	public static void Verify_PresenceOfHeaderCategories(WebDriver driver,WebDriverWait sync)
	{
		
		try
		{
		HomePageLocators.HeadersForCategories(driver, sync);
		Reporter.log("Headers for different categories are verified");
		}
		catch(Exception e)
		{
			//Reporter.log("Logo is missing");
			Assert.fail("Categories Header is mising");		
		}
		
	}
	
	public static void verify_AboutUS(WebDriver driver,WebDriverWait sync)
	{
		try
		{
			HomePageLocators.AboutUs(driver, sync);
			Reporter.log("Presence of About US Section is veified");
		}
		catch(Exception e)
		{
			Assert.fail("About Us section is missing");
		}
	}
	
	public static void Click_SwimLane(WebDriver driver,WebDriverWait sync)
	{
		HomePageLocators.SwimLaneBanner(driver, sync).click();
		
	}
	
	public static void verify_CountOfImagesInSwimLane(WebDriver driver,WebDriverWait sync)
	{
		
		
	}
	
	
	

}
