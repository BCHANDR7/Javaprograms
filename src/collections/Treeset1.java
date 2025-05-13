package collections;

import java.util.Set;
import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
		Set<String> st=new TreeSet<String>();
		st.add("balaji");
		st.add("dinesh");
		st.add("arun");
		st.add("arun");
		System.out.println(st);
		
st.remove("arun");
System.out.println(st);
System.out.println(st.contains("dinesh"));
		st.clear();
		System.out.println(st);

	}

}
