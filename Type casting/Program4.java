class Program4
{
	public static void main(String[] args)
	{
		byte b=54;
		int x=b;
		System.out.println("The value of x is: ");
		System.out.println(x);
		{
			int y=254;
			double d=y;
			System.out.println("The value of d is: ");
			System.out.println(d);
			{
				char c='@';
				int a=c;
				System.out.println("The value of @ is: ");
				System.out.println(a);
				{
					int p=131;
					byte q=(byte)p;
					System.out.println("The value of q is: ");
					System.out.println(q);
				}
			}
		}
	}
}