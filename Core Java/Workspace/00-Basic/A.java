class FirstProgram
{
	public static void main(String args[])
	{
		System.out.println("Welcome To HSBC!!!");
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
}
class A{
	public static void main(String []args)
	{
		System.out.println("Welcome To HSBC A!!!");
		FirstProgram.main(args);
	}
}

class B{
	public static void main(String ...args)
	{
		System.out.println("Welcome To HSBC A!!!");
	}
}