package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Stream1 {

	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(7,1,2,3,5,4,6,8,5,3);
		//filter
		List<Integer> li=num.stream().filter(x->x%2==0).toList();
		System.out.println("Even numbers: "+li);
		//map
		List<Integer> li2=num.stream().map(x->x*x*x).toList();
		System.out.println("Square numbers: "+li2);
		//distinct
		List<Integer> li3=num.stream().distinct().toList();
		System.out.println("Distinct numbers: "+li3);
		//sorted
		List<Integer> li4=num.stream().sorted().toList();
		System.out.println("Sorted numbers: "+li4);
		//limit
		List<Integer> li5=num.stream().limit(5).toList();
		System.out.println("Limit numbers: "+li5);
		//reduce
	   int li6=num.stream().reduce(0,(a,b)->(a-b));
		System.out.println("reduce numbers: "+li6);
		//count
		long li7=num.stream().count();
		
		System.out.println("Count numbers: "+li7);
		//anymatch
		boolean b=num.stream().anyMatch(x->x%2==0);
		System.out.println("Match numbers: "+b);
	
	}
}
