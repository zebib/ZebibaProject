package Assignment;

public  class Egg extends RetailItem {
int pricePerdozone=3;
String name;
int numberofeggs;
double Ecost;
Egg(String name,int numberofeggs){
	super(name);
	this.numberofeggs=numberofeggs;
	
}
	@Override
	public double getCost() {
		
		double Ecost=(pricePerdozone*numberofeggs)/12;
		return Ecost;
		
		
	}
	@Override
	void name() {
		// TODO Auto-generated method stub
		
	}

	
		
	

	
	}


