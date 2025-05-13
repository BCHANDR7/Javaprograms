package Practice3;

public class Cls1 extends Abs2{
Cls1(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

void sum()
{
	System.out.println("First abs");
}

void sum2()
{
	System.out.println("Second abs");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cls1 cl=new Cls1(40);
		cl.sum();
		cl.sum2();
		System.out.println(cl.a);
		System.out.println(cl.b);

	}

}
