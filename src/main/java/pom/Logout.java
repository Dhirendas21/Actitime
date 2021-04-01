package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	@FindBy(id="logoutLink")
	private WebElement logoutlink;
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void click8() throws InterruptedException
	{
		Thread.sleep(3000);
		logoutlink.click();
		}
}
