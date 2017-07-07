package june30;

import java.util.LinkedList;
import java.util.Vector;

public class Vectorcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String>v=new Vector(10,1);//Ican change to 5 to any number(5,1)
		//increase by 10//o/p of all this is Capacity of vector is 10 so capacity is by default 10 but size is different
		//size of vector is 8
		v.add("ff");//for this o/p Capacity of vector is 10 --		size of vector is 2

		v.add("ff");
		//v.add("ff");
		//v.add("ff");
		//v.add("ff");
		//v.add("ff");
		//v.add("ff");
		//v.add("ff");
		System.out.println("Capacity of vector is "+v.capacity());
		System.out.println("size of vector is "+v.size());
	}

}
