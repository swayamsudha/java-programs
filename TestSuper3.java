/*USE OF SUPER TO INVOKE PARENT CLASS CONSTRUCTOR*/
class Animal
{
	void eat()
	{
		System.out.println("Animal is created");
	}
}
class Dog extends Animal
{
	//Dog()
	//{
		void show()
		{
			System.out.println("Dog is craeted");
		}
		void work()
		{
			show();
			eat();
		}
}
class TestSuper3
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.work();
		//d.eat();
	} 
}