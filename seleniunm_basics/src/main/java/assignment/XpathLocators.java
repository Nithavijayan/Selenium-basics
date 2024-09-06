package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/form-submit.php");
		
		WebElement firstname=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		firstname.sendKeys("Arundhati");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		lastname.sendKeys("Roy");
		
		WebElement usernamefield=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		usernamefield.sendKeys("abc.123");
		
		WebElement cityfield =driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		cityfield.sendKeys("Kolkata");
	}

}
