package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inputform_Page {
	
	WebDriver driver;
	By inputformmenu=By.xpath("//a[contains(text(),'Input Form')]");
	By inputformheader=By.xpath("//div[contains(text(),'Single Input Field')]");
	By showmessagebutton=By.xpath("//button[@id='button-one']");
	
	public Inputform_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void clickOnInputformMenu()
	{
		WebElement element=driver.findElement(inputformmenu);
		element.click();
	}
	
	public String getInputformHeader()
	{
		WebElement element=driver.findElement(inputformheader);
		return element.getText();
	}
	
	public String getShowMessageColor()
	{
		WebElement element=driver.findElement(showmessagebutton);
		return element.getCssValue("background-color");
		
	}
	
}
