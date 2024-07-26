package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

import com.google.common.collect.Streams;

public class SampleProfForStreamMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print the names which has last letter as "a"
		Stream.of("Abhijeet","Johan","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		//print names which have first letter as a with uppercase and sorted
		
		System.out.println("----------------------------------");
		List<String> names=Arrays.asList("Abhijeet","Johan","Alekhya","Adam","Rama");
		
		names.stream().filter(s1->s1.startsWith("A")).sorted().map(s1->s1.toUpperCase()).forEach(s1->System.out.println(s1));
		
		//merging 2 different Streams
		
		List<String>names1=new ArrayList<String>();
		
		names1.add("man");
		names1.add("Don");
		names1.add("women");
		
		Stream<String>newStream=Streams.concat(names.stream(),names1.stream());
		
		System.out.println("----------------------------------");
		
		//newStream.sorted().forEach(e->System.out.println(e));
		
		boolean flag=newStream.anyMatch(s2->s2.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);

	}

}
