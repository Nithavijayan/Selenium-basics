package keyboard.n.mouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.ImmutableBiMap.Builder;

public class FileUploadingUsingRobot {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		
		WebElement chooseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		String filePath="C:\\Users\\91984\\OneDrive\\Documents\\notes\\Array.docx";
		
		//file uploading using robot ctrl c,ctrl v
			
		Robot robot=new Robot();
		Actions action=new Actions(driver);
		action.click(chooseFile).build().perform();
		StringSelection ss=new StringSelection(filePath);// set path 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);//instead of ctrl c we copying data to clipboard
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
