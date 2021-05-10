/*WAP to create a matrix and multiply it*/
import java.util.Scanner;
class Matrix_Multiplication
{
	public static void main(String args[])
	{
		int sum = 0;
		int Arr1[][] = new int [20][30];
		int Arr2[][] = new int [30][20];
		int res[][] = new int [20][20];
		
		int m1,m2,n1,n2,i,j,k;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the row and coloumn of the first matrix : ");
		m1 = sc.nextInt();
		n1 = sc.nextInt();
		System.out.println("Enter the elements into the array:");
		for ( i=0;i<m1;i++)
		{
			for( j=0;j<n1;j++)
			{
				System.out.println("Enter the values:");
				Arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the row and coloumn of the second matrix : ");
		m2 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.println("Enter the elements into the array:");
		for ( i=0;i<m2;i++)
		{
			for(j=0;j<n2;j++)
			{
				System.out.println("Enter the values:");
				Arr2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The first matrx is : ");
		for ( i=0;i<m1;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print(Arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(" ");
		System.out.println("The Second matrx is : ");
		for ( i=0;i<m2;i++)
		{
			for( j=0;j<n2;j++)
			{
				System.out.print(Arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(" ");
		if(m1 == n2)
		{
			System.out.println("Multiplication of two matrices are:");
			for(i=0;i<m1;i++)
			{
				for( j=0;j<n1;j++)
				{
					res[i][j] = 0;
					for (k=0;k<n1;k++)
					{
						res[i][j]+=Arr1[i][k]*Arr2[k][j];
					}

				}
				
			}
		for( i=0;i<m1;i++)
			{
				for( j=0;j<n2;j++)
				{
					System.out.print(res[i][j]+ " "); 
				}
				System.out.println();
			}
			System.out.println();
		}
		else
		{
			System.out.println("Muliplication is not possible!!! ");
		}
	}
}