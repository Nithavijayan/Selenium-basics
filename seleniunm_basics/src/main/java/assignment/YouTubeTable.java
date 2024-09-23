package assignment;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YouTubeTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://blazedemo.com/");
		WebElement textfield1=driver.findElement(By.xpath("//select[@name='fromPort']"));
		WebElement textfield2=driver.findElement(By.xpath("//select[@name='toPort']"));
		
		Select select1=new Select(textfield1);
		select1.selectByValue("Boston");
		
		Select select2=new Select(textfield2);
		select2.selectByValue("London");
		
		WebElement findflights=driver.findElement(By.xpath("//input[@type='submit']"));
		findflights.click();
		
		List <WebElement> price=driver.findElements(By.xpath("//table[@class='table']//td[6]"));
	
		for(int i=0;i<price.size();i++)
		{
			String priceList=price.get(i).getText();
			System.out.println(priceList);
		}
		WebElement chooseFlight=driver.findElement(By.xpath("(//input[@type='submit'])[3]"));
		chooseFlight.click();
		
		WebElement name=driver.findElement(By.xpath("//input[@id='inputName']"));
		name.sendKeys("Arundathi");
		
		WebElement address=driver.findElement(By.xpath("//input[@id='address']"));
		address.sendKeys("Mayookham");
		
		WebElement city=driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Kolkatha");
		
		WebElement state=driver.findElement(By.xpath("//input[@id='state']"));
		state.sendKeys("West Bengal");
		
		WebElement zipcode=driver.findElement(By.xpath("//input[@id='zipCode']"));
		zipcode.sendKeys("678543");
		
		WebElement cardtype=driver.findElement(By.xpath("//select[@id='cardType']"));
		Select select3=new Select(cardtype);
		select3.selectByValue("dinersclub");
		
		WebElement creditcard=driver.findElement(By.xpath("//input[@id='creditCardNumber']"));
		creditcard.sendKeys("3426788987");
		
		WebElement month=driver.findElement(By.xpath("//input[@id='creditCardMonth']"));
		month.clear();
		month.sendKeys("10");
		
		WebElement year=driver.findElement(By.xpath("//input[@id='creditCardYear']"));
		year.clear();
		year.sendKeys("2018");
		
		WebElement nmecard=driver.findElement(By.xpath("//input[@id='nameOnCard']"));
		nmecard.sendKeys("Arundathi");
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='rememberMe']"));
		checkbox.click();
		
		WebElement submitbutton=driver.findElement(By.xpath("//input[@type='submit']"));
		submitbutton.click();
		
		WebElement thankyoymsg=driver.findElement(By.xpath("//h1[contains(text(),'Thank you for your purchase today!')]"));
		System.out.println(thankyoymsg.getText());
	}

}
