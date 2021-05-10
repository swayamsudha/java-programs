/* How to achieve to multiple inheritance in java  with same method name*/
interface BaseMultiple12
{
	void show1();
}
interface BaseMultiple21
{
	void show2();
}
interface ChildMultiple22 extends BaseMultiple21
{
	public void print();
	//show2
}
class TestInterface // parent class
{
	void demo()
	{
		System.out.println("class parent");
	}
}
class ChildMultiple12 extends TestInterface implements ChildMultiple22,BaseMultiple12
{
	public void show1()
	{
		System.out.println("Base interface");
	}
	public void show2()
	{
		System.out.println("Base 2 interface");
	}
	public void print()
	{
		System.out.println("Child interface");
	}
	void childDemo()
	{
		System.out.println("child class");
	}
}
class DemoMultiple12
{
	public static void main(String args[])
	{
		ChildMultiple12 ob = new ChildMultiple12();
		ob.show1();
		ob.show2();
		ob.print();
		ob.demo();
		ob.childDemo();
	}
}