import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Arrayex1 {
	public static void main(String[]args) {
	
	ArrayList<String> accountList = new ArrayList<String>(); 
    accountList.add("45678690");
    accountList.add("1");
    accountList.add("0");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Hi whats your pin code?");
    String accountInput = scanner.nextLine();

    boolean listContainsInput = false;
    for  (int counter = 0; counter < accountList.size(); counter++){  
        if (accountInput.equals(accountList.get(counter))){
            listContainsInput = true;
            break;
        }
    }
    if(listContainsInput) {
        System.out.println("Hi");
    } else {
        System.out.println("Incorrect");
    }
}
}