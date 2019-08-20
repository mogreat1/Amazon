package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class PLPiPhonePage extends BasePage{

	public PLPiPhonePage(RemoteWebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='pdagDesktopSparkleHeadline']")
	WebElement topSearchResults;
	
	
	public boolean doesContainSearchedText(String searchedText) {	
		return topSearchResults.getText().contains(searchedText);
	}
	


}
