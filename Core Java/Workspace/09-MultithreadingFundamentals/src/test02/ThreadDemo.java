package test02;

public class ThreadDemo {
	public static void main(String[] args) {
		EvenNumberTask task1 = new EvenNumberTask();
		OddNumberTask task2 = new OddNumberTask();
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		System.out.println("Main task over.");
	}
}
