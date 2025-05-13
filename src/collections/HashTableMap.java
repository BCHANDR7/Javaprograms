package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableMap {

	public static void main(String[] args) {
		//Hashtable
		System.out.println("HashTable");
		Hashtable<Integer, String> ht=new Hashtable<Integer,String>();
		ht.put(105, "Balaji");
		ht.put(101, "Arun");
		ht.put(102, "Dinesh");
		ht.put(103, "Arjun");
		
		//Map.Entry is class & ht.entrySet() stores all values for hashtable
		for(Map.Entry m:ht.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		//HashMap
		System.out.println();

		System.out.println("HashMap");
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(100, "Balaji");
		hm.put(104, "Balaji");
		hm.put(101, "Vicky");
		hm.put(102, "Suresh");
		hm.put(102, "Ramesh");
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		

	}

}
