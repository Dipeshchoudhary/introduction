package learning;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS2 extends PS{

	@Test
	public void testRun()
	{
		int a=3;
		dothis();
		
		PS3 ps3=new PS3(3);
		System.out.println(ps3.increment());
		System.out.println(ps3.decreament());
		
		
		PS4 ps4=new PS4(4);
		System.out.println(ps3.miltiplyByTwo());
		System.out.println(ps3.miltiplyByThree());
	}
	
	

}
