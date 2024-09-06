package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListCheckboxSelection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		
		List <WebElement> checkbox = driver.findElements(By.xpath("//div[@class='form-group']//input"));
		
		for(int i=0;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}
		/*for(WebElement element:checkbox)
		{
			element.click();
		}
       */
	}

}
