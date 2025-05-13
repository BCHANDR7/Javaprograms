package Conditions;

public class NestedIf {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	
	if(a>b)
	{
		if(a!=b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
	}
	
	else
	{
		System.out.println("Invalid");
		
		if(a>b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
	}

	}

}
