import java.util.Observable;
import java.util.Observer;


public class USACustomer implements Observer {
	IWeather weather;
	
	public USACustomer(IWeather obs){
		weather = obs;
		((Observable) weather).addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("temp for US customers: "+ (weather.getTemp()));
	}
}
