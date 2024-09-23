package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.DatePickers_page;

public class DatePickers_Test extends BaseClass{
	
	DatePickers_page datepickers;
	
	@Test
	public void verifyDatePickers()
	{
		datepickers=new DatePickers_page(driver);
		datepickers.clickOnDatepickers();
		boolean status=datepickers.isShowDatebuttonDisplayed();
		Assert.assertTrue(status);
			
	}
	@Test
	public void verifyTypeAttributeOf()
	{
		datepickers=new DatePickers_page(driver);
		datepickers.clickOnDatepickers();
		String value=datepickers.getTypeAttribute();
		Assert.assertEquals(value,"button");
	}
	@Test
	public void verifyTypeCssValue()
	{
		datepickers=new DatePickers_page(driver);
		datepickers.clickOnDatepickers();
		String cssValue=datepickers.getTypeCssValue();
		Assert.assertEquals(cssValue, "rgba(0, 123, 255, 1)");
	}
	@Test
	public void enterDateFieldSendkeys()
	{
		datepickers=new DatePickers_page(driver);
		datepickers.clickOnDatepickers();
		datepickers.enterdateField();
	}
	
	@Test
	public void getMenuListItems()
	{
		datepickers=new DatePickers_page(driver);
		datepickers.printMenus();
	}
}

