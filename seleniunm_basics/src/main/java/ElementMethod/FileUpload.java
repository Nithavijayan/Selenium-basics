package ElementMethod;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		
		WebElement chooseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		String filePath="C:\\Users\\91984\\OneDrive\\Documents\\notes\\Array.docx";//for file uploading only which have tagname <input
		//chooseFile.sendKeys(filePath);
		
		File file=new File(filePath);//for file uploading only which have tagname <input
		chooseFile.sendKeys(file.getAbsolutePath());
	}

}
