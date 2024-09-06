package ElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement checkbox1=driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
		WebElement checkbox2=driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
	
		Boolean select1=checkbox1.isSelected();
		Boolean select2=checkbox2.isSelected();
		
		System.out.println("checkbox1 isSelected "+checkbox1.isSelected());//selected or not
		System.out.println("checkbox2 isSelected "+checkbox2.isSelected());
		
		if(select1==false)
			checkbox1.click();
		if(select2==false)
			checkbox2.click();
		
		System.out.println("checkbox1 isDisplayed "+checkbox1.isDisplayed());//displayed or not
		System.out.println("checkbox2 isDisplayed "+checkbox2.isDisplayed());
		
		System.out.println("checkbox1 isEnabled "+checkbox1.isEnabled());//active or not
		System.out.println("checkbox2 isEnabled "+checkbox2.isEnabled());
		
	}

}
