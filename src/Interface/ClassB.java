package Interface;

public class ClassB implements InterA {
	
	public void add()
	{
		System.out.println("interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB cls=new ClassB();
		cls.add();
		System.out.println(cls.a);

	}

}
