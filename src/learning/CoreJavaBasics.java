package learning;

import java.util.ArrayList;

public class CoreJavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=9;
		
		String name[]= {"Dipesh","singh","pydfthon"};
		
		for(String s:name)
		{
			System.out.println(s);
		}
		
		ArrayList<String> a=new ArrayList();
		a.add("java");
		a.add("ruby");
		a.add("python");
		a.add("javascript");
		a.add("selenium");
		a.add("pascal");
		
		System.out.println(a.get(2));
		
		for(String s:a)
		{
			System.out.println(s);
		}
		
		System.out.println(a.contains("selenium"));
	}

}
