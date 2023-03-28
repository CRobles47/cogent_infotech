package cogent.multithreading;

public class MultiThreaded extends Thread{

	public static void main(String[] args) {
		MultiThreaded mt = new MultiThreaded();
		mt.setPriority(MAX_PRIORITY);
		mt.setName("Carlos");
		mt.start();
		
		MultiThreaded mt1 = new MultiThreaded();
		mt1.setPriority(MIN_PRIORITY);
		mt1.setName("Storm");
		mt1.start();
		
		
	}
	
	@Override
	public void run() {
		System.out.println("Thread name: " + currentThread().getName());
	}

}
