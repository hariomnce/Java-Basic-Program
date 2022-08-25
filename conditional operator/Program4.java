import java.util.Scanner;
class Program4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number : ");
		int num = sc.nextInt();

		String result = num%7==0? "divided by 7" : "not divided by 7";
		System.out.println(num + " is " + result);
	}
}