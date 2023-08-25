package test02;

public class OddNumberTask implements Runnable{
	@Override
	public void run() {
		for(int i=1; i<=20; i+=2) {
			System.out.println("Odd Number = "+i);
		}
		System.out.println("Odd number task is over.");
	}
}
