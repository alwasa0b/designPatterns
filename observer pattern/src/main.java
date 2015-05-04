
public class main {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		
		IWeather w = new Weather();
		USACustomer c1 = new USACustomer(w);
		WorldCustomer c2 = new WorldCustomer(w);
		
		w.setTemp(67);
		w.setTemp(69);
		w.setTemp(70);
		w.setTemp(73);
	}

}
