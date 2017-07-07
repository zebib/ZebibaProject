package com.July3rd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class ArraySort {

	private static Object Student2;
	private static Object Student3;
	private static Object compare;
	private static Object collection;
	private static Object score1;
	private static Object score2;
	public static void main(String[] args) {
		ArrayList<Student>S=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
	int id = 0;
	String name = null;
	int score = 0;
	char grade;
	int count;
	for (count=0;count<3;count++){
		System.out.println("Enter Your Name");
		String Name=scan.nextLine();
		S.add(new Student(id,name,score));
		
	}
	System.out.println("\n\n");
	
	Collection.sort(S,new comparator<com.July3rd.Student3>());
	 int(Comparable Student1,Student2,Student3){
		return Intger.valueOf(score1).compareTo(score2);
	 }
	for(count=0;count<3;count++){
		System.out.println(id +" "+ name+" "+score+" "+grade);
	}
	}

}