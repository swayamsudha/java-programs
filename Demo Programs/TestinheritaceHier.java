/*WAP to implement Hierarchialinheritance in java*/
class Animal
{
	void eat()
	{
		System.out.println("Eating.....");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking....");
	}
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("Meowing...");
	}
}
class TestinheritaceHier
{
	public static void main(String args[])
	{
		Cat ob = new Cat();
		ob.meow();
		//ob.bark(); it cant inherit Dog class;
		ob.eat();
	}
}