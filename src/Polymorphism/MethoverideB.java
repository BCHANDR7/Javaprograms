package Polymorphism;

public class MethoverideB extends Methoverride{

	int b=95;
	public void meth1()
	{
		System.out.println("Method Overload2");
	}
	
	public static void meth2(int a, float f)
	{
		System.out.println(a);
		System.out.println(f);
	}
	
	public int meth3()
	{
		System.out.println("Method Overload3");
		return 3;
	}
	
	
	public static void main(String[] args) {
		MethoverideB met=new MethoverideB();
		met.meth1();
		met.meth3();
		System.out.println(met.a);
		System.out.println(met.b);
		meth2(58, 2.3f);
		met.meth3();

	}

}
