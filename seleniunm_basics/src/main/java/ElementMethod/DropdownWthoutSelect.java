package ElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWthoutSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/jquery-select.php");
		
		String value="California";
		
		WebElement dropdownclick = driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[1]"));
		dropdownclick.click();
		
		//WebElement dropdown = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		//dropdown.sendKeys(value);
		
		WebElement option = driver.findElement(By.xpath("//li[contains(text(),'California')]"));
		option.click();
		
		
	}

}
