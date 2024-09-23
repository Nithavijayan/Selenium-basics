package tests;


import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import pages.Table_Page;

public class Table_Test extends BaseClass{
	
	Table_Page tablepage;
	
	@Test
	public void verifyTableMenu()
	{
		tablepage=new Table_Page(driver);
		tablepage.clickOnTableMenu();
		
	}
	
	@Test
	public void get_TableValues() 
	{
		tablepage=new Table_Page(driver);
		tablepage.clickOnTableMenu();
		String data=tablepage.get_TableData();
		System.out.println(data);
		assertEquals(data,"Senior Javascript Developer");
	}
	@Test
	public void get_AllPerson_Names()
	{
		tablepage=new Table_Page(driver);
		tablepage.clickOnTableMenu();
		tablepage.getAll_Names();
	}
	@Test
	public void getPerson_Name()
	{
		tablepage=new Table_Page(driver);
		tablepage.clickOnTableMenu();
		String office=tablepage.getOffice_OfPerson("Cedric Kelly");
		System.out.println(office);
		Assert.assertEquals(office, "Edinburgh");
	}
	@Test
	public void getPerson_Salary()
	{
		tablepage=new Table_Page(driver);
		tablepage.clickOnTableMenu();
		String salary=tablepage.getSalaryOfPerson("Brielle Williamson");
		System.out.println(salary);
		String path=System.getProperty("user.dir");//for getting path
		System.out.println(path);
		Assert.assertEquals(salary, "$372,000");
	}
}
