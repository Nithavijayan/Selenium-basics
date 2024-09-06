package keyboard.n.mouse;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		WebElement button1=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		WebElement button2=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions action=new Actions(driver);
		//action.contextClick().build().perform();//click right click on anywhere in the page
		
		action.contextClick(button2).build().perform();
		
		WebElement button1expand=driver.findElement(By.xpath("//span[contains(text(),'Copy')]"));
		action.click(button1expand).build().perform();
		driver.switchTo().alert().accept();
		//action.doubleClick().build().perform();// double click where the mouse cursor
		action.doubleClick(button1).build().perform();//double click on th ewebelement,, all these are method overloading
	}

}
