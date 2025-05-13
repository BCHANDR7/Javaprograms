package Practice2;

public class Cls1 implements Inter1,Inter2,Inter3{
	
	public void sum()
	{
		System.out.println("Sum1");
	}
	
	public void sum2()
	{
		System.out.println("Sum2");
	}
	
	public void sum3()
	{
		System.out.println("Sum3");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cls1 cl=new Cls1();
		cl.sum();
		cl.sum2();
		cl.sum3();
		System.out.println(cl.a);
		System.out.println(cl.b);
		System.out.println(cl.c);
		
	}

}
