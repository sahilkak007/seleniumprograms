package TestingPrograms;

import org.testng.annotations.Test;

public class calculatorapp2 {

	int a=100;
	int b=200;
	
	//this is  test  method
    @Test
	public void sum()
	{
		System.out.println(a+b);
		
	}
    @Test
	public void  mul()
	{
		System.out.println(a*b);
		
	}
	
	
}
