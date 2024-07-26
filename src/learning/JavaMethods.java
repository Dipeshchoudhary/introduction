package learning;

public class JavaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaMethods j=new JavaMethods();
		String name=j.getdata();
		System.out.println(name);
		JavaMethods2 m2=new JavaMethods2();
		String name2=m2.getuserdata();
		System.out.println(name2);
		getdata2();
	}
	
	public String getdata()
	{
		System.out.println("hi this is dipesh");
		return "dipesh";
	}
	
	public static String getdata2()
	{
		System.out.println("hi this is shyam");
		return "dipesh";
	}

}
