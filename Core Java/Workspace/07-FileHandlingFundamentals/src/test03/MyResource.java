package test03;

public class MyResource implements AutoCloseable{
	@Override
	public void close() throws Exception {
		System.out.println("MyResource is closed.");
	}
}
