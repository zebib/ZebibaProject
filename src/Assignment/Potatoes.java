package Assignment;

public  class Potatoes extends RetailItem{
	

	int pricePerpound=1;
	String name;
	int weight;
	double Pcost;
	Potatoes(String name,int weight){
		super(name);
		this.weight=weight;
		
	}
	public double getCost(){
		Pcost=pricePerpound*weight;
		return Pcost;
		
	}
	@Override
	public String toString() {
		return "Potatoes [pricePerpound=" + pricePerpound + ", name=" + name
				+ ", weight=" + weight + ", Pcost=" + Pcost + "]";
	}
	@Override
	void name() {
		// TODO Auto-generated method stub
		
	}

	
		
	}


