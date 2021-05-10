class Base
{
	int no =10;
	void show()
	{
		System.out.println(no);
	}
}
class Derived extends Base
{
	int no =20;
}
class Derived2 extends Derived
{
	int no = 30;
	void show()
	{
		System.out.print("Base = " );
		super.show();
		System.out.println("Derived = " +super.no);
		System.out.println("Derived2 = " +no);
		
		
	}
}
class TestSuper
{
	public static void main(String args[])
	{
		 Derived2 ob = new Derived2();
		 ob.show();
	}
}