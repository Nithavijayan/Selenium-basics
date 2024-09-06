package ElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibilings {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		
		String checkbox1="Check Box Four";
		String textvalue="Single Checkbox Demo";
		String test="check-box-two";
		
		WebElement checkbox=driver.findElement(By.xpath("//label[contains(text(),'"+checkbox1+"')]//preceding-sibling::input"));
		checkbox.click();
		
		WebElement checkboxlabel=driver.findElement(By.xpath("//input[contains(@id,'gridCheck')]//following-sibling::label"));
		String label=checkboxlabel.getText();
		System.out.println(label);
		
		WebElement testobject=driver.findElement(By.xpath("//input[contains(@id,'"+test+"')]//following-sibling::label"));
		String value=testobject.getText();
		System.out.println(value);
		
		WebElement checkboxtext=driver.findElement(By.xpath("//div[contains(text(),'"+textvalue+"')]"));
		String checkboxvalue=checkboxtext.getText();
		System.out.println(checkboxvalue);
		
		
		
	}

}
