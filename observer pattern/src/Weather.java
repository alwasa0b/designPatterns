import java.util.Observable;

public class Weather extends Observable implements IWeather {
	private int temp = 66;

	/* (non-Javadoc)
	 * @see IWeather#getTemp()
	 */
	@Override
	public int getTemp() {
		return temp;
	}
	
	/* (non-Javadoc)
	 * @see IWeather#getCelsiusTemp()
	 */
	@Override
	public int getCelsiusTemp() {
		return (temp-32)*5/9;
	}

	/* (non-Javadoc)
	 * @see IWeather#setTemp(int)
	 */
	@Override
	public void setTemp(int temp) {
		if (greaterThanOne(temp)) super.setChanged();
		this.temp = temp;
		super.notifyObservers();
	}

	private boolean greaterThanOne(int temp) {
		// TODO Auto-generated method stub
		return Math.abs(this.temp - temp) > 1;
	}
}
