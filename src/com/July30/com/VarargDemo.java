package com.July30.com;

public class VarargDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(1);
display(2,"somename");
display(5,"Somename", "Some other name");//somename is argument
	}
public static void display(int num,String... name ){//int num is parameter
	System.out.println("come to display method");
	System.out.println(num);
	for (String s : name) {
		System.out.println(s);
	}
}
}
