package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.ExcelLibrary;

public class CreateCustomer implements AutoConstant {
@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement createnew;
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement tf;
@FindBy(xpath = "//div[@class='emptySelection']")
private WebElement ddl;
@FindBy(xpath="(//div[@class='itemRow cpItemRow '])[2]")
private WebElement hddl;
@FindBy(xpath = "//div[.='Create Customer']")
private WebElement save;
public CreateCustomer(WebDriver driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
}

public void clickkk() throws IOException
{
	createnew.sendKeys(ExcelLibrary.excelFileDataFetch(sheet_path, sheet_name, 0, 2));
	tf.sendKeys(ExcelLibrary.excelFileDataFetch(sheet_path, sheet_name, 0, 3));
	ddl.click();
	hddl.click();
	save.click();
	}
}
