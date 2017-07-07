package FileRWB;

import java.util.Scanner;

public class InputMissmatch {

	private static final boolean IOException = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int uv = 0;
while(uv<=0){
	try{
	System.out.println("Please ENTER VALID VALUE");
	uv=s.nextInt();
	cach(IOException);
	}
}
	
	System.out.println(uv);
	System.out.println("done");
	
}

	private static void cach(boolean ioexception2) {
		// TODO Auto-generated method stub
		
	}
	}

}
