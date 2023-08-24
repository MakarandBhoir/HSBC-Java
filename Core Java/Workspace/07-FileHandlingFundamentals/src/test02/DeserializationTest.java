package test02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTest {
	public static void main(String[] args) {
		try {
			File file = new File("D:\\Training\\HSBC\\Batch2\\samplefiles\\File3.ser");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student student = (Student) ois.readObject();
			
			System.out.println("Reading object data:");
			System.out.println(student);
			
			ois.close();
			fis.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("File not found!");
		}
		catch(IOException ex) {
			System.out.println("Problem reading file!");
		}
		catch(ClassNotFoundException ex) {
			System.out.println("Class not found!");
		}
	}
}
