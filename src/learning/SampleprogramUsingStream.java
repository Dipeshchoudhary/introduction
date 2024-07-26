package learning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SampleprogramUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//count the number of names starting with a in list
		
		List<String> names=new ArrayList<String>();
		
		names.add("abhijeet");
		names.add("johan");
		names.add("alekhya");
		names.add("adam");
		names.add("ram");
		
		
		long c=names.stream().filter(s->s.startsWith("a")).count();  //datatype of stream is long
		
		System.out.println(c);
		
		long d=Stream.of("abhijeet","johan","alekhya","adam","ram").filter(e->
		{
			e.startsWith("r");
			return true;
		}).count();
		
		System.out.println(d);
		
		//print all the names of arraylist greate than length 4
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		////print 1st name of arraylist greater than length 4
		System.out.println("--------------------");
		
		names.stream().filter(s1->s1.length()>4).limit(1).forEach(s1->System.out.println(s1));
		

	}
	

}
