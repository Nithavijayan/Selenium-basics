package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariableXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/form-submit.php");
		
		String headerValue="Form with validations";
		String agreeValue="Agree to terms and conditions";
		String buttonValue="Submit form";
		
		WebElement header=driver.findElement(By.xpath("//div[contains(text(),'"+headerValue+"')]"));
		WebElement agreechekbox=driver.findElement(By.xpath("//label[contains(text(),'"+agreeValue+"')]"));
		WebElement button=driver.findElement(By.xpath("//button[contains(text(),'"+buttonValue+"')]"));
		
		String title=header.getText();
		String agree=agreechekbox.getText();
		String submit=button.getText();
		
		System.out.println(title);
		System.out.println(agree);
		System.out.println(submit);
	}

}
