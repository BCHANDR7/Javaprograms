package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
	List<Integer> li=new LinkedList<>();
	li.add(52);
	li.add(85);
	li.add(78);
	li.add(97);
	
	System.out.println(li);
	
	System.out.println(li.get(2));
	li.set(0, 63);
	System.out.println(li);
	li.remove(3);   
	System.out.println(li);
	System.out.println(li.size());
	
	for(int b:li)
	{
		System.out.println(b);
	}
	}

}
