package com.July3rd;

public class Student3 implements Comparable<Student3>  {
	

	
		int id;
		String name;
		int score;
		char grade;
		Student3(int id,String name, int score){
			this.id=id;
			this.name=name;
			this.score=score;
			System.out.println("SCORE IS  :" + score);
			//System.out.println(" "+id+" "+name+" "+score);
		if (score>=90 && score<=100){
			System.out.println("came to A");
				grade='A';
				System.out.println(" "+id+" "+name+" "+score);
		    }
			else if(score>=80 && score<90){
				System.out.println("came to B");
				grade='B';
				System.out.println(" "+id+" "+name+" "+score);
			}
			else{
		System.out.println("came to F");
		grade='F';
		System.out.println(" "+id+" "+name+" "+score);
			}
		}
		

		@Override
		public String toString() {
			return "Student3 [id=" + id + ", name=" + name + ", score=" + score
					+ ", grade=" + grade + "]";
		}


		@Override
		public int compareTo(Student3 arg0) {
			If(id >){
				
			}
			return 0;
		}

		
	}


