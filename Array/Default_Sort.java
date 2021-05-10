import java.util.*;
class Default_Sort
{
	public static void main(String args[])
	{	
		int temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array:");
		int size=sc.nextInt();
		
		int[] intArray=new int[size];
		System.out.println("Enter the Array Elements:");
		for( int i=0;i<size;i++)
			intArray[i]=sc.nextInt();
		
		System.out.println("Array Elements brfore sorting:");
		for(int i=0;i<size;i++)
		{
			System.out.println(intArray[i]);
		}
		for (int i =0;i<size;i++)
		{
			for (int j=1; j<size-i; j++)
			{
				if(intArray[j-1]>=intArray[j])
				{
					temp = intArray[j-1];
					intArray[j-1]=intArray[j];
					intArray[j]=temp;
				}
			}
		}
		System.out.println("Array Elements after sorting:");
		for(int i=0;i<size;i++)
		{
			System.out.println(intArray[i]);
		}
	}
}
		
				
				