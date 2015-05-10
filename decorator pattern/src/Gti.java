
public class Gti extends Trim {
	IEngine engine;
	Sensor s;
	
	public Gti(IGolf baseGolf) {
		super(baseGolf);
		this.engine = new Engine(4, 2.0);
		s = new Sensor(engine);
	}
	
	public double GetCost(){
		return baseGolf.GetCost()+8000;
	}
	
	@Override
	public IEngine GetEngine() {
		// TODO Auto-generated method stub
		return this.engine;
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
