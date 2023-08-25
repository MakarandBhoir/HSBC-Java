package test01;

class Task1 implements Runnable{
	public void task1() {
		System.out.println("Reading file ==> ");
	}
	@Override
	public void run() { // Running
		task1();
	} // Dead
}
public class ThreadDemo2 {
	public static void main(String[] args) {
		Thread t1 = new  Thread(new Task1()); // New // worker thread		
		t1.start(); // Runnable
		
		System.out.println("End of Main!");
	}
}



