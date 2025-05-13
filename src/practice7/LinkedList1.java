package practice7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		List<String> li=new LinkedList<String>();
		li.add("Blue");
		li.add("Yellow");
		li.add("Green");
		li.add("Safron");
		li.add("Red");
		System.out.println(li);
		
		System.out.println( );
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}

		//posistion
		System.out.println();
		System.out.println(li.get(2));
		
		System.out.println();

	     //update particular element
	     li.set(1, "Light Green");
	   System.out.println(li);

	//sort
	System.out.println();
	System.out.println("Sort");
	Collections.sort(li);
	System.out.println(li);

	//reverse
	System.out.println();
	System.out.println("Reverse");
	Collections.reverse(li);	
	System.out.println(li);

	//reverse order
	System.out.println();
	System.out.println("Reverse Order");
	Collections.sort(li,Collections.reverseOrder());
	for(String b:li)
	{
		System.out.println(b);
	}

	//remove
	System.out.println();
	System.out.println("Remove");
	li.remove(0);
	for(String b:li)
	{
		System.out.println(b);
	}

	String name="Red";
	for(int i=0;i<li.size();i++)
	{
		if(li.get(i).equalsIgnoreCase(name))
		{
			System.out.println("Item found");
			break;
		}
		else
		{
			System.out.println("Item not found");
		}
	}
	System.out.println(li.contains("Light Green"));
	}

}
