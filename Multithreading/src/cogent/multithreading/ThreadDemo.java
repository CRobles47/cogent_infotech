package cogent.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		MyThread mt1 = new MyThread();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt1);
		
		t1.setName("Thread 1");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setName("Thread 2");
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
	}

}
