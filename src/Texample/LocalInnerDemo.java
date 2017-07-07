package Texample;

public class LocalInnerDemo {
	
	void display(){
		
		class Local{
			void display(){
				System.out.println("From Local Inner class");
		}
	}
		Local lc=new Local();//you can create this one any where
		lc.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerDemo oc=new LocalInnerDemo();
		oc.display();
	}
	

}
/* this is local*/