
public class Trim implements IGolf {
	protected IGolf baseGolf;
	
	public Trim(IGolf baseGolf){
		this.baseGolf = baseGolf;
	}
	@Override
	public double GetCost() {
		// TODO Auto-generated method stub
		return baseGolf.GetCost();
	}

	@Override
	public String GetStereo() {
		// TODO Auto-generated method stub
		return baseGolf.GetStereo();
	}

	@Override
	public String GetWheels() {
		// TODO Auto-generated method stub
		return baseGolf.GetWheels();
	}

	@Override
	public String GetTrim() {
		// TODO Auto-generated method stub
		return baseGolf.GetTrim();
	}

	@Override
	public IEngine GetEngine() {
		// TODO Auto-generated method stub
		return baseGolf.GetEngine();
	}

	@Override
	public String GetMPG() {
		// TODO Auto-generated method stub
		return baseGolf.GetMPG();
	}

}
