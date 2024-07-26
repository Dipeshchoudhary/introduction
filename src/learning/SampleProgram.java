package learning;

import java.util.ArrayList;
import java.util.List;

public class SampleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//count the number of names starting with a in list
		
		List<String> names=new ArrayList<String>();
		
		names.add("abhijeet");
		names.add("johan");
		names.add("alekhya");
		names.add("adam");
		names.add("ram");
		int count=0;
		
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			
			if(actual.startsWith("a"))
			{
				count++;
				System.out.println(actual);
			}
		}
		
		System.out.println(count);

	}
	

}
