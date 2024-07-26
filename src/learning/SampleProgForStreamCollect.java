package learning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleProgForStreamCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>ls=Stream.of("Abhijeet","Johan","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		
		List<Integer> values=Arrays.asList(3,2,2,7,5,1,9,7);
		//print the unique number for this array
		//sort the array
		
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		System.out.println("------------------------------");
		
		List<Integer>li=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}

}
