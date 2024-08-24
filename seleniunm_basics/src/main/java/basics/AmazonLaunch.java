package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		searchfield.click();
		searchfield.sendKeys("mobile");
		//searchfield.clear();
		
	}

}
