package Basics;

public class Obj {
	int i=50;
	static String str="abs";
	public void sum()
	{
		System.out.println("oj");
	}
	
	public static void sum2()
	{
		System.out.println("srm");
	}
	
	public static void main(String[] args) {
		 Obj ref=new Obj();
		 ref.sum();
		 sum2();
		 System.out.println(ref.i);
		 System.out.println(str);

	}

}
