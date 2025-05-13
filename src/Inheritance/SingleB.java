package Inheritance;

public class SingleB extends SingleA{

	int b=85;
	
	public void two() {
		System.out.println("Second class");
	}
	
public static void main (String[] args)
{
	SingleB par=new SingleB();
	par.one();
	par.two();
	System.out.println(par.a);
	System.out.println(par.b);
	System.out.println(str);
}
}

