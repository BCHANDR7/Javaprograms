package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda1 {

	public static void main(String[] args) {
	List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8);
	li.forEach(b->System.out.print(b+" "));
	
	//get even numbers
	System.out.println();
	List<Integer> even=li.stream().filter(x->x%2==0).toList();

	System.out.println(even);


	}

}
