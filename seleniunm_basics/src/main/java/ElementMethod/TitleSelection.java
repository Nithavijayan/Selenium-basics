package ElementMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class TitleSelection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		List <WebElement> menu = driver.findElements(By.xpath("//div[@id='nav-xshop']//a"));
         
		for(int i=0;i<menu.size();i++)
		{
			String menulist=menu.get(i).getText();
			System.out.println(menulist);
		}
	}

}
