package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.CreateLT;
import pom.Leavetype;
import pom.Leavetype1;

public class CreateLeaveType extends BaseTest {
	@Test
	public void execute() throws InterruptedException, IOException
	{
		CreateLT page5=new CreateLT(driver);
		page5.click5();
	Leavetype page6=new Leavetype(driver);
	page6.click6();
	Leavetype1 page7=new Leavetype1(driver);
	page7.click7();

	}
}
