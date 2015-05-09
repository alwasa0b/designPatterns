
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IGolf golf = new Golf();
		IGolf gti = new Gti(golf);
		
		System.out.println("GOLF Wheels: "+golf.GetWheels());
		System.out.println("GTI Wheels: "+gti.GetWheels());
		
		System.out.println("GOLF Engine: "+golf.GetEngine());
		System.out.println("GTI Engine: "+gti.GetEngine());
		
		System.out.println("GOLF MSRP: "+golf.GetCost());
		System.out.println("GTI MSRP: "+gti.GetCost());

	}

}
