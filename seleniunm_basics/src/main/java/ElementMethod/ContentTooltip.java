package ElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContentTooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		WebElement tooltip=driver.findElement(By.xpath("//select[@title='Search in']"));
	    String content=tooltip.getAttribute("title");// webelement te title kittum
	    System.out.println(content);
	    
	   
	}
	

}
