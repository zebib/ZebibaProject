package FileRWB;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationDemo2 {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream("something.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);//we shoud put object of file inpute Stream I have to create file input stream in the above.
	
	System.out.println((Student)oi.readObject());
	oi.close();
	}

}
