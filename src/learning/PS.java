package learning;

import org.testng.annotations.BeforeMethod;

public class PS {

	public void dothis()
	{
		System.out.println("i am here");
	}
	
	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("running before method");
	}

}
