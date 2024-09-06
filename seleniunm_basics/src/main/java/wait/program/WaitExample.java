package wait.program;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Start')]"));
		button.click();
	
		Thread.sleep(7000);// java wait, wait for 7 seconds
		WebElement secondtab=driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
		System.out.println(secondtab.getText());
	
	}

}
