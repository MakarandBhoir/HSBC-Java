package test02;

public class EvenNumberTask implements Runnable{
	@Override
	public void run() {
		for(int i=2; i<=20; i+=2) {
			System.out.println("Even Number = "+i);
		}
		System.out.println("Even number task is over.");
	}
}
