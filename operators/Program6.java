class Program6
{
	public static void main(String[] args)
	{
		int x=16;
		int y=++x;
		y++;
		++y;
		x++;
		int z=x++;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}