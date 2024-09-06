package keyboard.n.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
		//draging one webelement and droping to other element
		
		WebElement source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(source, destination).build().perform();//source webelemnet dragged n drop to destination webelement
	
	}

}
