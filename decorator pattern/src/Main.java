
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IGolf golf = new Golf();
		IGolf gti = new Gti(golf);
		
		System.out.println(golf.GetTrim()+" Wheels: "+golf.GetWheels());
		System.out.println(gti.GetTrim()+" Wheels: "+gti.GetWheels());
		
		System.out.println(golf.GetTrim()+" Engine: "+golf.GetEngine());
		System.out.println(gti.GetTrim()+" Engine: "+gti.GetEngine());
		
		System.out.println(golf.GetTrim()+" MSRP: "+golf.GetCost());
		System.out.println(gti.GetTrim()+" MSRP: "+gti.GetCost());

		gti.GetEngine().setEngineHealth(false);
		gti.GetEngine().setEngineHealth(true);
	}

}
