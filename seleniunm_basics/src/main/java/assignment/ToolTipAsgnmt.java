package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipAsgnmt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		
		WebElement button1=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		WebElement button2=driver.findElement(By.xpath("//a[@id='windowMulti']"));
		
		String tooltip1=button1.getAttribute("title");
		String tooltip2=button2.getAttribute("title");
		
		System.out.println(tooltip1);
		System.out.println(tooltip2);
	}

}
