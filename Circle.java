class Operation
{
	int square(int n)
	{
		return n*n;
	}
}

class Circle
{
	double pi = 3.14;
	Operation op;
	
	double area(int radius)
	{
		op = new Operation();
		int rsq = op.square(radius);
		return pi*rsq;
	}
	
	
	
	public static void main (String args[])
	{
		Circle c= new Circle();
		double result = c.area(5);
		System.out.println(result);
	}
}