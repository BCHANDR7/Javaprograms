package Abstract;

public class ConsAbs2 extends ConsAbs{

	ConsAbs2(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	void constr()
	{
		System.out.println("Abstract3");
	}
	
	public static void main(String[] args)
	{
		ConsAbs2 cona=new ConsAbs2(10);
		cona.constr();
		cona.constr2();
	}
	
}
