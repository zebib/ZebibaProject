package FileRWB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationDemo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fi=new FileInputStream("empty.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);//we shoud put object of file inpute Stream I have to create file input stream in the above.
	
	System.out.println((Person)oi.readObject());
	oi.close();
	}
	
}
