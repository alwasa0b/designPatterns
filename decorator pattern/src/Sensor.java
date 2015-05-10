import java.util.Observable;
import java.util.Observer;


public class Sensor implements Observer{
	IEngine engine;

	public Sensor(IEngine engine) {
		this.engine = engine;
		((Observable) engine).addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Engine && !((Engine)o).getEngineHealth()) System.out.println("Turn on Check Engine Light on: ");
	}

}
