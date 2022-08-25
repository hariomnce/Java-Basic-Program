import java.util.Scanner;
class Program8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x : ");
		int x = sc.nextInt();
		System.out.print("Enter the value of y :");
		int y = sc.nextInt();
		calculator(x,y);
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