package collections;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		Set<String> st=new HashSet<String>();
		st.add("apple");
		st.add("orange");
		st.add("mango");
		st.add("grape");
		st.add("mango");
		
		System.out.println(st);
		st.remove("mango");
		System.out.println(st);
		System.out.println(st.contains("grape"));//boolean
		System.out.println(st.size());
		st.clear();
		System.out.println(st);
	}

}
