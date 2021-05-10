/*WAP to create a matrix and add it*/
import java.util.Scanner;
class Matrix_Sum
{
	public static void main(String args[])
	{
		int Arr1[][] = new int [20][30];
		int Arr2[][] = new int [30][20];
		int res[][] = new int [20][20];
		
		//DATA FOR 1ST MATRIX
		int m1,m2,n1,n2;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the row and coloumn of the first matrix : ");
		m1 = sc.nextInt();
		n1 = sc.nextInt();
		System.out.println("Enter the elements into the array:");
		for (int i=0;i<m1;i++)
		{
			for(int j=0;j<n1;j++)
			{
				System.out.println("Enter the values:");
				Arr1[i][j] = sc.nextInt();
			}
		}
		
		//DATA FOR THE SECOND MATRIX
		System.out.println("Enter the row and coloumn of the second matrix : ");
		m2 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.println("Enter the elements into the array:");
		for (int i=0;i<m2;i++)
		{
			for(int j=0;j<n2;j++)
			{
				System.out.println("Enter the values:");
				Arr2[i][j] = sc.nextInt();
			}
		}
		
		//SHOW THE 1ST MATRIX
		System.out.println("The first matrx is : ");
		for (int i=0;i<m1;i++)
		{
			for(int j=0;j<n1;j++)
			{
				System.out.print(Arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(" ");
		
		//SHOW THE 2ND MATRIX
		System.out.println("The Second matrx is : ");
		for (int i=0;i<m2;i++)
		{
			for(int j=0;j<n2;j++)
			{
				System.out.print(Arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(" ");
		
		
		//CONDITION FOR SUM
		if (m1==m2 && n1==n2)
		{
			System.out.println("Addition of two matrices are:");
			for(int i=0;i<m1;i++)
			{
				for(int j=0;j<n1;j++)
				{
					res[i][j] = Arr1[i][j]+Arr2[i][j];
				}
			}
			
			//PRINTING THE SUM WITH THE TWO MATRICES AND RESULTANT MATRIX
			for (int i=0;i<m2;i++)
			{
				for(int j=0;j<n2;j++)
				{
					System.out.print(Arr1[i][j] + "  ");
				}
				System.out.println("\n");
			}
			System.out.println("  + \n");
			for (int i=0;i<m2;i++)
			{
				for(int j=0;j<n2;j++)
				{
					System.out.print(Arr2[i][j] + "  ");
				}
				System.out.println("\n");
			}
			System.out.println("  = \n");
			for(int i=0;i<m1;i++)
			{
				for(int j=0;j<n1;j++)
				{
					System.out.print(res[i][j]+ " "); 
				}
				System.out.println("\n");
			}
			System.out.println();
		}
		else
		{
			System.out.println("Addition is not possible!!");
		}
	}
}