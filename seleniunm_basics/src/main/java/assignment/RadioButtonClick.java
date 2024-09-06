package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		
		WebElement radiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		
		if(radiobutton.isSelected()==false)
			radiobutton.click();
	}

}
