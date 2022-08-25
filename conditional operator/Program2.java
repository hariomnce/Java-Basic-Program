import java.util.Scanner;
class Program2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Number : ");
		int p = sc.nextInt();

		System.out.println("Enter the Second Number : ");
		int q = sc.nextInt();

		System.out.println("Enter the Third Number : ");
		int r = sc.nextInt();

		System.out.println("Enter the Fourth Number : ");
		int s = sc.nextInt();

		int bigger = ((p>q?p:q)>r?(p>q?p:q):r)>s?((p>q?p:q)>r?(p>q?p:q):r):s;
		System.out.println("Bigger of four number " +p+ "," +q+ ","  +r+ " and " +s+ " is :" + bigger);
	}
}