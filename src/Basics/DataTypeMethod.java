package Basics;

public class DataTypeMethod {
	
	public static int num=78;
	public static char name()
	{
		String s="str";
		System.out.println(s);
		System.out.println("Hello");
	return 'b';	
	}
	
	public static char name2()
	{
		String s="str1";
		System.out.println(s);
		System.out.println("Hello1");
	return 'b';	
	}

	public static int name3()
	{
		String s="str1";
		System.out.println(s);
		System.out.println("Hello1");
	return num;	
	}

	public static void main(String[] args) {
		System.out.println(num);
		name();
char ch=name2();
int in=name3();
System.out.println(ch);
System.out.println(in);
	}

}
