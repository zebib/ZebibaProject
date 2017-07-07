
package FileRWB;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
	

	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream ("source.txt");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(fin);
		double num ;
		double sum=0;
		double total=0;
		while(scan.hasNextLine()){	//while(scan.hasNextLine())//while(s=fin.read()!=-1){
		{
			
		num=scan.nextDouble();
		if(num<0)
		{
			System.out.println("The previous group had a sum of"+Math.round(sum));
			
			total=total+sum;
			
			System.out.println("The group sum had a sum of:"+Math.round(total));
			sum=0;
	     }
			else
			{
				sum=sum+num;
			}
		
		
		
	}

	} 
		System.out.println("The overall sum is:"+Math.round(total));
        
		fin.close();
	}

}