package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");//clear history of cookies
		//driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        driver.get(url);// refreshing current url using get
        System.out.println(url);
	}

}
