package module2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
public class Topic4
{	
	@AfterSuite
	public void testCase7()
	{
	System.out.println("TC 9 AfterSuite closeBw  executed");
	}
	
	@Test
	public void testCase8()
	{
	System.out.println("TC 10 executed");
	}
	
	
}