package Assignment;

import java.util.Scanner;

public class CheckOutp  {

private static final int Inum = 0;



//private static final int Inum = 0;
public static void main(String[]args) {
		
		Scanner input =new Scanner(System.in);
		int Totalcost=0;
		
		String userchoise="Yes/No";
		while(!userchoise.equals("No")){
				
				System.out.println("Do You want buy something!");	
				userchoise=input.next();
				if (userchoise.equalsIgnoreCase("Yes")){
					System.out.println("");
				System.out.println("Enter Item Type");
	String Item=input.next();
	System.out.println();
	if(Item.equals("Potatoes")){
		System.out.println("Enter weight");
		int weight=input.nextInt();
		Potatoes p=new Potatoes( Item, weight);
		System.out.println("your item is"+Item+"weight"+weight+"Pcost=$"+p.getCost());
		
		
	}
		else if(Item.equals("Egg")){
			System.out.println("Enter number=");
			int number=input.nextInt();
			Egg e=new Egg(Item,number);
			System.out.println("Your item ="+Item+"number="+number+"Ecost=$"+e.getCost());
		}
				
		else if(Item.equals("IceCream")){
			System.out.println("Enter number of ice cream");
			int Inum=input.nextInt();
			IceCream i=new IceCream(Item,Inum);
			System.out.println("ITEM="+Item+"Inumber"+Inum+"Icost"+i.getCost());
			}
		else if(Item.equals("Sundae")){
			System.out.println("Enter number of sundae");
			 int Snum1=input.nextInt();
			Sundae s=new Sundae(Item,Inum,Snum1);
			System.out.println("Item"+Item+"Snumber"+Snum1);
		}
		else {
			System.out.println("done!");
		}
	
			System.out.println("Do you want to continue?Yes/No");
			userchoise=input.next();
			if (userchoise.equals("yes")){
				continue;
				
			}
			else if(userchoise.equalsIgnoreCase("No")){
				System.out.println("You've done! you are out of loop.");
			}
			
				}	
				else if(userchoise.equalsIgnoreCase("no"));
				break;
				
		}
		}
		
				

public double getCost() {
	// TODO Auto-generated method stub
	return 0;
}
				
}



