
public class Golf implements IGolf {
	public Golf() {
		this.engine = new Engine(4, 1.7);
	}

	private IEngine engine;

	@Override
	public double GetCost(){
		return 17000.00;
	}

	@Override
	public String GetStereo() {
		// TODO Auto-generated method stub
		return "basic stereo";
	}

	@Override
	public String GetWheels() {
		// TODO Auto-generated method stub
		return "16 inch";
	}

	@Override
	public String GetTrim() {
		// TODO Auto-generated method stub
		return "GOLF";
	}

	@Override
	public IEngine GetEngine() {
		// TODO Auto-generated method stub
		return this.engine;
	}

	@Override
	public String GetMPG() {
		// TODO Auto-generated method stub
		return "25 City, 38 HWY";
	}

}
