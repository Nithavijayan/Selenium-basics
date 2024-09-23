package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	WebDriver driver;
	By logo=By.xpath("//a[@href='index.php']//img");
	
	
	
	public Home_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public boolean isLogoDisplayed()
	{
		WebElement element=driver.findElement(logo);
		return element.isDisplayed();
	}
	


}
