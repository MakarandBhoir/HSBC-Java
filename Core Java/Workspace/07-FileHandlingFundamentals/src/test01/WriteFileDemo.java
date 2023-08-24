package test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemo {
	public static void main(String[] args) 
	{
		FileOutputStream fos = null;
		try {
			File file = new File("D:\\Training\\HSBC\\Batch2\\samplefiles\\File2.txt");
			fos = new FileOutputStream(file, true);
			String str1 = "We are learning file handling!";
			byte b[] = str1.getBytes();
			fos.write(b);
		}
		catch(FileNotFoundException ex) {
			System.out.println("File not found!");
		}
		catch(IOException ex) {
			System.out.println("Problem writing data.");
		}
		finally 
		{
			try {
				fos.close();
			}
			catch(IOException ex) {
				System.out.println("Problem closing resource.");
			}
		}
	}
}
