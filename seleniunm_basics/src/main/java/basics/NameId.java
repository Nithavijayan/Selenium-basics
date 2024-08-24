package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		//driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement textfield=driver.findElement(By.name("email"));
		textfield.click();
		textfield.sendKeys("abc.123@gmail.com");
		
		WebElement textfield2=driver.findElement(By.name("pass"));
		textfield2.sendKeys("adcdefg");
		
		
		//WebElement classname=driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));
		//classname.click();
		//classname.sendKeys("abc");
		
		
		
		

	}

}
