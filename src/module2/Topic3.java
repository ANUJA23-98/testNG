package module2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class Topic3
{	
	@Test
	public void testCase5()
	{
	System.out.println("TC 7 executed");
	}
	
	@AfterTest                                     //@afterTest will execute after all test but before suite  
	public void testCase6()                        //as we have two @AfterTest then result will show by their alphabetic order 
	{
	System.out.println("TC 8 Testlogout executed");
	}
	
	
}