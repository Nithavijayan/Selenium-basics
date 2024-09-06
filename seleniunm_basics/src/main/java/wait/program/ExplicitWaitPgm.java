package wait.program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPgm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));//explicit wait declaration
	
		driver.navigate().to("https://selenium.qabible.in/jquery-progress-bar.php");
		WebElement button=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
		
		
		WebElement button2=driver.findElement(By.xpath("//button[contains(text(),'Cancel Download')]"));
		System.out.println(button2.getText());
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[contains(text(),'Cancel Download')]")));
	}

}
