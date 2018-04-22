package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector(".text-center>h2");
	By NavBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	By textvalid=By.cssSelector(".text-center");
	
	
	
	
	
	public LandingPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
		
	}




	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}


	public WebElement textvlida() {
		// TODO Auto-generated method stub
		return driver.findElement(textvalid);
	}
	
}
