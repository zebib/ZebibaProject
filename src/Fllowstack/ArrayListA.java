package Fllowstack;

import java.util.ArrayList;

public class ArrayListA {

	public static void main(String[] args) {
		ArrayList<Integer> grades=new ArrayList<>();
		 grades.add(78);
		 grades.add(78); 
		 grades.add(78); 
		 grades.add(78); 
		 grades.add(78);
		 for(int i=0;i<=grades.size();i++)
		 {
			 
			 System.out.printf("Grades #%d==%d\n",i, grades.get(i));
		 }
		}
		
		
	}


