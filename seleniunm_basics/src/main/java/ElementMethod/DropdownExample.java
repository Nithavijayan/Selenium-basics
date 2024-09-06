package ElementMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	
		Select select = new Select(dropdown);
		//select.selectByIndex(5);//for selection
		//select.selectByValue("search-alias=amazon-devices");
		select.selectByVisibleText("Baby");
		
		List <WebElement> dropdownlist = select.getOptions();// for listing all options
		for(int i=0;i<dropdownlist.size();i++)
		{
			String list=dropdownlist.get(i).getText();
			System.out.println(list);
		}
		
	}

}
