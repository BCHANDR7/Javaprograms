package practice8;

import java.util.Scanner;

public class IsVowel {

	public static void main(String[] args) {
	String s;
	int count=0;
	System.out.println("Enter String:");
	Scanner sc= new Scanner(System.in);
	s=sc.nextLine();
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||
				s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			
			count++;
		}
	}
	System.out.println(count);

	}

}
