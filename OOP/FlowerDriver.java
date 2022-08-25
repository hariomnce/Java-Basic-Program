class FlowerDriver
{
	public static void main(String[] args)
	{
		Flower f1=new Flower();
		f1.setValue("Rose",60,1.5);
		Flower f2=new Flower();
		f2.setValue("Sunflower",40,2.5);
		System.out.println("Flower name = " +f1.name);
		System.out.println("Price = " +f1.price);
		System.out.println("Weight = " +f1.weight);
		System.out.println("====================");

		System.out.println("Flower name = " +f2.name);
		System.out.println("Price = " +f2.price);
		System.out.println("Weight = " +f2.weight);
		System.out.println("====================");
	}
}