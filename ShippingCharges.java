public class ShippingCharges {
	private double weight;
	private double distance;
	private double priceMod;
	private double distModC;
	private double distModM;
	private int distMod;
	
	public ShippingCharges(double w, double d){
		weight = w;
		distance = d;
		distModC = (distance / 500);
		distModM = (distance % 500);
		if(distModM > 0){
			distModC++;
		}
		distMod = (int)distModC;
		if(weight <= 2){
			priceMod = 1.1;
		}else if(weight <= 6){
			priceMod = 2.2;
		}else if(weight <= 10){
			priceMod = 3.7;
		}else if(weight > 10){
			priceMod = 4.8;
		}
	}
	
	public double getPrice(){
		return distMod * priceMod;
	}
	
}