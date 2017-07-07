package JUNE29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Student {        
	public static void main(String[] args) throws IOException  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your id");
		int id=sc.nextInt();
		
		System.out.println("Please enter your name");
		String name=sc.next();
		System.out.println();
		
		System.out.println("Please enter your score");
		int score=sc.nextInt();
		
		Student1   obj1= new Student1(id,name,score);
	File f=new File("OBJ5.TXT");
	FileOutputStream fos=new FileOutputStream(f);
	 ObjectOutputStream oos=new ObjectOutputStream(fos);
	 oos.writeObject(obj1);
	 //FileInputStream fis=new FileInputStream(f);
		//ObjectInputStream ois=new ObjectInputStream(fis);//
		
		    //System.out.println("Your Grade according you score is"+" ="+obj1.grade);
	}

	public static String[][] Student() {
		// TODO Auto-generated method stub
		return null;
	}

}
class Student1 implements Serializable{
	int id;
	String name;
	int score;
	char grade;
	Student1(int id,String name, int score){
		this.id=id;
		this.name=name;
		this.score=score;
		System.out.println("SCORE IS  :" + score);
	if (score>=90 && score<=100){
		System.out.println("came to A");
			grade='A';
	    }
		else if(score>=80 && score<90){
			System.out.println("came to B");
			grade='B';
			
		}
		else{
	System.out.println("came to F");
	grade='F';
		}
	}
	

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", score=" + score
				+ ", grade=" + grade + "]";
	}

	
}
