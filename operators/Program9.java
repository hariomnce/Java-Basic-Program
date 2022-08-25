class Program9
{
	public static void main(String[] args)
	{
		int i=20;
		int j= --i;
		int k= ++j;
		k++;
		--i;
		++j;
		int p= i++ + --j + k++;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(p);
	}
}