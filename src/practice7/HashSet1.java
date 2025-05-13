package practice7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		Set<String> se=new HashSet<String>();
		
		se.add("Orange");
		se.add("Yellow");
		se.add("Pink");
		se.add("Purple");
		se.add("Maroon");
		
System.out.println(se);
		
		for(String b:se)
		{
			System.out.println(b);
		}
		
		System.out.println(se.contains("Pink"));
		
	se.remove("Pink");
	System.out.println(se);
	}


}
