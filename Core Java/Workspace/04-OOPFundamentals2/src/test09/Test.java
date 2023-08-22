package test09;

public class Test {
	public static void main(String[] args) {
		Customer customer = new Customer("Makarand", "Bhoir");
		
		Account acc = new Account(1000);
		
		customer.setAccount(acc); // setup relation
		
		customer.getAccount().deposit(500);
		
		System.out.println(customer.getFirstName());
		System.out.println(customer.getLastName());
		System.out.println(customer.getAccount().getBalance());
	}
}
