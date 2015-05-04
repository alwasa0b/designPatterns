import java.util.Observable;
import java.util.Observer;


public class WorldCustomer implements Observer{
	IWeather weather;
	
	public WorldCustomer(IWeather obs){
		weather = obs;
		((Observable) weather).addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("SecondCustomer "+ weather.getCelsiusTemp());

	}
}
