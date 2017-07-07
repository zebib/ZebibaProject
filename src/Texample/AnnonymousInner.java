package Texample;

public class AnnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       parent anon=new parent(){
       void display(){
	System.out.println("From Anonimous");
}
	};
	parent p=new parent();
	p.display();
	anon.display();

}
}


//child c=new child();
//}
/*class child extends parent{
	child(){
		super.display();
	System.out.println("From child");
}*/
//}
class parent{
	void display(){
		System.out.println("From parent");
	}
	
}