package test03;

public class ThreadDemo {
	public static void main(String[] args) {
		EvenNumberTask task1 = new EvenNumberTask();
		OddNumberTask task2 = new OddNumberTask();
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException ex) {
			System.out.println("InterruptedException");
		}
		
		System.out.println("State of thread 1 ==> "+t1.getState());
		System.out.println("State of thread 2 ==> "+t2.getState());
		
		System.out.println("Main task over.");
		
	}
}
