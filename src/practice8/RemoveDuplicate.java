package practice8;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s;
		System.out.println("Enter String:");
		Scanner sc= new Scanner(System.in);
		s=sc.nextLine();
		char str[]=s.toCharArray();
		int index = 0;
		 
        
        for (int i = 0; i < s.length(); i++) {
 
            
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }
 
           
            if (j == i) {
                str[index++] = str[i];
                System.out.println(str[i]);
            }
           
        }
        
	
		
	}
	
}
