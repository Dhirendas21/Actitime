package generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Login;
import pom.Logout;

public class BaseTest  implements AutoConstant {

public WebDriver driver;
@BeforeClass
public void openBrowser()
{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get(url);
driver.manage().window().maximize();

}
@BeforeMethod
public void loginTo() throws IOException
{
	Login page1=new Login(driver);
	page1.loginMethod();
 	
}
@AfterMethod
public void logoutFrom() throws InterruptedException
{
Logout page2=new Logout(driver);
page2.click8();
}
@AfterClass
public void close()
{
driver.quit();	
}
}
