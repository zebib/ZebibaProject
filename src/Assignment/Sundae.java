package Assignment;

public class Sundae extends IceCream {
	
	
	double priceOfOneToping=0.45;
	int Snumber;
double Scost;
	Sundae(String name, int numberIC,int Snumber) {
		super(name, numberIC);
		this.Snumber=Snumber;
	}
  public  double getCost(){
    	Scost=(pricePerOneIceCream+priceOfOneToping)*Snumber;
    	return Scost;
    }
	@Override
	public String toString() {
		return "Sundae [priceOfOneToping=" + priceOfOneToping + ", Snumber="
				+ Snumber + ", Scost=" + Scost + "]";
	}
}
