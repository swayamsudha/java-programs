class Operation1
{
	int a,b;
	static int c=34;
	int res;
	
	static void change()
	{
		c = 50;
	}
	
	Operation1(int x,int y)
	{
		a = x;
		b = y;
	}
	
	void display()
	{
		System.out.println("a = "  +a+  "\tb = "  +b+  "\tc = "  +c);
	}
	
	void sum() 
	{
		res = a+b+c;
		System.out.println("Addition = " +res);
	}
	
	void sub()
	{
		res = a-b-c;
		System.out.println("Subtraction = " +res);
	}
}
class Operation
{
	public static void main (String args[])
	{
		Operation1.change();
		Operation1 o = new Operation1(200,100);
		o.display();
		o.sum();
		o.sub();
	}
}