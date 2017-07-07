package Texample;

import java.util.ArrayList;
import java.util.Collections;

public class SortStudents {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("Reya");
		al.add("Tika");
		al.add("mahesh");
		al.add("Arjun");
		al.add("robin");
		al.add("bereket");
		Collections.sort(al);
		for(String s:al);
		System.out.println(al);
	}

}
