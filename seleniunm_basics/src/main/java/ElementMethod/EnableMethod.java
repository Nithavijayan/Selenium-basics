package ElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://formy-project.herokuapp.com/enabled");
	
		WebElement field1=driver.findElement(By.xpath("//input[@id='disabledInput']"));
		WebElement field2=driver.findElement(By.xpath("//input[@id='input']"));
		//field2.sendKeys("hello");
		
		
		System.out.println("textfield1 isDisplayed "+field1.isDisplayed());
		System.out.println("textfield2 isDisplayed "+field2.isDisplayed());
		
		System.out.println("textfield1 isEnabled "+field1.isEnabled());
		System.out.println("textfield2 isEnabled "+field2.isEnabled());
	}

}
