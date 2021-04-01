package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateWork {
	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement settings;
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement cow;
	public CreateWork(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void click1()
	{
	settings.click();
	cow.click();
	}

}
