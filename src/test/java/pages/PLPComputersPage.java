package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class PLPComputersPage extends BasePage{

	public PLPComputersPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Computers, Tablets and IT Accessories']")
	WebElement computerPageTitle;
	
	public boolean isComputerPageTitleDisplayed() {	
		return computerPageTitle.isDisplayed();
	}
	
	

	
	
}
