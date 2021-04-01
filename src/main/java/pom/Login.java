package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.ExcelLibrary;

public class Login implements AutoConstant {
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passwordField;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement checkbox;
	
	@FindBy(id="loginButton")
	private WebElement login;
	
	public Login(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void loginMethod() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.excelFileDataFetch(sheet_path, sheet_name, 0, 0));
		passwordField.sendKeys(ExcelLibrary.excelFileDataFetch(sheet_path, sheet_name, 0, 1));
checkbox.click();
login.click();
	}

}
