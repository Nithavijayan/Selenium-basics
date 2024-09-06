package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		
		WebElement checkbox1=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		WebElement checkbox2=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement checkbox3=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement checkbox4=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement checkbox5=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		
		if(checkbox1.isDisplayed())
			System.out.println("first checkbox isDisplayed :"+checkbox1.isDisplayed());
		if(checkbox1.isEnabled())
			System.out.println("isEnabled :"+checkbox1.isEnabled());
		System.out.println();
		
		if(checkbox2.isDisplayed())
			System.out.println("second checkbox isDisplayed :"+checkbox2.isDisplayed());
		if(checkbox2.isEnabled())
			System.out.println("isEnabled :"+checkbox2.isEnabled());
		System.out.println();
		
		if(checkbox3.isDisplayed())
			System.out.println("third checkbox isDisplayed :"+checkbox3.isDisplayed());
		if(checkbox3.isEnabled())
			System.out.println("isEnabled :"+checkbox3.isEnabled());
		System.out.println();
		
		if(checkbox4.isDisplayed())
			System.out.println("fourth checkbox isDisplayed :"+checkbox4.isDisplayed());
		if(checkbox4.isEnabled())
			System.out.println("isEnabled :"+checkbox4.isEnabled());
		System.out.println();
		
		if(checkbox5.isDisplayed())
			System.out.println("fifth checkbox isDisplayed :"+checkbox5.isDisplayed());
		if(checkbox5.isEnabled())
			System.out.println("isEnabled :"+checkbox5.isEnabled());
		System.out.println();
	}

}
