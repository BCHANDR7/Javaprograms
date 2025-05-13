package practice6;

import java.util.Scanner;

public class DispArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		a[2]=sc.nextInt();
		a[3]=sc.nextInt();
		a[4]=sc.nextInt();
		a[5]=sc.nextInt();
		a[6]=sc.nextInt();
		a[7]=sc.nextInt();
		a[8]=sc.nextInt();
		a[9]=sc.nextInt();
		
		for(int b:a)
		{
			System.out.print(b+"\t");
		}
		
		

	}

}
