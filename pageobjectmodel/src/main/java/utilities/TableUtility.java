package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class TableUtility {
	public List<String> get_Dataof_Person_Names(List<WebElement> nameList)
	{
		List<String> data=new ArrayList<String>();
		for(WebElement element:nameList)
		{
			data.add(element.getText());
		}
		return data;
		
	}

}
