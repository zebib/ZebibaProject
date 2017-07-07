package june30;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>a1=new ArrayList();
a1.add("kk");
a1.add("ii");
a1.add("ii");//Array can old duplicate element
a1.remove(2);//for mchanging size of the array
//int[]a={};

//System.out.println("Iterating using for each loop");
for(String s:a1){
	System.out.println(s);
	//when you call iterator 
	//Iterator<String>it=a1.iterator();
	//while(it.hasNext()){System.out.println(it.next());
	
}
	//}

	}
}
