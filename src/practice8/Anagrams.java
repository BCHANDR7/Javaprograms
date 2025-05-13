package practice8;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 String s1 = sc.nextLine();
	     String s2 =  sc.nextLine();
	     char[] s1Array = s1.toCharArray();
	        char[] s2Array = s2.toCharArray();
	        Arrays.sort(s1Array);
	        Arrays.sort(s2Array);
	        System.out.println();
	        System.out.println("After sort");
	        System.out.println(s1Array);
	        System.out.println(s2Array);
	        if(Arrays.equals(s1Array, s2Array))
	        {
	        	System.out.println("Its Anagram");
	        }
	        else
	        {
	        	System.out.println("Not Anagram");
	        }

	}

}
