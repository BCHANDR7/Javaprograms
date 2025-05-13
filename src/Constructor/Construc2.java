package Constructor;

public class Construc2 {
	
	final String name="str";
	int id;

	Construc2(int id)
	{
		super();
		this.id=id;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Construc2 con2=new Construc2(5);
		System.out.println(con2.id);
		System.out.println(con2.name);
	}

}
