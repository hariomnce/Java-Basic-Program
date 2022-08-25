class Program7
{
	public static void main(String[] args)
	{
		calculator(30,45);
		calculator(54,62);
	}
	public static void calculator(int x, int y)
	{
		int sum = x + y;
		int multiply = x*y;
		
		System.out.println("sum of  "+x+ " and " +y+ " is: " +sum);
		System.out.println("Product of  "+x+" and " +y+ " is: " +multiply);
		System.out.println("==================");
	}
}