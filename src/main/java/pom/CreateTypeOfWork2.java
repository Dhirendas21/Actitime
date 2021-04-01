package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.ExcelLibrary;

public class CreateTypeOfWork2 implements AutoConstant{
	@FindBy(id="name")
	private WebElement namefield;
	@FindBy(xpath = "//input[@value='   Create Type of Work   ']")
	private WebElement submit;
	public CreateTypeOfWork2(WebDriver driver) {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
	}
	public void click3() throws IOException
	{
	namefield.sendKeys(ExcelLibrary.excelFileDataFetch(sheet_path, sheet_name, 0, 3));
	submit.click();
	}

}
