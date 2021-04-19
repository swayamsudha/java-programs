import java.util.Scanner;
class Matrix_Upper_Tri_Me
{
	public static void main(String args[])
	{
		int Arr[][] = new int [20][30];
		int res[][] = new int [20][20];
		
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
				System.out.print(Arr[i][j]+" " );
			}
			System.out.println();
		}
				
		//UPPER TRIANGULAAR MATRIX IS:
		if(m1==n1)
		{
			System.out.println("\nThe Resultant Upper Triangular matrix is:");
			for(int i=0;i<m1;i++)
			{
				for(int k=0;k<i;k++)
				{
					System.out.print("   ");
				}
				for(int j=i;j<n1;j++)
				{
					System.out.printf("%3d",Arr[i][j]);
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
		else
			System.out.println("Square Matrix is equired ....");
	}
}