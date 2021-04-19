import java.util.Scanner;
class Floyd
{
	static void printFloyd(int rows)
	{
		int num = 1;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int r = sc.nextInt();
		System.out.println("The triangle is :");
		printFloyd(r);
	}
}