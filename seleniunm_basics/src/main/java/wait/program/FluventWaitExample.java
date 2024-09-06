package wait.program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluventWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Wait<WebDriver> wait =
		        new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(20))
		            .pollingEvery(Duration.ofMillis(300))//also we can use ofSeconds
		            .ignoring(ElementNotInteractableException.class);//ignoring exception
		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Start')]"));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//h4[contains(text(),'Hello World!')]"))));
			WebElement secondtab=driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
			System.out.println(secondtab.getText());
	}

}
