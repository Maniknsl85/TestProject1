package PageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageLocators {
	public static WebDriver driver;
	public static WebDriverWait sync;
	public static WebElement element;
	public static String locator;
	
	public static WebElement logo(WebDriver driver,WebDriverWait sync)
	{
		locator=".//*[@id='nav-logo']";
		sync.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		element=driver.findElement(By.xpath(locator));
		return element;
		
	}
	public static WebElement AboutUs(WebDriver driver,WebDriverWait sync)
	{
		locator="//td[contains(text(),'About Us')]";
		sync.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		element=driver.findElement(By.xpath(locator));
		return element;
		
	}
	
	
	public static WebElement SearchBar(WebDriver driver,WebDriverWait sync)
	{
		locator=".//*[@id='twotabsearchtextbox']";
		sync.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		element=driver.findElement(By.xpath(locator));
		return element;
				
	}
	
	public static WebElement offer_Logo(WebDriver driver,WebDriverWait sync)
	{
		locator=".//*[@id='nav-swm-holiday-map']/area";
		sync.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		element=driver.findElement(By.xpath(locator));
		return element;
	}
	
	public static WebElement MenuBar_ShopByCategory(WebDriver driver,WebDriverWait sync)
	{
		locator=".//*[@id='nav-link-shopall']";
		sync.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		element=driver.findElement(By.xpath(locator));
		return element;
		
	}
	
	public static WebElement MenuBar_AmazonIn(WebDriver driver,WebDriverWait sync)
	{
		locator=".//*[@id='nav-your-amazon']";
		sync.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		element=driver.findElement(By.xpath(locator));
		return element;
		
	}
	
	public static WebElement MenuBar_TodaysDeal(WebDriver driver,WebDriverWait sync)
	{
		locator=".//*[@id='nav-xshop']/a[2]";
		sync.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		element=driver.findElement(By.xpath(locator));
		return element;
		
	}
	public static WebElement MenuBar_GiftCards(WebDriver driver,WebDriverWait sync)
	{
		locator=".//*[@id='nav-xshop']/a[3]";
		sync.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		element=driver.findElement(By.xpath(locator));
		return element;
		
	}
	public static WebElement MenuBar_Sell(WebDriver driver,WebDriverWait sync)
	{
		locator=".//*[@id='nav-xshop']/a[4]";
		sync.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		element=driver.findElement(By.xpath(locator));
		return element;
		
	}
	public static WebElement MenuBar_CustomerService(WebDriver driver,WebDriverWait sync)
	{
		locator=".//*[@id='nav-xshop']/a[5]";
		sync.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		element=driver.findElement(By.xpath(locator));
		return element;
		
	}
	
	public static WebElement MenuBar_Accounts(WebDriver driver,WebDriverWait sync)
	{
		locator=".//*[@id='nav-link-yourAccount']/span[2]";
		sync.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		element=driver.findElement(By.xpath(locator));
		return element;
		
	}
	public static WebElement MenuBar_WishList(WebDriver driver,WebDriverWait sync)
	{
		locator=".//*[@id='nav-link-wishlist']";
		sync.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		element=driver.findElement(By.xpath(locator));
		return element;
		
	}
	public static WebElement MenuBar_Cart(WebDriver driver,WebDriverWait sync)
	{
		locator=".//*[@id='nav-cart']";
		sync.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		element=driver.findElement(By.xpath(locator));
		return element;
		
	}
	
	public static WebElement SwimLaneBanner	(WebDriver driver,WebDriverWait sync)
	{
		locator="//span[@style='display:inline-block']/a/img";
		sync.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		sync.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		element=driver.findElement(By.xpath(locator));
		return element;
		
	}
	
	public static WebElement HeadersForCategories(WebDriver driver,WebDriverWait sync)
	{
		locator="//div[@id='btfContent']/div/div/div/h2";
		sync.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		element=driver.findElement(By.xpath(locator));
		return element;
		
	}
	
	
}
	
	
	
	
	
	
	
	
	
