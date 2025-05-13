package practice8;

import java.util.Scanner;

public class CountOccurences {

	public static void main(String[] args) {
		String str;
		int count=0;
		System.out.println("Enter String");
		Scanner sc =new Scanner(System.in);
		str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			count++;
		}
		System.out.println(count);

	}

}
