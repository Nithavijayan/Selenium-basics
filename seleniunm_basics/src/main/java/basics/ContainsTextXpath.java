package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsTextXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[contains(@id,'searchDropdownBox')]"));//by using, contains (attribute)
		dropdown.click();
		
		WebElement deliveringto=driver.findElement(By.xpath("//span[contains(text(),'Delivering to Thir')]"));//by using, contains(text())		
		deliveringto.click();
	}

}
