package FileRWB;


class Student1{
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
