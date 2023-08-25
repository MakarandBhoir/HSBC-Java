package test03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemo {
	public static void main(String[] args)
	{
		File file = new File("D:\\Training\\HSBC\\Batch2\\samplefiles\\File2.txt");
		try (
			MyResource resource = new MyResource();
			FileOutputStream fos = new FileOutputStream(file, true);

		){
//			if(true)
//				throw new FileNotFoundException();
			
			String str1 = "We are learning file handling!";
			byte b[] = str1.getBytes();
			fos.write(b);
		}
		catch(FileNotFoundException ex) {
			System.out.println("File not found!");
		}
		catch(IOException ex) {
			System.out.println("Problem writing data!");
		}
		catch(Exception ex) {
			System.out.println("Problem in closing resource!");
		}
	}
}
