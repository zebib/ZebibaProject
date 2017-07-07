package Fllowstack;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import JUNE29.Student;

public class StudentMarks {
	public static void main(String[] args) throws IOException 
	{   

	    System.out.println("Hello, Welcome to the Student Assesment Calculator");
	                                     //added an extra tab before the FAN to adjust for longer names
	    System.out.println("Student Name \t\tFAN \t\tScore 1\tScore 2\tScore 3\tScore 4\tMark\tGrade");


	    DecimalFormat df2 = new DecimalFormat("#.##");  //rouding to 2 decimal places
	    DecimalFormat df3 = new DecimalFormat("#.###"); //rounding to 3 decimal places

	    String [][] marks = StudentMarks.StudentMarks();  //marks Arrays is the students assignment results
	    String [][] nameFan = Student.Student();          //nameFan is the array containing student names and FANs


	    for (int row = 0; row < marks.length; row++)
	    {                                          //ROW,COL
	        double score1 = Double.parseDouble(marks[row][2]);  //parsing the data from the array into a double
	        double score2 = Double.parseDouble(marks[row][3]);
	        double score3 = Double.parseDouble(marks[row][4]);
	        double score4 = Double.parseDouble(marks[row][5]);

	        double average = score1*0.1 + score2*0.4 + score3*0.2 + score4*0.3;            
	        String grade = null;



	        if (85<=average && average<101) //if average is between 85 and 100
	        {
	            grade = "HD"; //High Distinction
	        }
	        else if (75<=average && average<85) //if average if between 75 and 84
	        {
	            grade = "DN"; //Distinction
	        }
	        else if (65<=average && average<75) //if average is between 65 and 74
	        {
	            grade = "CR"; //Credit
	        }
	        else if (50<=average && average<65) //if average is between 50 and 64
	        {
	            grade = "P"; //Pass
	        }
	        else if (45<=average && average<50) //if average is between 45 and 49
	        {
	            grade = "FA"; //Fail Academic
	        }
	        else if (0<=average && average<45) //if average is between 0 and 44
	        {
	            grade = "F"; //Fail
	        }



	        System.out.println(nameFan[row][0] + "\t\t" + nameFan[row][1] + "\t" + marks[row][2] + "\t" + marks[row][3] + "\t" + 
	                           marks[row][4] + "\t" + marks[row][5] + "\t" + df2.format(average) + "%\t" + grade);
	    }

	     for (int col = 0; col < marks.length; col++)
	     {
	        ArrayList average1 = new ArrayList(10);
	        ArrayList average2 = new ArrayList(10);
	        ArrayList average3 = new ArrayList(10);
	        ArrayList average4 = new ArrayList(10);

	        double part1 = Double.parseDouble(marks[col][2]);
	        double part2 = Double.parseDouble(marks[col][3]);
	        double part3 = Double.parseDouble(marks[col][4]);
	        double part4 = Double.parseDouble(marks[col][5]);

	        average1.add(part1);
	        average2.add(part2);
	        average3.add(part3);
	        average4.add(part4);

	        double avera;
			double average = avera;
	        String grade = null;

	        if (85<=average && average<101) //if average is between 85 and 100
	        {
	            grade = "HD"; //High Distinction
	        }
	        else if (75<=average && average<85) //if average if between 75 and 84
	        {
	            grade = "DN"; //Distinction
	        }
	        else if (65<=average && average<75) //if average is between 65 and 74
	        {
	            grade = "CR"; //Credit
	        }
	        else if (50<=average && average<65) //if average is between 50 and 64
	        {
	            grade = "P"; //Pass
	        }
	        else if (45<=average && average<50) //if average is between 45 and 49
	        {
	            grade = "FA"; //Fail Academic
	        }
	        else if (0<=average && average<45) //if average is between 0 and 44
	        {
	            grade = "F"; //Fail
	        }

	        System.out.println("\t\t\tAverage" + " \t" + average1 + "\t" + average2 + "\t" + average3 + "\t" +
	                                            average4 + "\t" + df2.format(average) + "%\t" +  grade);
	      }
	  }

	private static String[][] StudentMarks() {
		// TODO Auto-generated method stub
		return null;
	}//end of method
	//}//end of class
//	this.outputs:
}
//}

