package exercise;

public class PrimeNumber {

	public static void main(String[] args) {
		int a=0;
		int flag=0;
		int n=13;
		a=n/2;
		for(int i=2;i<=a;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not a prime number");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Its a prime number");
		}

	}

}
