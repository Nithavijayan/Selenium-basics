package seleniumcore.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Guru99 Demo Sites']"));
		
		Boolean logopic= logo.isDisplayed();
			System.out.println("logo selection :"+logopic);
		
		//driver.switchTo().frame("a077aa5e");
		driver.switchTo().frame(1);
		WebElement image = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		
		Boolean img= image.isDisplayed();
			System.out.println("image display :"+img);
		
		driver.switchTo().defaultContent();// to return back
		
		
	}

}
