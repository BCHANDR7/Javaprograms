package practice6;

import java.util.Scanner;

public class ClsArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of students:");
		int num=sc.nextInt();
		sc.nextLine();
		String name[]=new String[num];
		int rollno[]=new int[num];
		int mark1;
		int mark2;
		int mark3;
		int total;
		int avg;
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter Name:");
			name[i]=sc.nextLine();
			System.out.println("Enter RollNo:");
			rollno[i]=sc.nextInt();
			System.out.println("Enter Marks:");
			mark1=sc.nextInt();
			mark2=sc.nextInt();
			mark3=sc.nextInt();
			total=mark1+mark2+mark3;
			avg=total/3;
			System.out.println("Name: "+name[i]);
			System.out.println("RollNo: "+rollno[i]);
			System.out.println("Average: "+avg);
			sc.nextLine();
		}
		

	}

}
