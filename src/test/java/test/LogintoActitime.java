package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.CreateCustomer;
import pom.Homepage;

public class LogintoActitime extends BaseTest  {
@Test
public void logintoActitime() throws IOException
{
	

	 Homepage page2=new Homepage(driver);
	 page2.clickk();
	 CreateCustomer page3=new CreateCustomer(driver);
	 page3.clickkk();
	

}

}
