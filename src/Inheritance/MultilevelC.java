package Inheritance;

public class MultilevelC extends MultilevelB{
	int e=26;
	public void five()
	{
		System.out.println("MultilevelC");
	}

	public static void main (String[] args)
	{
		MultilevelC mul=new MultilevelC();
		mul.three();
		mul.four();
		mul.five();
		System.out.println(mul.c);
		System.out.println(mul.d);
		System.out.println(mul.e);
	}
}
