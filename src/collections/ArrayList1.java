package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		List<String> li=new ArrayList<>();
		li.add("apple");
		li.add("orange");
		li.add("mango");
		li.add("Grape");
		
			System.out.println(li);
			
	//Accessing the element
		System.out.println("First Fruit: "+li.get(0));
	//Modify
		li.set(2, "pappaya");
		
		System.out.println(li);
	//remove
		li.remove(3);
		li.remove("pappaya");
		System.out.println(li);
		
	//size
		System.out.println(li.size());
		
		for(String b:li)
		{
			System.out.println(b);
		}
		
		

	}

}
