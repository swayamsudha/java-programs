import java.util.*;
class Largest_Smallest_3_2
{
	public static void main(String args[])
	{	
		int temp,small,large,j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array:");
		int size=sc.nextInt();
		
		int[] intArray=new int[size];
		System.out.println("Enter the Array Elements:");
		for( int i=0;i<size;i++)
			intArray[i]=sc.nextInt();
		
		System.out.println("Array Elements :");
		for(int i=0;i<size;i++)
		{
			System.out.println(intArray[i]);
		}
		for (int i =0;i<size;i++)
		{
			for (j=1; j<size-i; j++)
			{
				if(intArray[j-1]>=intArray[j])
				{
					temp = intArray[j-1];
					intArray[j-1]=intArray[j];
					intArray[j]=temp;
				}
			}
		}

		int[] Array=new int[size];
		int Arraysize = 0;
		
		for(int i=0;i<size;i++)
		{
			for( j=0; j<Arraysize;j++)
			{
				if(intArray[i]==Array[j])
				{
					break;
				}
			}
			if (j == Arraysize)
			{
				Array[Arraysize++] = intArray[i];
			}
		}
		
		if(Arraysize < 2)
		{
			System.out.println("\nNo 2nd smallest element");
		}
		else
		{
			System.out.println("2nd smallest element = " +Array[1]);
		}
		if(Arraysize < 3)
		{
			System.out.println("\nNo 3rd largest element");
		}
		else
		{
			System.out.println("3rd largest element = " +Array[Arraysize-3]);
		}
	}
}
