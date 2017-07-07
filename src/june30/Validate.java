package june30;

import java.util.Scanner;

public class Validate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc =new Scanner(System.in);
		System.out.println("PLEASE TYPENAME(First,Last)");
		 String name=nc.nextLine();
		while(!name.matches("a-zA-Z")){
			
		}
		System.out.println("please retype  name(Last,First)");
	
		name=nc.nextLine();
	}
	

}
