package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPgm1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.navigate().to("https://selenium.qabible.in/dynamic-load.php");	
		WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Get New User')]"));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[@class='card-title']")));

		WebElement name=driver.findElement(By.xpath("//h5[@class='card-title']")); 
		System.out.println(name.getText());
		
		WebElement email=driver.findElement(By.xpath("//p[@class='card-text text-center p-3']")); 
		System.out.println(email.getText());
			 
	}
}
