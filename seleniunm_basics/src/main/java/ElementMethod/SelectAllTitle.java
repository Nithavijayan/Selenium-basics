package ElementMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/index.php");
		
		List<WebElement> menuItem = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
		
		System.out.println(menuItem.size());
		
		for(int i=0;i<menuItem.size();i++)
		{
			String list=menuItem.get(i).getText();
			System.out.println(list);
		}
		
		for(WebElement element:menuItem)
		{
			String menu=element.getText();
			System.out.println(menu);
		}
		for(WebElement attribute:menuItem)
		{
			String menuAttribute=attribute.getAttribute("class");
			System.out.println(menuAttribute);
		}
		
	}

}
