package june30;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArrayForBank {

	public static void main(String[] args) {
	List<String> AccountList = new ArrayList<String>(); 
		      AccountList.add("45678690");
		      
		      @SuppressWarnings("resource")
			Scanner AccountInput = new Scanner(System.in);
		      System.out.println("Hi whats your pin code?");
		      AccountInput.nextLine();

		      for  (int counter = 0; counter < AccountList.size(); counter++){ 
		    	  
		          if (AccountInput.equals(AccountList.get(counter))){ //If Input = ArrayList number then display "hi"
		        	  
		              System.out.println("Hi");

		          }
		          else { //If not = to ArrayList then display "Incorrect"
		              System.out.println("Incorrect");

		          }
		          }
		      }
		      

	}


