package Constructor;

public class CopyCons {
	
	String name;
	int id;
	
	CopyCons(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	CopyCons(CopyCons con2)
	{
		this.name=con2.name;
		this.id=con2.id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyCons con3 =new CopyCons("str",5);
		System.out.println("First Object: ");
		System.out.println("Name: "+con3.name+" and ID: "+con3.id);
		System.out.println("Copy Constructor");
		CopyCons con4 =new CopyCons(con3);
		System.out.println("Name: "+con4.name+" and ID: "+con4.id);

	}

}
