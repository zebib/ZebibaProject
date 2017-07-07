package june30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>l1=new LinkedList();
		l1.add("kk");
		l1.add("ii");
		l1.add("ii");//Array can old duplicate element
		//l1.remove(2);//for mchanging size of the array
		//int[]a={};
		//Iterator<String>it=l1.iterator();
		Iterator<String>it=l1.descendingIterator();//Special iterator
		System.out.println("Iterating using for each loop");
		for(String s:l1){
			System.out.println(s);
			//when you call iterator 
			//Iterator<String>it1=l1.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			
		}
			}
	}

}
