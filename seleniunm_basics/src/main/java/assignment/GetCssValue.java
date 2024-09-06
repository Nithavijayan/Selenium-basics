package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class GetCssValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/bootstrap-alert.php");
		
		WebElement greenbutton1=driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']"));
		WebElement yellowbutton2=driver.findElement(By.xpath("//button[@id='normal-btn-warning']"));
		WebElement bluebutton1=driver.findElement(By.xpath("//button[@id='autoclosable-btn-info']"));
		
		String greenBckColor=greenbutton1.getCssValue("background-color");
		String greenSize=greenbutton1.getCssValue("font-size");
		String greenColor=greenbutton1.getCssValue("color");
		String greenStyle=greenbutton1.getCssValue("font-style");
		
		String yellowBckColor=yellowbutton2.getCssValue("background-color");
		String yellowSize=yellowbutton2.getCssValue("font-size");
		String yellowColor=yellowbutton2.getCssValue("color");
		String yellowStyle=yellowbutton2.getCssValue("font-style");
		
		String blueBckColor=bluebutton1.getCssValue("background-color");
		String blueSize=bluebutton1.getCssValue("font-size");
		String blueStyle=bluebutton1.getCssValue("font-style");
		String blueColor=bluebutton1.getCssValue("color");
		
		System.out.println(greenBckColor);
		System.out.println(greenColor);
		System.out.println(greenSize);
		System.out.println(greenStyle);
		System.out.println();
		
		System.out.println(yellowBckColor);
		System.out.println(yellowColor);
		System.out.println(yellowSize);
		System.out.println(yellowStyle);
		System.out.println();
		
		System.out.println(blueBckColor);
		System.out.println(blueColor);
		System.out.println(blueSize);
		System.out.println(blueStyle);
		System.out.println();
	}

}
