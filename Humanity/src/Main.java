
public class Main {
	
	public static void print(String act){
		System.out.format("Human act %s \n", act);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human = new HumanImp();
		print(human.Act());
		
		Human muslims = new Muslims();
		print(muslims.Act());
		
		Human sauidMuslims = new Muslims(new SaudiIslam());
		print(sauidMuslims.Act());
	}

}
