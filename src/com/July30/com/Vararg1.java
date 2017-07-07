package com.July30.com;

public class Vararg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		display("somename");
		display("Somename", "Some other name");
	}

	public static void display(String... name) {
		System.out.println("come to display method");
		for (String s : name) {
			System.out.println(s);
		}
	}

}
