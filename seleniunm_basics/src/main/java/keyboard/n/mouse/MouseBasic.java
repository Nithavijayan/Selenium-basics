package keyboard.n.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.ImmutableBiMap.Builder;

public class MouseBasic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		Actions action=new Actions(driver);
		WebElement signin=driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]"));
		//action.moveToElement(signin).build().perform();//when use mouse u should use build().perform()
		action.click(signin).build().perform();
	

  }
}