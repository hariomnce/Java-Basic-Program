import java.util.Scanner;
class Program8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number ");
		int x = sc.nextInt();
		{
			int fact = 1;
			int count = 1;
			while(count<=x)
			{
				fact = fact*count;
				count++;
			}
				System.out.println("fact is "  +fact);
		}
	}
}