package seleniumcore.concepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://formy-project.herokuapp.com/switch-window");
		
		WebElement button=driver.findElement(By.xpath("//button[@id='new-tab-button']"));
		String parentWindow=driver.getWindowHandle();// get current tab's id
		button.click();
		System.out.println(parentWindow);
		
		Set<String> handles=driver.getWindowHandles();// returning all open tabs id
		System.out.println(handles.size());
		System.out.println(handles);
		
		for(String id:handles)
		{
			if(!(id.equals(parentWindow)))
			{
				driver.switchTo().window(id);
				break;
			}
		}	
		
		WebElement secondtab=driver.findElement(By.xpath("//h1[contains(text(),'Welcome to Formy')]"));
		System.out.println(secondtab.getText());
		driver.close();
		driver.switchTo().window(parentWindow);
	}

}
