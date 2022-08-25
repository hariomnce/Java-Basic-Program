import java.util.Scanner;
class Program3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number : ");
		int num = sc.nextInt();

		String evenOdd = num%2==0?"even" : "Odd";
		System.out.println(num + " is " + evenOdd);
	}
}

		