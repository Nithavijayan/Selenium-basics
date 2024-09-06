package seleniumcore.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement button1=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		WebElement button2=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		WebElement button3=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		
		//button1.click();
		//driver.switchTo().alert().accept();
		
		button2.click();
	//	driver.switchTo().alert().dismiss();
		String message=driver.switchTo().alert().getText();
		System.out.println(message);
		
		//button3.click();
		
		//driver.switchTo().alert().sendKeys("successful");
		//driver.switchTo().alert().accept();
	}

}
