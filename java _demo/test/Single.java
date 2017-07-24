package Test;

public class Single {
	private static Single single;

	private Single(){
		super();
	}
	
	public Single getSingle(){
		if(single==null){
			single = new Single();
		}
		return single;
	}
	
}
