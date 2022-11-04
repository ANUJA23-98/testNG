package module2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Topic1
{	
	@Test
	public void XYZ()                                 //alphabetical order
	{
	System.out.println(" xyz 1 executed");
	}
	
	@Test
	public void testCase2()
	{
	System.out.println("TC 2 executed");
	}
	
	@Test
	public void Abc()                               //alphabetical order
	{
	System.out.println(" abc 3 executed");
	}
	
	@AfterTest                                             //@AfterTest will execute after all test but before test @AfterSuite
	public void Demo2()
	{
	System.out.println(" TC Demo4 close page executed");
	}
	
}
