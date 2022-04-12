package Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page.HomePage;

public class HompageTest {
	
	WebDriver Driver;
	
	HomePage hp = new HomePage(Driver);
	
@Test(priority = '0')
public void clickOnContryButton()
{
	hp.ClickOnCountryButton();
	Assert.assertTrue(true);
}

public void selectCountry()
{
	hp.ClickOnCountryText();
	Assert.assertTrue(true);
}

}
