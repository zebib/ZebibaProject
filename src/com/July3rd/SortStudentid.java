package com.July3rd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SortStudentid {

	public static void main(String[] args) {
		ArrayList<Student3> gs=new ArrayList<>();
		Scanner dc=new Scanner(System.in);
		int id;
		String name ;
		int score ;
		char grade;
		int count;
		
		for(count=0;count<2;count++){
			//.add(System.out.println("Enter you Name:"));
			System.out.println("Enter you Name:");
			String nm=dc.nextLine();
			System.out.println();
			
			System.out.println("Enter your score:");
			String sco=dc.nextLine();
			System.out.println();
			
			
			System.out.println("Enter your id:");
			String i=dc.nextLine();
			System.out.println();
			
			//gs.add(new Student3(102,"sina",100));
			//gs.add(new Student3(103,"Reya",100));
			//gs.add(new Student3(104,"rubit",100));
			
		}
		
//Collections.sort(gs);
Iterator<Student3> itr=gs.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}

	}

}
