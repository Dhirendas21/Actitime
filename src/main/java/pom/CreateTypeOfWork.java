package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTypeOfWork {
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement cow1;
	public CreateTypeOfWork(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void click2()
	{
	cow1.click();	
	}
}
