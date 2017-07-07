package FileRWB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Person p=new Person(101,"reya");
FileOutputStream fo=new FileOutputStream("something.txt");
ObjectOutputStream os=new ObjectOutputStream (fo);
os.writeObject(p);
System.out.println("Serialization Success");//should implemet serializable concept
	}

}
class Person implements Serializable{
	int id;
	String name;
	public Person(int id, String name){
		super();
		this.id=id;
		this.name=name;
	}
	


@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + "]";
}
}
class Student implements Serializable{
	String course;
	
	
}
