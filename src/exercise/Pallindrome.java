package exercise;

public class Pallindrome {

	public static void main(String[] args) {
		int a=564;
		int c,d=0;
		c=a;
		while(a>0)
		{
			d=(d*10)+(a%10);
			a=a/10;
		}
		
		if(c==d)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not a Pallindrome");
		}

	}

}
