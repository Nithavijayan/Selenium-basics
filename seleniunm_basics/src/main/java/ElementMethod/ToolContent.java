package ElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolContent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.navigate().to("https://demo.guru99.com/test/social-icon.html");
		    
		    WebElement icon1=driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
		    WebElement icon2=driver.findElement(By.xpath("//a[@class='fa fa-lg fa-youtube']"));
		    
		    String iconvalue1=icon1.getAttribute("title");// webelement te title kittum
		    String iconvalue2=icon2.getAttribute("title");
		    
		    System.out.println(iconvalue1);
		    System.out.println(iconvalue2);
		    
		    int x=icon1.getLocation().getX();// it will give x-axis value of webelement
		    System.out.println(x);
		    
		    int y=icon2.getLocation().getY();
		    System.out.println(y);
		    
		    
	}

}
