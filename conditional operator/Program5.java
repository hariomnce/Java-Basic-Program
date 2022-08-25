import java.util.Scanner;
class Program5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  Number : ");
		int num = sc.nextInt();

		String result = num%2==0? "Positive" : "Negative";
		System.out.println(num + " is " + result);
	}
}