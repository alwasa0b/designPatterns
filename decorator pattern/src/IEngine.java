
public interface IEngine {
	public int numCylinders();
	public double blockSize();
	public int getHp();
	public void setHp(int hp);
	public int getTorq();
	public void setTorq(int torq);
	public boolean getEngineHealth();
	public void setEngineHealth(boolean problems);
}
