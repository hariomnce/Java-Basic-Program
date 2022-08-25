class Program6
{
	public static void calculator(int x, int y)
	{
		int sum = x + y;
		int multiply = x*y;
		int sub = x-y;
		System.out.println("sum of  "+x+ " and " +y+ " is: " +sum);
		System.out.println("Product of  "+x+" and " +y+ " is: " +multiply);
		System.out.println("Difference of  "+x+" and " +y+ " is: " +sub);
		System.out.println("==================");
	}
	public static void main(String[] args)
	{
		calculator(24,42);
		calculator(100,400);
		calculator(210,355);
	}

}