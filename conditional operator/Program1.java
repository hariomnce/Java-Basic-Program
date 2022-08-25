import java.util.Scanner;
class Program1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int x = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int y = sc.nextInt();
		System.out.println("Enter the Third Number : ");
		int z = sc.nextInt();
		int big1 = x>y?x:y;
		int finalbig = big1>z?big1:z;
		System.out.println("Bigger of three number " +x+ "," +y+ " and " +z+ " is :" + finalbig);
	}
}