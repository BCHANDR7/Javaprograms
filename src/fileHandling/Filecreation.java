package fileHandling;

import java.io.File;
import java.io.IOException;

public class Filecreation {

	public static void main(String[] args) throws IOException {
		File fi2=new File("D:\\Balaji\\Documents.ppt");

		if(fi2.createNewFile())
		{
			System.out.println("File is created");
		}
		
		else
		{
			System.out.println("File not created");
		}
	}

}
