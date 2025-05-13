package practice6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String args[]) throws IOException
	{
		File fi=new File("D:\\Balaji");
		fi.mkdir();
		if(fi.exists())
		{
			System.out.println("Folder created");
		}
		else
		{
			System.out.println("Folder not created");
		}
		
		File fi2=new File("D:\\Balaji\\Documents.txt");
		if(fi2.createNewFile())
		{
			System.out.println("File created");
		}
		else
		{
			System.out.println("File not created");
		}
		
		FileWriter fw=new FileWriter(fi2);
		fw.write("Hello World");
        fw.flush();
		
		Scanner sc=new Scanner(fi2);
		while(sc.hasNextLine())
		{
			String s=sc.nextLine();
			System.out.println(s);
		}
		sc.close();
	
		
		
		
	}
}
