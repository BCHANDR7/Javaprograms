package fileHandling;

import java.io.File;

public class FolderCreation {

	public static void main(String[] args) {
		File fi=new File("D:\\Balaji");
		boolean b=fi.mkdir();
		System.out.println(b);
		
		if(fi.exists())
		{
			System.out.println("File created");
		}
		else
		{
			System.out.println("File not created");
		}

		
	}

}
