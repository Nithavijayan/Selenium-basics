package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		
        WebElement checkbox1=driver.findElement(By.xpath("//input[@id='gridCheck']"));
        WebElement checkbox2=driver.findElement(By.xpath("//input[@id='check-box-one']"));
        WebElement checkbox3=driver.findElement(By.xpath("//input[@id='check-box-two']"));
        WebElement checkbox4=driver.findElement(By.xpath("//input[@id='check-box-three']"));
        WebElement checkbox5=driver.findElement(By.xpath("//input[@id='check-box-four']"));
        WebElement selectbutton=driver.findElement(By.xpath("//input[@id='button-two']"));
        
        if(checkbox1.isSelected()==false)
        	checkbox1.click();
        if(checkbox2.isSelected()==false)
        	checkbox2.click();
        if(checkbox3.isSelected()==false)
        	checkbox3.click();
        if(checkbox4.isSelected()==false)
        	checkbox4.click();
        if(checkbox5.isSelected()==false)
        	checkbox5.click();
        
        selectbutton.click();
	}

}
