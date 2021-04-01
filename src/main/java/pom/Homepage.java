package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
@FindBy(id="container_tasks")
private  WebElement task;

@FindBy(xpath = "//div[.='Add New']")
private WebElement addnew;
@FindBy(xpath="//div[@class='item createNewCustomer']")
private WebElement newcustomer;
public Homepage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver,this);

}

public void clickk()
{
task.click();	
addnew.click();
newcustomer.click();
}


}


