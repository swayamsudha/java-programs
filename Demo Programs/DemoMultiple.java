/* How to achieve to multiple inheritance in java*/
interface BaseMultiple1
{
	void show1();
}
interface BaseMultiple2
{
	void show2();
}
class ChildMultiple implements BaseMultiple1,BaseMultiple2
{
	public void show1()
	{
		System.out.println("Base1");
	}
	public void show2()
	{
		System.out.println("Base2");
	}
}
class DemoMultiple
{
	public static void main(String args[])
	{
		ChildMultiple ob = new ChildMultiple();
		ob.show1();
		ob.show2();
	}
}