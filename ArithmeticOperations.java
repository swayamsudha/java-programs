import java.util.Scanner;
public class ArithmeticOperations
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//while(true)
		{	int x,y,choose;
			System.out.println("           ARITHMETIC OPERATIONS         :");
			System.out.println("Enter the 1st number");
			x = sc.nextInt();
			System.out.println("Enter the 2nd number");
			y = sc.nextInt();
			
			System.out.println("choose the operation to be done:");
			System.out.println("Choose 1 for Addition:");
			System.out.println("Choose 2 for Subtraction:");
			System.out.println("Choose 3 for Multiplication:");
			System.out.println("Choose 4 for Division:");
			System.out.println("Choose 5 for Modulus:");
			
			choose = sc.nextInt();
			switch(choose)
			{
				case 1:
				int add;
				add = x + y;
				System.out.println("Addition of the two numbers is : "+add);
				//break;
				
				case 2:
				int sub;
				sub = x - y;
				System.out.println("Subtraction of the two numbers is : "+sub);
				//break;
				
				case 3:
				int mul;
				mul = x * y;
				System.out.println("Multiplication of the two numbers is : "+mul);
				//break;
				
				case 4:
				float div;
				div = (float)x / y;
				System.out.println(" division of the two numbers is : "+div);
				//break;
				
				case 5:
				int mod;
				mod = x % y;
				System.out.println("modulo division of the two numbers is : "+mod);
				//break;
				
				default:
				System.out.println("No valid arithmetic operations!!!!!!");
				System.out.println("Thank you");
			}
		}
	}
}