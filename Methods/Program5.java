import java.util.Scanner;
class Program5
{
	public static void calculator()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the vale of x: ");
		int x = sc.nextInt();
		System.out.print("Enter the value of y: ");
		int y = sc.nextInt();
		int sum = x+y;
		int multiply = x*y;
		int sub = x-y;
		System.out.println("sum of  "+x+ " and " +y+ " is: " +sum);
		System.out.println("Product of  "+x+" and " +y+ " is: " +multiply);
		System.out.println("Difference of  "+x+" and " +y+ " is: " +sub);
	}
	public static void main(String[] args)
	{
		calculator();
	}

}