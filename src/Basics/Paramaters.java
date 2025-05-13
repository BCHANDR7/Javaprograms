package Basics;

public class Paramaters {
	static float fl=2.3f;
	public static void add(int a,String s)
	{
		System.out.println(a);
		System.out.println(s);
	}
	public static float add2(float f1,double d, boolean b)
	{
		System.out.println(f1);
		System.out.println(d);
		System.out.println(b);
		return f1;
	}

	public static void main(String[] args) {
		add(2,"abs");
		System.out.println(fl);
		add2(2.3f,54.34,true);

	}

}
