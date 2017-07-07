package june30;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import JUNE29.Student;


public class Arraylist1 {
	public static void main(String[]args){
		int id;
		String name;
		int score;
		
//while(true){
	
	ArrayList<Student>S=new ArrayList();
	Scanner st=new Scanner (System.in);
	System.out.println("Please Enter your id");
	int  id1=st.nextInt();
	System.out.println();
	
	System.out.println("Please Enter your name");
	String name1=st.next();
	System.out.println();
	
	System.out.println("Please Enter your score");
	int score1=st.nextInt();
	System.out.println();
	
	System.out.println("if you want continue type N/Y");
	
		System.out.println("SCORE IS  :" + score1);
		 for (int col = 0; col < name1.length(); col++)
	     {
	       // ArrayList average1 = new ArrayList(10);
	        //ArrayList average2 = new ArrayList(10);
	       // ArrayList average3 = new ArrayList(10);
	       // ArrayList average4 = new ArrayList(10);

	        

	        //average1.add(score1);
	       // average2.add(score1);
	       // average3.add(score1);
	        //average4.add(score1);

	        
			
	        char grade ;

	if (score1>=90 && score1<100){
		System.out.println("came to A");
			grade='A';
	    }
		else if(score1>=80 && score1<90){
		System.out.println("came to B");
			grade='B';
			
		}
		else{
	System.out.println("came to F");
	grade='F';
		}
	for(Student s:S){
		System.out.println(s);
		//when you call iterator 
		//Iterator<Student>it=S.iterator();
		//while(it.hasNext()){System.out.println(it.next());
		
	     }
		}
	}
	
//}


	@Override
	public String toString() {
		return "Arraylist1 []";
	}
}