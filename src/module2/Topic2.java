package module2;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Topic2
{	
	@BeforeTest                                     // @BeforeTest will execute before all tests but after @BeforeSuite 
	public void testCase3()
	{
	System.out.println("TC 5 Testlogin executed");
	}
	
	@BeforeSuite
	public void testCase4()                     //@BeforeSuite will execute before all Classes Tests and suits 
	{
	System.out.println("TC 6  beforeSuite open Bw");
	}
	
	
}