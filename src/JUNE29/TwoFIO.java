package JUNE29;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.SequenceInputStream;
import java.io.Serializable;

public class TwoFIO {

	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 Any obj=new Any ();//2.second create this object 
	     obj.c="This is my Firstclass";           
		FileOutputStream fos=new FileOutputStream("Today");
		FileOutputStream fos1=new FileOutputStream("Today1");
		 ObjectOutputStream oos=new ObjectOutputStream(fos);;
		String c ="This is my Firstclass.";

		oos.write(85);
		fos.close();
		FileInputStream fis=new FileInputStream("Today");
		FileInputStream fis1=new FileInputStream("Today1");
		SequenceInputStream sin=new SequenceInputStream(fis,fis1);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Any obj1;
		try {

			System.out.println("The Sentence of obj1"+" ="+c );
			System.out.println("This is the word you write it"+"="+c);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//to retrieve the data we have the (ois) //it will return me object of object thts why I WRITE (SAVE)
	    
		//while((c = fis.read())!= -1);
		
		sin.read();
		sin.close();
	}

}
class Any   implements Serializable
{
  String c;//1.first create variable int i then assingn the value 

    
}
