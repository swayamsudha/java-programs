import java.util.Scanner;
public class BitwiseOperations
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{	int x,y,choose;
			System.out.println("           BITWISE OPERATIONS         :");
			System.out.println("Enter the 1st number");
			x = sc.nextInt();
			System.out.println("Enter the 2nd number");
			y = sc.nextInt();
			
			System.out.println("choose the operation to be done:");
			System.out.println("Choose 1 for bitwise and:");
			System.out.println("Choose 2 for bitwise or:");
			System.out.println("Choose 3 for bitwise xor:");
			System.out.println("Choose 4 for bitwise right shift:");
			System.out.println("Choose 5 for bitwise left shift:");
			
			choose = sc.nextInt();
			switch(choose)
			{
				case 1:
				int and;
				and = x & y;
				System.out.println("Result: "+and);
				break;
				
				case 2:
				int or;
				or = x | y;
				System.out.println("Result: "+or);
				break;
				
				case 3:
				int xor;
				xor = x ^ y;
				System.out.println("Result: "+xor);
				break;
				
				case 4:
				int RS;
				RS = x >> y;
				System.out.println("Result: "+RS);
				break;
				
				case 5:
				int LS;
				LS = x << y;
				System.out.println("Result : "+LS);
				break;
				
				default:
				System.out.println("No valid arithmetic operations!!!!!!");
				System.out.println("Thank you");
			}
		}
	}
}