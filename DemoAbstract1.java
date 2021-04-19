abstract class BaseAbstract1
{
	abstract void show();
	void display()
	{
		System.out.println("Non abstract method");
	}
	BaseAbstract1()
	{
		System.out.println("Constructor");
	}


}
abstract class DerivedAbstract1 extends BaseAbstract1
{
	 abstract void show(); 
	
		void print()
		{
			System.out.println("child class");
		}
	
}
class ChildAbstract1 extends DerivedAbstract1
{
	void show()//overriding
	{
		System.out.println("Abstract class Demo");
	}
}
class DemoAbstract1
{
	public static void main (String args[])
	{
		DerivedAbstract1 ob;
		ob = new ChildAbstract1();
		ob.show();
		ob.display();
		ob.print();
	}
}

