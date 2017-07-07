import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class WrapedC {
	String name;
	int id ;
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
	
		int count;
		Scanner sc=new Scanner(System.in);
		
		for(count=0;count<3;count++){
			
	
			System.out.println("Enter you name:");
			String nam=sc.nextLine();
			
		}
		/*
		al.add( Integer.valueOf(105));
		al.add(Integer.valueOf(789));
		al.add(Integer.valueOf(12));
		al.add(Integer.valueOf(78));
		al.add(Integer.valueOf(24));*/
		al.add(sc);
		Collections.sort(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		
	
		}
	}

	@Override
	public String toString() {
		return "WrapedC [name=" + name + ", id=" + id + "]";
	}

	
	
	
	
}
