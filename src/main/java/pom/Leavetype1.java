package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.ExcelLibrary;

public class Leavetype1 implements AutoConstant {
@FindBy(id="leaveTypeLightBox_nameField")
private WebElement textf;
@FindBy(xpath = "(//span[.='Create Leave Type'])[2]")
private WebElement submit1;
public Leavetype1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void click7() throws IOException, InterruptedException
{
textf.sendKeys(ExcelLibrary.excelFileDataFetch(sheet_path, sheet_name, 0, 4));
Thread.sleep(3000);
submit1.click();
}
}
