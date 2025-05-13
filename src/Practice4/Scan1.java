package Practice4;

import java.util.Scanner;

public class Scan1 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		String name=sc1.nextLine();
		int a=sc1.nextInt();
		try
		{
		String name2="10";
        int b=Integer.parseInt(name2);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		try
		{
			int b=10;
			String name3= String.valueOf(b);
		}
		catch (Exception f) {
			System.out.println(f);
		}
		System.out.println("Number: "+a);
		System.out.println("Name: "+name);
		

	}

}
