class FruitDriver
{
	public static void main(String[] args)
	{
		Fruit f1=new Fruit();
		f1.name="Mango";
		f1.price=50;
		f1.weight=5;
		System.out.println(f1.name+"  " +f1.price+" " +f1.weight);
		System.out.println("==================");
		Fruit f2=new Fruit();
		f2.name="Guava";
		f2.price=20;
		f2.weight=2;
		System.out.println(f2.name+" " +f2.price+" "+f2.weight);
		System.out.println("=================");
		
		f1.eat();
		f2.juice();
		
	}
}