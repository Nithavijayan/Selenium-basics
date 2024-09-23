package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility_Class;

public class DatePickers_page {

	WebDriver driver;

	public DatePickers_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Date Pickers')]")
	WebElement datepickes_menu;
	@FindBy(xpath = "//button[@id='button-one']")
	WebElement showdate_button;
	@FindBy(xpath = "//a[@href='index.php']//img")
	WebElement logo;
	@FindBy(xpath = "//input[@id='single-input-field']")
	WebElement enterdate_field;
	@FindBy(xpath = "//ul[@class='navbar-nav']//li")
	List<WebElement> menu_items;

	Utility_Class utility = new Utility_Class();

	public void clickOnDatepickers() {
		datepickes_menu.click();
	}

	public boolean isShowDatebuttonDisplayed() {
		return showdate_button.isDisplayed();
	}

	public String getTypeAttribute() {
		return utility.get_Attribute(showdate_button, "type");

	}

	public String getTypeCssValue() {
		
		String color=logo.getCssValue("color");
		System.out.println(color);
		return utility.get_CssValue(logo, "color");
	
	}

	public void enterdateField() {
		enterdate_field.sendKeys("10/12/2024");
	}

	public void printMenus() {
		List<String> menus = new ArrayList<String>();
		menus = utility.getTextof_elements(menu_items);
		System.out.println(menus);
	}

}
