package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.amazon.in/");//navigate don't clear previous data
		 driver.navigate().to("https://www.flipkart.com/");
	      driver.navigate().back();  
	      driver.navigate().forward();
	      driver.navigate().refresh();//for refreshing page
	     

	}

}
