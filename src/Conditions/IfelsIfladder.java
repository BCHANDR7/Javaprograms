package Conditions;

public class IfelsIfladder {

	public static void main(String[] args) {
		int a=72;
		if(a<50)
		{
			System.out.println("Fail");
		}
		else if((a>=50) && (a<60))
		{
			System.out.println("D grade");
		}
		else if((a>=60) && (a<70))
		{
			System.out.println("A grade");
		}
		else
		{
			System.out.println("Invalid");
		}

	}

}
