import java.util.Scanner;
class Matrix_Transpose
{
	public static void main(String args[])
	{
		int Arr[][] = new int [20][30];
		//int Arr2[][] = new int [30][20];
		int res[][] = new int [20][20];
		
		//DATA FOR 1ST MATRIX
		int m1,n1;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the row and coloumn of the  matrix : ");
		m1 = sc.nextInt();
		n1 = sc.nextInt();
		System.out.println("Enter the elements into the matrix:");
		for (int i=0;i<m1;i++)
		{
			for(int j=0;j<n1;j++)
			{
				System.out.println("Enter the values:");
				Arr[i][j] = sc.nextInt();
			}
		}
		
		//SHOW THE 1ST MATRIX
		System.out.println("The matrx is : ");
		for (int i=0;i<m1;i++)
		{
			for(int j=0;j<n1;j++)
			{
				System.out.print(Arr[i][j] + " ");
			}
			System.out.println();
		}
		//System.out.println(" ");
		
		//FOR TRANSPOSE
		for(int i=0;i<m1;i++)
		{
			for(int j=0;j<n1;j++)
			{
				res[j][i] = Arr[i][j];
			}
			//System.out.println(" ");
		}
		
		System.out.println("The Transpose of the matrix is : ");
		for (int i=0;i<n1;i++)
		{
			for(int j=0;j<m1;j++)
			{
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(" ");
	}
}
		
	
		
		
		