package seleniumcore.concepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://formy-project.herokuapp.com/switch-window");
		
		WebElement button=driver.findElement(By.xpath("//button[@id='new-tab-button']"));
		String parentWindow=driver.getWindowHandle();// get current tab's id
		button.click();
		System.out.println(parentWindow);
		
		Set<String> handles=driver.getWindowHandles();// returning window id of all open tabs
		System.out.println(handles.size());
		
		Iterator <String> iterate=handles.iterator();
		while(iterate.hasNext())
		{
			String id=iterate.next();
			if(!(id.equals(parentWindow)))
			{
				driver.switchTo().window(id);
				break;
			}
		}
		WebElement title=driver.findElement(By.xpath("//h1[contains(text(),'Welcome to Formy')]"));
		System.out.println(title.getText());//now current control is on the second tab
				driver.close();// current tab will close(here second tab)
				driver.switchTo().window(parentWindow);//you should use this to get control in the current tab means.parent tab
		
	}

}
