package ElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		String logintext="Log in";
		String forgottentext="Forgotten password?";
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[contains(text(),'"+logintext+"')]"));
	    WebElement forgotten=driver.findElement(By.xpath("//a[contains(text(),'"+forgottentext+"')]"));
		
	    String text1=loginbutton.getText();
		String text2=forgotten.getText();
		
		System.out.println(text1);
		System.out.println(text2);
		
	}

}
