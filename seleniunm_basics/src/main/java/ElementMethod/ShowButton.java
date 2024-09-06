package ElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShowButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
		String buttonvalue=button.getAttribute("class");
		System.out.println(buttonvalue);
		
		String bckcolour=button.getCssValue("background-color");
		System.out.println(bckcolour);
		
		String style=button.getCssValue("font-style");
		String size=button.getCssValue("font-size");
		String colour=button.getCssValue("color");
		
		System.out.println(style);
		System.out.println(size);
		System.out.println(colour);
	}

}
