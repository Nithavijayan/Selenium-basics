package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAsgnmtOne {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
        WebElement messagefield=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
        messagefield.sendKeys("Hello Everyone");
        
        WebElement showbutton=driver.findElement(By.xpath("//button[text()='Show Message']"));
        showbutton.click();
        
        WebElement checkboxdemolink=driver.findElement(By.xpath("//li[@class='list-group-item']//a[@href='check-box-demo.php']"));
        checkboxdemolink.click();
	}

}
