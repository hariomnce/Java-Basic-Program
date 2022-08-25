class MainOverload {
	public static void main(String[] args)
	{
		System.out.println("Inside main method");
		main(23);
		main(45, 88);
	}
	public static void main(int a)
	{
		System.out.println("Inside one parameter main "+a);
	}
	public static void main(int a, int b)
	{
		System.out.println("Inside two parameter main "+a+" "+b);
	}
}