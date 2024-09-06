package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListgetText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/bootstrap-alert.php");
		
		List <WebElement> button = driver.findElements(By.xpath("//button[starts-with(@class,'btn')]"));
		
		for(int i=0;i<button.size();i++)
		{
			String text= button.get(i).getText();
			System.out.println(text);
			
			String bckColor=button.get(i).getCssValue("background-color");
			System.out.println(bckColor);
		}	
	}
}
