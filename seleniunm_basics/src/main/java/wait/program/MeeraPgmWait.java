package wait.program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MeeraPgmWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		driver.navigate().to("https://www.qabible.in/payrollapp/site/login");
		WebElement textfield1= driver.findElement(By.xpath("//input[@id='loginform-username']"));
		textfield1.sendKeys("carol");
		
		WebElement textfield2= driver.findElement(By.xpath("//input[@id='loginform-password']"));
		textfield2.sendKeys("1q2w3e4r");
		
		WebElement loginbutton= driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		loginbutton.click();
		
		driver.navigate().to("https://www.qabible.in/payrollapp/site/index");
		WebElement workermenu= driver.findElement(By.xpath("//a[contains(text(),'Workers')]"));
		
		workermenu.click();
		
		WebElement name= driver.findElement(By.xpath("//input[@id='workersearch-first_name']"));
		name.sendKeys("ani");
		
		WebElement lstname= driver.findElement(By.xpath("//input[@id='workersearch-last_name']"));
		lstname.sendKeys("reji");
		
		WebElement postcode= driver.findElement(By.xpath("//input[@id='workersearch-postcode']"));
		postcode.sendKeys("CN23 5RB");
		
		WebElement ninmbr= driver.findElement(By.xpath("//input[@id='workersearch-ni_number']"));
		ninmbr.sendKeys("6955810");
		
		WebElement searchbutton= driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
		wait.until(ExpectedConditions.elementToBeClickable(searchbutton));
		searchbutton.click();
		
		driver.navigate().to("https://www.qabible.in/payrollapp/worker");
		WebElement workermenuagain= driver.findElement(By.xpath("(//a[contains(text(),'Workers')])[2]"));
		workermenuagain.click();
		
		WebElement deletebox= driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-trash'])[1]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='glyphicon glyphicon-trash'])[1]")));
		deletebox.click();
		driver.switchTo().alert().dismiss();
	}

}
