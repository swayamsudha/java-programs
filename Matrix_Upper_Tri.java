import java.util.Scanner;

class Matrix_Upper_Tri
{
	public static void main(String args[])
	{
		//int Arr2[][] = new int [30][20];
		//int res[][] = new int [20][20];
		
		//DATA FOR 1ST MATRIX
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the row and coloumn of the matrix : ");
		int m1 = sc.nextInt();
		int n1 = sc.nextInt();

        if (m1 != n1)
        {
            System.out.println("row and column are not same.");
            sc.close();
            return;
        }

		int arr[][] = new int[m1][n1];
		
		System.out.println("Enter the elements into the array:");
		for (int i=0;i<m1;i++)
		{
			for(int j=0;j<n1;j++)
			{
				System.out.println("Enter the values:");
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("The  matrix is : ");
		for (int i=0;i<m1;i++)
		{
			for(int j=0;j<n1;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//UPPER TRIANGULAAR MATRIX IS:
		System.out.println("\nThe Resultant Upper Triangular matrix is:");
			
		for(int i=0;i<m1;i++)
		{
				//System.out.print(" ");
				for(int j=0;j<n1-i;j++)
				{
					System.out.print(arr[i][j]+ " " );
				}
				System.out.println();
		}

		sc.close();
	}
}