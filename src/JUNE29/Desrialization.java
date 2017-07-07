package JUNE29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Desrialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis=new FileInputStream("OBJ5.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		System.out.println((Student1)ois.readObject());
		fis.close();
	}

}
