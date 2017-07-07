package Assignment;

public  class IceCream extends RetailItem {


double pricePerOneIceCream=1.50;
	String name;
	int numberIC;
	double Icost;
	IceCream(String name,int numberIC){
		super(name);
		this.numberIC=numberIC;
	}
	public double getCost(){
		Icost=pricePerOneIceCream*numberIC;
		return Icost;
	}
	@Override
	public String toString() {
		return "IceCream [pricePerOneIceCream=" + pricePerOneIceCream
				+ ", name=" + name + ", numberIC=" + numberIC + ", Icost=" + Icost
				+ "]";
	}
	@Override
	void name() {
		// TODO Auto-generated method stub
		
	}

}
