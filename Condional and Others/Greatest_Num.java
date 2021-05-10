/*WAP to find the greatest among three numbers given as command input*/
//import java.util.Scanner;

class Greatest_Num
{
	public static void main(String args[])
	{
		int x,y,z;
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter the numbers to be tested:-");
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		z = Integer.parseInt(args[2]);
		System.out.println("The numbers to be tested are :- " +x+ "," +y+ "," +z);
		
		if(x > y)
		{
			if(x > z)
				System.out.println("The greates number among the three is:" +x);
		}
		
		if(x < y )
		{
			if(y > z)
				System.out.println("The greates number among the three is:" +y);
		}
		
		if(z>x)
		{
			if(z>y)
				System.out.println("The greates number among the three is:" +z);
		}
		
	}
}