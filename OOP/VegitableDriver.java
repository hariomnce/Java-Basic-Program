class VegitableDriver
{
	public static void main(String[] args)
	{
		Vegitable v1=new Vegitable();
		System.out.println(v1);
		v1.name="Cauliflower";
		v1.price=60;
		v1.weight=2.5;
		System.out.println(v1.name+"  "+v1.price+"  "+v1.weight);
		Vegitable v2=new Vegitable();
		System.out.println(v2);
		v2.name="Mashroom";
		v2.price=150;
		v2.weight=2;
		System.out.println(v2.name +"  "+v2.price+" "+v2.weight);
		
		v1.eat();
		v2.serve();
	}
}