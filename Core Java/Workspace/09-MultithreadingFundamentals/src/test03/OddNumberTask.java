package test03;

public class OddNumberTask implements Runnable{
	@Override
	public void run() {
		for(int i=1; i<=20; i+=2) {
			System.out.println("Odd Number = "+i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException ex) {
				System.out.println("InterruptedException");
			}
		}
		System.out.println("Odd number task is over.");
	}
}
