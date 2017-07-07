package Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckOut1 {
	
	public static void main(String[]args) throws IOException{//1 open
		
			ArrayList<Integer> al=new ArrayList();
			Scanner input =new Scanner(System.in);
			String userchoise="Yes/No";
			
		
		
			while(!userchoise.equals("No"))
			{ //2 open
				System.out.println("Do You want buy something");
				userchoise=input.nextLine();
				//String num="1 or 2";
				if (userchoise.equalsIgnoreCase("Yes")){//3 open
					
				}
						System.out.println("Choose One these:");
						System.out.println("1.Potatoes");
						System.out.println("2.Egg");
						System.out.println("3.IceCream");
					System.out.println("Enter your num choice");
		                  String pnum=input.next();
		               System.out.println();
		               if(pnum.equals("1")){
			System.out.println("Enter type of Potatoes:");
			System.out.println("1)Sweet    2)Normal");
			System.out.println("Enter your potatoe number:");
			 pnum=input.next();
			 if(pnum.equalsIgnoreCase("1")){
				 System.out.println("Enter weight");
					int weight=input.nextInt();
					Potatoes p=new Potatoes( pnum, weight);
					System.out.println("your item is"+pnum+"weight"+weight+"Pcost=$"+p.getCost());
					System.out.println("Total pcost=$"+p.getCost());
			 }
		                  
			 else if (pnum.equals("2")){
				 System.out.println("Enter weight");
					int weight=input.nextInt();
					Potatoes p=new Potatoes( pnum, weight);
					System.out.println("your item is"+pnum+"weight"+weight+"Pcost=$"+p.getCost());
					System.out.println("Total pcost=$"+p.getCost());
			 }
			 else{
				 System.out.println("Either press 1 or 2");
			
			 }
		               }
			 
		               
			 
				
		   else if(pnum.equals("2")){
				System.out.println("choose one of these:");
				System.out.println("2.1)Brown  2.2)White");
				String egnum1=input.next();
				
				if(egnum1.equalsIgnoreCase("2.1")){
					System.out.println("your choise is Brown Egg:");
					System.out.println("Enter number=");
					int number=input.nextInt();
					Egg e=new Egg(egnum1,number);
					System.out.println("Your item =Brown Egg"+"number="+number+"Ecost=$"+e.getCost());
					System.out.println("Total ecost=$"+e.getCost());
				}
			
				else if(egnum1.equalsIgnoreCase("2.2")){
					System.out.println("your choice is White potatoes:");
				System.out.println("Enter number");
				int number=input.nextInt();
				Egg e=new Egg(egnum1,number);
				System.out.println("Your item ="+egnum1+"number="+number+"Ecost=$"+e.getCost());
				System.out.println("Total ecost=$"+e.getCost());
				}
				else{
					System.out.println("Please either brown or white eggs");
					}
				}
			
			else if(pnum.equals("3")){
				System.out.println("Enter number of ice cream");
				int Inum=input.nextInt();
				IceCream i=new IceCream(pnum,Inum);
				System.out.println("ITEM="+pnum+"Inumber"+Inum+"Icost"+i.getCost());
				System.out.println("Total icost"+i.getCost());
				}
		               
				else if(pnum.equals("Sundae")){
				System.out.println("Enter number of sundae");
				 int Snum1=input.nextInt();
				int Inum = 0;
				Sundae s=new Sundae(pnum,Inum,Snum1);
				System.out.println("Item"+pnum+"Snumber"+Snum1);
			
				}
				else{System.out.println();}
		               
		               
		               
		        System.out.println("Do you wanna to continue?(y/n");
		        String n=input.next();
		        if(n.equalsIgnoreCase("yes")){
		        	continue;
		        }
		        else{
		        	break;
		        }
		      
		    
					
			}
			
			}
				
			
	public double getCost() {
		System.out.println();
		return 0;
	}
					
	}





