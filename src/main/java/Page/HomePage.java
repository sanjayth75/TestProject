package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class HomePage extends BaseClass {
	
	public WebDriver Driver;
	
	public HomePage(WebDriver driver)
	{
		Driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "language-dropdown-flag")
	WebElement button;
	
	@FindBy(xpath = "//a[@aria-label='USA English']")
	 WebElement countryText;
	
	public  void ClickOnCountryText()
	{
		countryText.click();
	}
	
	public  void ClickOnCountryButton()
	{
		button.click();
	}

}
