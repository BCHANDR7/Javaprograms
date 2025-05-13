package fileHandling;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 

public class FileWrite
{
	public static void main(String args[]) throws IOException
	{
		File fi=new File("D:\\Balaji\\Documents.txt");
		FileWriter fw=new FileWriter(fi);
		fw.write("Docuemnts ....vdffs");
	fw.flush();
		
		
		
	}
}