package july5th;

public class StudentJu{
	int id;
	String name;
	int score;
	String grade;
	StudentJu(int id,String name,int score){
		this.id=id;
		this.name=name;
		this.score=score;
	}
public int getid() {
	return id;
	
}
public String getName() {
	return name;
	
}

	public String getGrade(int score) {
		//int score=90;
		
		if(score>90 && score<=100) {
			return "A";
		}
		else if(score>80 && score<=90) {
			return "B";
			
		}
		else if(score>70 && score<=80) {
			return "c";
		}
		else {
			return "F";
	}

}
}