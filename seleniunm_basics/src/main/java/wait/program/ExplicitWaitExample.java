package wait.program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));//explicit wait declaration
	
		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Start')]"));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Hello World!')]")));
		//visible aakunna time vare wait cheyyanam
	    WebElement secondtab=driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
		System.out.println(secondtab.getText());
		
	}

}
