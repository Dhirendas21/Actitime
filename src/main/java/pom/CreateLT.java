package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLT {
	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement settings1;

@FindBy(xpath = "//a[.='Leave Types']")
private WebElement leavetype;
public CreateLT(WebDriver driver) 
{
 PageFactory.initElements(driver, this);
}
public void click5() throws InterruptedException
{
settings1.click();
Thread.sleep(2000);
leavetype.click();
}
}
