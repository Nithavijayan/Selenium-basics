package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		//WebElement search=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		//search.sendKeys("light");
		
		WebElement search=driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute"));
		search.sendKeys("light");
		
	}

}
