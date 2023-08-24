package test01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadFileDemo {
	
	public void readFileData(String fileName) throws FileNotFoundException, IOException {
		InputStream file = new FileInputStream(fileName);
		int ch;
		while((ch = file.read()) != -1) {
			System.out.print((char)ch);
		}
	}
	
	public static void main(String[] args) {
		ReadFileDemo obj = new ReadFileDemo();
		try {
			obj.readFileData("D:\\Training\\HSBC\\Batch2\\samplefiles\\File1.txt");
			//obj.readFileData("D:/Training/HSBC/Batch2/samplefiles/File1.txt");
		}
		catch(FileNotFoundException ex) {
			System.out.println("File Not Found.");
		}
		catch(IOException ex) {
			System.out.println("Problem reading file.");
		}
	}
}
