package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.Inputform_Page;

public class Inputform_Test extends BaseClass {
	
	Inputform_Page inputformpage;
	
	
	@Test
	public void verifyInputformMenu()
	{
		inputformpage=new Inputform_Page(driver);
		inputformpage.clickOnInputformMenu();
	}
	
	@Test
	public void verifyInputformHeader()
	{
		inputformpage=new Inputform_Page(driver);
		inputformpage.clickOnInputformMenu();
		String header=inputformpage.getInputformHeader();
		assertEquals(header,"Single Input Field");//(actualheader,expectedheader)
	}
	@Test
	public void verifyButtonColor()
	{
		inputformpage=new Inputform_Page(driver);
		inputformpage.clickOnInputformMenu();
		String color=inputformpage.getShowMessageColor();
		System.out.println(color);
		assertEquals(color, "rgba(0, 123, 255, 1)");
	}
	

}
