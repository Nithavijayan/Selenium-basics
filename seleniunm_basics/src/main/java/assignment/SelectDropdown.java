package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		
		Select select=new Select(dropdown);
		select.selectByIndex(1);
		select.selectByValue("Yellow");
	}

}
