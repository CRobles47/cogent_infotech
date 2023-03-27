package week2;

public class GCDemo {
	int objId;
	
	GCDemo(int objId){
		this.objId = objId;
		
		System.out.println("Created:" + this.objId);
	}
	
	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			new GCDemo(i);
			//System.gc();
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized:" + this.objId);
	}

}
