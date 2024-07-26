package learning;

public class PS3 extends PS4 {

	int a;

	public PS3(int a) {
		super(a); //parent class constructor is invoked
		this.a=a;
		
	}

	public int increment()
	{
		a=a+1;
		return a;
	}
	
	public int decreament()
	{
		a=a-1;
		return a;
	}
}
