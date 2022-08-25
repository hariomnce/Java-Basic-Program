class Program7
{
	public static void main(String[] args)
	{
		int x=20;
		x++;
		int y=x++;
		y--;
		int z=--y;
		x++;
		int a=++x + --y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}
}