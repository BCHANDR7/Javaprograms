package Practice5;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=10;
		int a=0,b=1,c;
		System.out.println("Fibonacci Series");
		for(int i=1;i<=10;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		
		}
		System.out.println();
		System.out.println("Even number");
		Scanner sc=new Scanner(System.in);
		int even=sc.nextInt();
		if(even%2==0)
		{
			System.out.println("Its Even number");
		}
		else
		{
			System.out.println("Its Odd number");
		}
		System.out.println();
		System.out.println("Prime Numbers");
		int prime=sc.nextInt();
		int flag=0;
		for(int i=2;i<prime;i++)
		{
		if(prime%i==0)
		{
			
			flag++;
		}
		}
		if(flag==0)
		{
			System.out.println("Its is prime");
		}
		else
		{
			System.out.println("Not a prime");
		}

	}

}
