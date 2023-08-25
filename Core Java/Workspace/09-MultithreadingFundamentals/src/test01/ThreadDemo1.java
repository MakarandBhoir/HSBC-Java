package test01;

public class ThreadDemo1 {
	
	public void readFile() {
		System.out.println("Reading file data... ===>"+Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		}catch(InterruptedException ex) {
			System.out.println("InterruptedException");
		}
	}
	public void writeDatabase() {
		System.out.println("Writing to database... ===>"+Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		}catch(InterruptedException ex) {
			System.out.println("InterruptedException");
		}
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		Thread mainThread =  Thread.currentThread();
		System.out.println("Thread Name = "+mainThread.getName());
		
		ThreadDemo1 demo1 = new ThreadDemo1();
		demo1.readFile();
		demo1.writeDatabase();
		
		long end = System.currentTimeMillis();
		System.out.println("Time Taken to execute ==> "+(end-start)+" ms!");
		System.out.println("End of the main !!!");
	}
}





