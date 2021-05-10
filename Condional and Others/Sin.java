import java.util.Scanner;
class Sin
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		double x = sc.nextDouble();
		
		x = x % (2*Math.PI);
			
		double term = 1.0,sum = 0.0;
		
		for(int i =1; term>0; i++)
		{
			term *= (x/i);
			if(i%4==1)
				sum+=term;
			if(i%4==3)
				sum-=term;
				
		}
		System.out.println("Sum = " +sum);
		
	}
}
 