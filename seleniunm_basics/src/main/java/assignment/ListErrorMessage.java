package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListErrorMessage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/form-submit.php");
		
		WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Submit form')]"));
		button.click();
		List<WebElement> message = driver.findElements(By.xpath("//div[@class='invalid-feedback']"));
		
		
		for(int i=0;i<message.size();i++)
		{
			String errormsg=message.get(i).getText();
			System.out.println(errormsg);
		}
	}

}
