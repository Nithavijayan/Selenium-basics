package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		
		WebElement parentWindow=driver.findElement(By.xpath("//a[contains(text(),'Like us On Facebook')]"));
		String button=driver.getWindowHandle();
		parentWindow.click();
		System.out.println(button);
		
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles.size());
		
		for(String id:handles)
		{
			if((!id.equals(button)))
			{
				driver.switchTo().window(id);
				break;
			}
		}
		
		WebElement secondwindow=driver.findElement(By.xpath("(//span[contains(text(),'See more on Facebook')])[1]"));
		String newWindow=secondwindow.getText();
		System.out.println(newWindow);
		
	}

}
