package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.TableUtility;

public class Table_Page {
	
	WebDriver driver;
	
	
	public Table_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Table')]")
	WebElement table_menu;
	@FindBy(xpath = "//table[@id='dtBasicExample']//tbody//tr[4]//td[2]")
	WebElement table_data;
	@FindBy(xpath = "//table[@id='dtBasicExample']//tbody//tr//td[1]")
	List<WebElement> names;
	
	TableUtility utility=new TableUtility();
	
	public void clickOnTableMenu()
	{
		table_menu.click();
	}
	public String get_TableData() 
	{
		return table_data.getText();
	}
	public void getAll_Names()
	{
		System.out.println("size :"+names.size());
		List<String> person_names=new ArrayList<String>();
		person_names=utility.get_Dataof_Person_Names(names);
		System.out.println("names: "+person_names);	
	}
	public String getOffice_OfPerson(String person)
	{
	
		List<String> name=new ArrayList<String>();
		name=utility.get_Dataof_Person_Names(names);
		int index=0;
		for(index=0;index<name.size();index++)
		{
			if(person.equals(name.get(index)));
			{
				index++;
				break;
			}
		}
		WebElement element = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+index+"]//td[3]"));
		return element.getText();
		
	}
	public String getSalaryOfPerson(String person)
	{
		List<String> name=new ArrayList<String>();
		name=utility.get_Dataof_Person_Names(names);
		int index=0;
		for(String personname:name)
		{
			if(personname.equals(person))
			{
				index++;
				break;
			}
			index++;
		}
		WebElement element = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+index+"]//td[6]"));
		return element.getText();
	}
	}
