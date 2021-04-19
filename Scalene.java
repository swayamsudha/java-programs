/*Wap to find area of a scalene triangle*/


class Scalene
{
	public static void main(String func[])
	{
		int a,b,c;
		float s,area;
		
		
		a = Integer.parseInt(func[0]);
		b = Integer.parseInt(func[1]);
		c = Integer.parseInt(func[2]);
		System.out.println("The three sides of a triangle are: " +a+ "," +b+ "," +c  );
		
		s = (a + b + c)/2;
		area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of the scalene triangle is: " +area);
		
	}
}