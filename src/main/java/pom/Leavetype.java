package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leavetype {
@FindBy(xpath = "//span[.='Create Leave Type']")
private WebElement leavetype1;
public Leavetype(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void click6()
{
leavetype1.click();	
}
}
