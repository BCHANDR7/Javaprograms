package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHahSet1 {

	public static void main(String[] args) {
		Set<String> st=new LinkedHashSet<String>();
		st.add("balaji");
		st.add("arun");
		st.add("dinesh");
		st.add("balaji");
		st.add("");
		System.out.println(st);
		
		st.remove("");
		System.out.println(st);
		System.out.println(st.contains("arun"));
		
		st.clear();
		System.out.println(st);
		

	}

}
