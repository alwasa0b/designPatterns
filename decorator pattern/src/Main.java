
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IGolf golf = new Golf();
		IGolf gti = new Gti(golf);
		
		System.out.println(golf.GetCost());
		System.out.println(gti.GetCost());
		
		System.out.println(golf.GetWheels());
		System.out.println(gti.GetWheels());

	}

}
