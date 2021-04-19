//WAP to implement inheritance in java(multi-level)
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
class Puppy extends Dog
{
	void weep()
	{
		System.out.println("Weeping....");
	}
}
class TestDog
{
	public static void main(String args[])
	{
		Puppy ob = new Puppy();
		ob.eat();
		ob.bark();
		ob.weep();
	}
}