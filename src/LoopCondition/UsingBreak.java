package LoopCondition;

public class UsingBreak {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		{
			if(i>3)
			{
				System.out.println("IF: "+i);
				break;
			}
			else
			{
				System.out.println("Else: "+i);
				break;
			}
		}

	}

}
