class Program8
{
	public static void main(String[] args)
	{
		int a=8;
		int b=16;
		a++;
		--b;
		int c= b++ + a--;
		int d= --a + 6;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}