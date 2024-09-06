package keyboard.n.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor;

public class KeyboardExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		WebElement searchfield=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//searchfield.sendKeys("pendrive"+Keys.ENTER);
		searchfield.sendKeys("curtain plants for home");
		searchfield.sendKeys(Keys.BACK_SPACE);
		searchfield.sendKeys(Keys.chord(Keys.CONTROL,"a"));//it will select all (ctrl+a)
		
	}

}
