package test03;

public class EvenNumberTask implements Runnable{
	@Override
	public void run() {
		for(int i=2; i<=20; i+=2) {
			System.out.println("Even Number = "+i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException ex) {
				System.out.println("InterruptedException");
			}
		}
		System.out.println("Even number task is over.");
	}
}
