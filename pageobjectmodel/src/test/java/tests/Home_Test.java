package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.Home_Page;

public class Home_Test extends BaseClass
{
	Home_Page homepage;
	
	@Test
	public void verifyLogo()
	{
		//int a=10;
		//a=5;
		homepage=new Home_Page(driver);//runtime, it should be inside the function
		boolean status=homepage.isLogoDisplayed();
		Assert.assertTrue(status);

	}

}
