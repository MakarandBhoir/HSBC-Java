package test02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
	public static void main(String[] args) {
		try {
			Student student = new Student(1, "Pravin", 89);
			File file = new File("D:\\Training\\HSBC\\Batch2\\samplefiles\\File3.ser");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(student);
			System.out.println("Saving object data to file.");
			
			oos.close();
			fos.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("File not found!");
		}
		catch(IOException ex) {
			System.out.println("Problem writing file!");
		}
	}
}
