import java.util.Scanner;

public class TestFirst {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ans ="yes/no";  (ans.equals("yes"));
		System.out.println("Do you want attend java class:");
		String result=sc.nextLine();
		if(!ans.equalsIgnoreCase("no")) {
			System.out.println("Enter your level");
			System.out.println("1.Basic Level(Corejava):");
			System.out.println("1.Junior Level(UI):");
			System.out.println("1.Advanced Level(Advancedjava):");
		
		String level=sc.nextLine();
		
		if(level.equals("Basic")) {
				System.out.println("Your teacher is arjun you can start tommorow!");
			}
			else if(level.equals("Junior level")) {
				System.out.println("your teacher is ahmed!");
			}
		else {
			System.out.println("Your choice is not available.");
		}
	
	
	
	}
	
	}
	}

	
	


