package practice6;

import java.io.File;
import java.io.IOException;

public class FileDelete {

	public static void main(String[] args) throws IOException {
		File fi2=new File("D:\\Balaji\\Documents.txt");
		if(fi2.createNewFile())
		{
			System.out.println("File created");
		}
		else
		{
			System.out.println("File not created");
		}
		
		fi2.delete();

	}

}
