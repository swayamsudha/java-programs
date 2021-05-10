/*
* ASS = 9
* ROW AND COLOUMN SUM
*/
import java.util.Scanner;
class Matrix_Sum_Row_Col
{
	public static void main(String args[])
	{
		int Arr[][] = new int [20][30];
		//int Arr2[][] = new int [30][20];
		//int res[][] = new int [20][20];
		
		//DATA FOR 1ST MATRIX
		int m1,n1,sum = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the row and coloumn of the matrix : ");
		m1 = sc.nextInt();
		n1 = sc.nextInt();
		System.out.println("Enter the elements into the array:");
		for (int i=0;i<m1;i++)
		{
			for(int j=0;j<n1;j++)
			{
				System.out.println("Enter the values:");
				Arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("The  matrx is : ");
		for (int i=0;i<m1;i++)
		{
			for(int j=0;j<n1;j++)
			{
				System.out.print(Arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(" ");
		
		System.out.println("SUM OF EACH ROWS :");
		for(int i=0;i<m1;i++ )
		{
			sum = 0;
			for (int j=0;j<n1;j++)
			{
				sum = sum + Arr[i][j];
				
			}
			System.out.println("Sum of the " +i+"th row is = "+ +sum);
		}
		
		System.out.println("\nSUM OF EACH COLOUMN :");
		for(int j=0;j<n1;j++)
		{
			sum = 0;
			for (int i=0;i<m1;i++)
			{
				sum = sum + Arr[i][j];
			}
			System.out.println("Sum of the " +j+"th coloumn is = " +sum);
		}
		
	}
}
			