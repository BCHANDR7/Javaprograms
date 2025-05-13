package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;



public class ArrayList3 {
	
	public static void main(String[] args) {
		List<String> element=new ArrayList<String>();
		element.add("Apple");
		element.add("Orange");
		element.add("Pine");
		element.add("Grape");
		System.out.println(element);
		System.out.println();
		System.out.println("Using Iterator");
		Iterator<String> it=element.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println("Adding Position");
		element.add(0,"Guava");
		element.add(2,"Banana");
		System.out.println(element);
		
		System.out.println(element.get(1));
		
		element.set(2, "RedBanana");
		System.out.println();
		System.out.println("After update");
		System.out.println(element);
		System.out.println();
		System.out.println("After Remove");
		element.remove(3);
		System.out.println(element);
		System.out.println();
		System.out.println("Finding the element");
		if(element.contains("RedBanana"))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not found");
		}
		System.out.println();
		System.out.println("After Sorting");
		Collections.sort(element);
		System.out.println(element);
		System.out.println();
		System.out.println("Copy Collections");
		List<String> element2=new ArrayList<String>();
		element2.add("Blueberry");
		element2.add("Strawberry");
		element2.add("Jackfruit");
		element2.add("Orange");
		element2.add("Green Apple");
		System.out.println();
		System.out.println("Before Copy");
		System.out.println(element);
		System.out.println(element2);
		System.out.println();
		System.out.println("After Copy");
		Collections.copy(element, element2);
		System.out.println(element);
		System.out.println(element2);
		
		System.out.println();
		System.out.println("After Shuffle");
		Collections.shuffle(element2);
		System.out.println(element2);
		
		System.out.println();
		System.out.println("After Reverse");
		Collections.reverse(element2);
		System.out.println(element2);
		
		System.out.println();
		System.out.println("Exact Portion");
		List<String> sub_list=element2.subList(1, 4);
		System.out.println(sub_list);
		
		System.out.println();
		System.out.println("Collections Compare");
		Collections.sort(element);
		Collections.sort(element2);
		System.out.println(element);
		System.out.println(element2);
		List<String> compare=new ArrayList<String>();
		for(String b:element)
		{
			compare.add(element2.contains(b)?"Yes":"No");
		}
		System.out.println(compare);
		
element2.remove(2);
System.out.println(element);
System.out.println(element2);

List<String> compare1=new ArrayList<String>();
for(String b:element)
{
	compare1.add(element2.contains(b)?"Yes":"No");
}
System.out.println(compare1);
System.out.println(element2);
	Collections.swap(element2, 1, 3);	
	System.out.println(element2);
	
	ArrayList<String> a=new ArrayList<String>();
	a.addAll(element2);
	a.addAll(element);
	System.out.println(a);
	

	ArrayList<String> a1=new ArrayList<String>();
	a1=(ArrayList<String>) a.clone();
	System.out.println(a1);
	a1.clear();
	
	System.out.println(a1);

	ArrayList<String> a2=new ArrayList<String>();
a2.ensureCapacity(10);

element2.set(2, "Avacado");
System.out.println(element2);

System.out.println("Print element with position");
int size1=element2.size();
for(int i=0;i<size1;i++)
{
	System.out.println(element2.get(i));
}
element.add(null);


	}

}
