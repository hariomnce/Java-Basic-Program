class Program1
{
	public static void demo()
	{
		System.out.println("Demo method begins :");
		System.out.println("Inside demo method :");
		System.out.println("Demo method ends :");
	}
	public static void main(String[] args)
	{
	
	demo();
	System.out.println("==================");
	test();
	System.out.println("==================");
	System.out.println("This is main method :");

	}
	public static void test()
	{
		System.out.println("Test method begins :");
		System.out.println("Test method ends :");
	}

}