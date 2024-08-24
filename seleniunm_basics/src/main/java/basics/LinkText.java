package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();

		//WebElement hyperlink=driver.findElement(By.linkText("Forgotten password?"));
		//hyperlink.click();
		
		WebElement hyperlink=driver.findElement(By.partialLinkText("Forgotten"));
		hyperlink.click();
		
	}

}
