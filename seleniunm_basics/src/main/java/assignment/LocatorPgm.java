package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPgm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement searchfield=driver.findElement(By.className("form-control"));
		searchfield.sendKeys("Good Morning");
		
		
		WebElement button=driver.findElement(By.cssSelector(".btn.btn-primary"));
		button.click();
		//searchfield.clear();
	
	}

}
