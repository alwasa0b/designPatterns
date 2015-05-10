import java.util.Observable;


public class Engine extends Observable implements IEngine {
	
	private final int numCylinders;
	private double blockSize;
	private boolean HealthyEngine;
	private int torq;
	private int hp;
	
	public Engine(int numCylinders, double blockSize){
		this.numCylinders = numCylinders;
		this.blockSize = blockSize;
		this.HealthyEngine = true;
	}

	@Override
	public int numCylinders() {
		// TODO Auto-generated method stub
		return numCylinders;
	}

	@Override
	public boolean getEngineHealth() {
		return this.HealthyEngine;
	}

	@Override
	public void setEngineHealth(boolean problems) {
		super.setChanged();
		this.HealthyEngine = problems;
		super.notifyObservers();
	}

	@Override
	public double blockSize() {
		// TODO Auto-generated method stub
		return this.blockSize;
	}
	
	@Override
	public int getTorq() {
		return torq;
	}

	@Override
	public void setTorq(int torq) {
		this.torq = torq;
	}

	@Override
	public int getHp() {
		return hp;
	}

	@Override
	public void setHp(int hp) {
		this.hp = hp;
	}

}
