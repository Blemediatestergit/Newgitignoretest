package Positive;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import Browser.Browser;
import Main.Add_contact;
import Main.Login;
import Main.Select_contact;
import Main.contact_search;

public class Positive extends Browser {

	
	


	@Test(priority=0)
	public void Redtiesignin() throws Exception 
	{

		
		Login log=new Login(driver);
		log.loginexcel();
		
	}

	@Test(priority=1)
	public void Test2() throws Exception 
	{
		Login log=new Login(driver);
		log.loginexcel();

		Add_contact ac=new Add_contact(driver);
		ac.addcontactmethod();
	}

	@Test(priority=2)
	public void Test3() throws Exception
	{
		Login log=new Login(driver);
		log.loginexcel();

		Select_contact sc=new Select_contact(driver);
		sc.select_contact();	
	}


	@Test(priority=3)
	public void Test4() throws Exception
	{
		Login log=new Login(driver);
		log.loginexcel();

		contact_search sc=new contact_search(driver);
		sc.search_contact_Method();	
	}

	



}