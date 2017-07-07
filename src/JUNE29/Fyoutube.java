package JUNE29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Fyoutube {

	

			 public static void main(String[]args) throws IOException, ClassNotFoundException
			{
				 Save obj=new Save ();//2.second create this object 
			     obj.i=4;           //3.third Assign the value
			   //*** we don't store the whole object but we store the value of  (i).
			//so I have(can) store the data(value) of (i) in a file.then you can get it back.

			 File f=new File("OBJ.TXT");//4. to create the file
			 FileOutputStream fos=new FileOutputStream(f);//5/to see the data
		 ObjectOutputStream oos=new ObjectOutputStream(fos);//6.if it is data we change it dataoutput stream to store the data
			   oos.writeObject(obj);//this is to store the object
			    //the below program is used to retrieve data from the file
			FileInputStream fis=new FileInputStream(f);//with out this we can't communicate
			ObjectInputStream ois=new ObjectInputStream(fis);//
			Save   obj1= (Save )ois.readObject();//to retrieve the data we have the (ois) //it will return me object of object thts why I WRITE (SAVE)
			    System.out.println("value of obj1"+" ="+obj1.i);//TO GET THE VALUE OF OBJ1

			   }
			}
/* By default in  java it is not allowed to create an object 
 * to allow you to create an object you have to make some marker interface
 *implement to work with serialization is Serializable.
*/
			    class Save  implements Serializable
			{
			  int i;//1.first create variable int i then assingn the value 
			
			    
	}

			    
			    
			    
