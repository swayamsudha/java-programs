/*SUPER CLASS  IS USED TO REFER IMMEDEATE PARENT CALSS INSTANCE VARIABLE*/
class Animal
{
	String colour="White";
}
class Dog extends Animal
{
	String colour="Black";
	void printColour()
	{
		System.out.println(super.colour);
		System.out.println(colour);
	}
}
class TestSuper1
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.printColour();
		
	} 
}