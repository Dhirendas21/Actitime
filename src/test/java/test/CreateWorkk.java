package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.CreateTypeOfWork;
import pom.CreateTypeOfWork2;
import pom.CreateWork;

public class CreateWorkk extends BaseTest {

@Test
public void createWorkk() throws IOException
{
	CreateWork page4=new CreateWork(driver);
	page4.click1();
	CreateTypeOfWork page5=new CreateTypeOfWork(driver);
	page5.click2();
	CreateTypeOfWork2 page6=new CreateTypeOfWork2(driver);
	page6.click3();
	
}
}
