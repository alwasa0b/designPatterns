
public class Golf implements IGolf {
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
		return "Golf";
	}

	@Override
	public String GetEngine() {
		// TODO Auto-generated method stub
		return "1.8L";
	}

	@Override
	public String GetMPG() {
		// TODO Auto-generated method stub
		return "25 City, 38 HWY";
	}

}
