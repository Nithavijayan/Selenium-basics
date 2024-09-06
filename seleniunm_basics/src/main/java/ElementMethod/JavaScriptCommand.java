package ElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");//scroll to a location with x,y cordinate
		
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Twitter')]"));
		js.executeScript("arguments[0].scrollIntoView();",link);//to scroll the window
		js.executeScript("arguments[0].click();",link);//to click the link
		
	}

}
