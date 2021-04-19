/*WAP to find area of triangle ,rectangle , circle,square*/

import java.util.Scanner;
class Area_Shape
{
	public static  void main(String args[])
	{
		int a,b,c,r,s,choose;
		float area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the inputs for area-:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		r = sc.nextInt();
		
		System.out.println("The sides of the triangle are: " +a+ "," +b+ "," +c);
		System.out.println("The sides of the rectangle are: " +a+ "," +b);
		System.out.println("The radius of circle is: " +r);
		System.out.println("The side of the square is : " +a);
		
		System.out.println("Enter the number to choose a shape-:");
		System.out.println("Choose 1 for triangle:");
		System.out.println("Choose 2 for rectangle:");
		System.out.println("Choose 3 for circle:");
		System.out.println("Choose 4 for square:");

		choose = sc.nextInt();

		switch(choose)
		{
			case 1:
				//int a,b,c,s,area;
				s = (a+b+c)/2;
				area = (int) Math.sqrt(s*(s-a)*(s-b)*(s-c));
				System.out.println("Area of the Triangle is " +area);
			
			case 2:
				//int a,b,area;
				area = a*b;
				System.out.println("Area of the ractangle is " +area);
				
			case 3:
				//int r,area;
				area =  (22*r*r)/7;
				System.out.println("Area of the Circle is " +area);
				
			case 4:
				//int a,area;
				area = (int) (Math.pow(a,2));
				System.out.println("Area of the square is " +area);
				
			default:
				System.out.println("Not a valid input!!!! ");
				
				
		}
		 

		 
		
		
	}
}