
public class Gti extends Trim {

	public Gti(IGolf baseGolf) {
		super(baseGolf);
	}
	
	public double GetCost(){
		return baseGolf.GetCost()+8000;
	}
	
	@Override
	public String GetEngine() {
		// TODO Auto-generated method stub
		return "2.0 turbo engine";
	}

	@Override
	public String GetMPG() {
		// TODO Auto-generated method stub
		return "25 City, 34 HWY";
	}
	
	public String GetTrim() {
		// TODO Auto-generated method stub
		return "GTI";
	}
	
	public String GetWheels() {
		// TODO Auto-generated method stub
		return "18 inch alloy wheels";
	}

}
