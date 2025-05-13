package practice6;

public class StringFunctions {

	public static void main(String[] args) {
	String fn="Balaji";
	String fn1="balaji";
	String sn=" Chandrasekar";
	String name="Balaji Chandrasekar";
	String reverse=new StringBuilder(fn).reverse().toString();
	System.out.println(reverse);
	System.out.println("Length: "+fn.length());
	System.out.println("Char: "+sn.charAt(5));
	System.out.println("Substring: "+sn.subSequence(3, 8));
	System.out.println("Concat: "+fn.concat(sn));
	String[] s=fn.split("j");
	System.out.println("Split");
	for(String s1:s)
	{
		System.out.println(s1);
	}
	System.out.println("Index: "+fn.indexOf('j'));
	System.out.println("Contains: "+sn.contains("dra"));//return boolean
	System.out.println("Equals: "+fn.equals(sn));
	System.out.println("EqualsIgnoreCase: "+fn.equalsIgnoreCase(fn1));
	System.out.println("Lower Case: "+fn.toLowerCase());
	System.out.println("Upper Case: "+sn.toUpperCase());
	System.out.println("Starts with: "+fn.startsWith("laji"));//return boolean
	System.out.println("Ends with: "+name.endsWith("Chandrasekar"));
	
	String name2= String.join(",", fn,sn);
	System.out.println(name2);
	System.out.println("Replace: "+name.replace("Chandrasekar", "C S"));
	String name21=" Balaji Chandrasekar ";
	System.out.println("Before Trim:"+name21);
	System.out.println("Trim:"+name21.trim());
	
	}

}
