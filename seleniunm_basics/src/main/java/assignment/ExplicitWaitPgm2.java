package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPgm2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
		
		driver.navigate().to("https://selenium.qabible.in/jquery-progress-bar.php");	
		WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Start Download')]"));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Complete')]")));

		WebElement message=driver.findElement(By.xpath("//div[contains(text(),'Complete')]")); 
		System.out.println(message.getText());
	}

}
