package Scanner;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name= sc.nextLine();
		char ch=sc.next().charAt(0);
		int i=sc.nextInt();
		long l=sc.nextLong();
		double d=sc.nextDouble();
		
		System.out.println("Name: "+name);
		System.out.println("Char: "+ch);
		System.out.println("Integer: "+i);
		System.out.println("Long : "+l);
		System.out.println("Double: "+d);

	}

}
