package Texample;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputDemo {//to see the out put I have to create this files in my computer

	public static void main(String[] args)throws IOException {
		//FileInputStream fin=new FileInputStream ("C:\\Tem\\test.txt");
		FileOutputStream fout=new FileOutputStream("C:\\Test.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		//BufferedInputStream bin=new BufferedInputStream(fin);
		
		/*File f=new file(D:\\CubicTemp.txt);//why this error
		FileOutputStream fout=null;
		if (!f.exist()){
			fout=new file(D:\\CubicTemp.txt);
		}*/
			
		//String s="cubic technology"; //if I want to write it in my file
		//byte[]b=s.getBytes();
		//fout.write(b);
		//bout.write(b);
		//bin.close();
		bout.write(65);
		bout.flush();
		fout.close();
		
		
/*System.out.println(bin.read());
bout.write(70);
bout.flush();//flush is used to inclose my buffer memory( file)
fin.close();
fout.close();*/
//int s;
//while(s=fin.read()!=-1){
	//System.out.println((char)s);
		
		/*FileInputStream fin=new FileInputStream ("C:\\Tem\\test.txt");
		
		int s;
		while(s=fin.read()!=-1){
			System.out.println((char)s);
		
		//System.out.println((char)fin.read());
		/*FileOutputStream fout=new FileOutputStream("C:\\CubicTem\\test.txt");//Ican only write byte
		//while()
		fout.write(66);
		fout.write(65);*///this is writing somthing 
	}

}
