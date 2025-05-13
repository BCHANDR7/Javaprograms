package String;

public class StringMethod {

	public static void main(String[] args) {
    //Length
		String s="Hello World";
		System.out.println(s.length());
	//CharAt
		System.out.println(s.charAt(6));
	//SubString
		System.out.println(s.substring(5));
	//Substring index
		System.out.println(s.substring(2, 7));
	//equals
		String s1="hello World";
		System.out.println(s.equals(s1));
		
	//EqualIgnoreCase
		System.out.println(s.equalsIgnoreCase(s1));
	//tolowercase
		System.out.println(s.toLowerCase());
	//touppercase
		System.out.println(s.toUpperCase());
	//trim
		System.out.println("Trim");
		String s2=" Hello World ";
		System.out.println(s2.trim());
		System.out.println(s2);
		
	//Replace
		System.out.println(s1.replace("World", "Covai"));
		
	//Split -- splits and assign to array
		System.out.println("Split");
		String []s4=s1.split("r");
		System.out.println(s4[1]);
		
		String []s5=s1.split(" ");
		System.out.println(s5[1]);
		System.out.println(s5[0]);
		
		for(String s6:s5)
		{
			System.out.println(s6);
		}
		
		//Contains
		System.out.println(s2.contains("Hae"));
		
		//indexof
		System.out.println("Index");
		System.out.println(s2.indexOf('W'));
		System.out.println(s2.indexOf("Hel"));
		
		//startswith
		System.out.println("Starts");
		System.out.println(s2.startsWith("World"));
		
		//endswith
		System.out.println("Ends");
		System.out.println(s1.endsWith("hello"));
		System.out.println(s1.endsWith("World"));
		
		//join
		String name=String.join(".","Str","covai","erode");
		System.out.println(name);
		
		//concat
		String name1="hello ";
		String name2="covai";
		System.out.println(name1.concat(name2));
	

	}

}
