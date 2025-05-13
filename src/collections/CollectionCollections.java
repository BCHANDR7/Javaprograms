package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionCollections {

	public static void main(String[] args) {
		//Collection
		List<Integer> a=new ArrayList<>();
		a.add(5);
		a.add(85);
		a.add(10);
	for(int b:a)
	{
		System.out.println(b);
	}
	//Collections
	Collections.sort(a);//ascending order
	for(int b:a)
	{
		System.out.println(b);
	}
	a.remove(2);
	a.set(1, 75);
	System.out.println();
	for(int b:a)
	{
		System.out.println(b);
	}
	
	Collections.sort((List<Integer>)a);
	
	System.out.println();
	for(int b:a)
	{
		System.out.println(b);
	}
	System.out.println();
	Collections.sort(a,Collections.reverseOrder());
	
	for(int b:a)
	{
		System.out.println(b);
	}
	
	}
	


}
