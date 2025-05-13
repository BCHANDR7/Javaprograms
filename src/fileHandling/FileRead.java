package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) throws FileNotFoundException {
		File fi=new File("D:\\Balaji\\Documents.txt");
		Scanner sc=new Scanner(fi);
		while(sc.hasNextLine()){
			String str=sc.nextLine();
			System.out.println(str);
		}
sc.close();
fi.delete();
	}

}
