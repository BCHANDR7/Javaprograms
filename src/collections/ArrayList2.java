package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		List<String> color=new ArrayList<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Pink");
		color.add("Yellow");
		for (String b: color)
		{
			System.out.println(b);
		}
		Collections.sort(color);
		
		System.out.println();
		System.out.println("After sort");
	
	Iterator<String> it=color.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

	}

}
