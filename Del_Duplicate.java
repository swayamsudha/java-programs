import java.util.*;
class Del_Duplicate
{
	public static void main(String args[])
	{	
		int j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array:");
		int size=sc.nextInt();
		
		int[] intArray=new int[size];
		System.out.println("Enter the Array Elements:");
		for( int i=0;i<size;i++)
			intArray[i]=sc.nextInt();
		
		System.out.println("Array Elements:");
		for(int i=0;i<size;i++)
		{
			System.out.println(intArray[i]);
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
		System.out.println("\nArray Elements after deletion of duplicate elements:");
		for(int i=0;i<Arraysize;i++)
		{
			System.out.println(Array[i]);
		}
	}
}