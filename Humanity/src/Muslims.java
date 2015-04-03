
public class Muslims extends Islam implements Human {
	
	private Interpretation interpretation;

	public Muslims(){
		
	}
	
	public Muslims(Interpretation interpretation){
		this.interpretation = interpretation;
	}
	
	public String Act(){
		if(interpretation==null) return super.Act();
		return interpretation.Act();
	}

}
