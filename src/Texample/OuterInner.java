package Texample;

public class OuterInner {
	private double balance=100;
	void display(){
		System.out.println("From Inner class");
	}

class Inner{
	void display(){
	System.out.println("From Inner class");
	System.out.println("Balance");
}
}
	public static void main(String[] args) {
		
OuterInner oc=new OuterInner();
OuterInner.Inner ic=oc.new Inner();
oc.display();
ic.display();
	}

}
