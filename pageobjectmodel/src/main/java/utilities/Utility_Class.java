package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Utility_Class {
	public String get_Attribute(WebElement element, String attribute) {
		return element.getAttribute(attribute);

	}

	public String get_CssValue(WebElement element, String cssProperty) {
		return element.getCssValue(cssProperty);

	}

	public List<String> getTextof_elements(List<WebElement> elementList) {
		List<String> data = new ArrayList<String>();
		for (WebElement element : elementList) 
		{
			data.add(element.getText());
		}
		return data;
	}
	public List<String> getText_Of_Table_PersonNames(List<WebElement> nameList)
	{
		List<String> data=new ArrayList<String>();
		for(WebElement element:nameList)
		{
			data.add(element.getText());
		}
		return data;
		
	}
	
}
