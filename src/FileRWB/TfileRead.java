package FileRWB;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.SequenceInputStream;

public class TfileRead {
	public static void main(String[] args) throws IOException {
		/*FileInputStream fi1=new FileInputStream ("text.txt");
		FileInputStream fi2=new FileInputStream ("text1.txt");
		SequenceInputStream st=new SequenceInputStream(fi1,fi2);
		  int i;
		  while((i=st.read())!=-1)//for storing the value we change this while(st.read()!=-1)intowhile((i=st.read())!=-1) 
		  {
			  System.out.println((char)st.read());
		  }
		  st.close();
		  fi1.close();
		  fi2.close();*/
	/*	FileOutputStream fo1=FileOutputStream("text.txt");
		FileOutputStream fo2=FileOutputStream("text1.txt");
		FileOutputStream fo3=FileOutputStream("empty.txt")
		ByteArrayOutputStream bt=ByteArrayOutputStream();
		String s="reya,tika,mahesh";
		bt.write(s.getBytes());//bt.write(s.read());//
		bt.writeTo(fo1);
		bt.writeTo(fo2);//
		bt.writeTo(fo2);
		bt.close();*/
		
		FileWriter fw=new FileWriter("text.txt");
		PrintWriter pw=new PrintWriter("text.txt");
		PrintStream ps=new PrintStream("text.txt");
		pw.println();
		pw.print("java programing ");
		pw.print("Cuibic Technology ");
		
		fw.write("java programing");
		fw.close();
		
}
}