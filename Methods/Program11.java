import java.util.Scanner;
class Program11
{
	public static void main(String[] args)
	{
		
		System.out.println("Sum is: "+calculator(23,24.786));
		double result=calculator(2424, 43634);
		System.out.println("Sum is: "+result);
	}

	public static double calculator(int x, double y)
	{
		System.out.println("Method begins");
		double sum=x+y;
		return sum;
		System.out.println("Method ends!");
		
				
	}

}