package keyboard.n.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteraction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		WebElement searchfield=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions action=new Actions(driver);
		action.clickAndHold(searchfield).build().perform();// click and hold in that webelement
		action.release(searchfield).build().perform();// to release from click n hold
		//action.sendKeys(searchfield,"pillow").build().perform();
		//action.keyDown(searchfield,Keys.ENTER).build().perform();
	}

}
