import java.util.*;
class Default_Sort_Func
{
	public int[] Array_Sort(int [] intArray)
	{
		int temp;
		for (int i =0;i<intArray.length;i++)
		{
			for (int j=1; j<(intArray.length)-i; j++)
			{
				if(intArray[j-1]>=intArray[j])
				{
					temp = intArray[j-1];
					intArray[j-1]=intArray[j];
					intArray[j]=temp;
				}
			}
		}
		return intArray;
	}
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array:");
		int size=sc.nextInt();
		
		int[] Array=new int[size];
		System.out.println("Enter the Array Elements:");
		for( int i=0;i<size;i++)
			Array[i]=sc.nextInt();
		
		System.out.println("Array Elements brfore sorting:");
		for(int i=0;i<size;i++)
		{
			System.out.println(Array[i]);
		}
		
		Default_Sort_Func dsf = new Default_Sort_Func();
		dsf.Array_Sort(Array);
		
		System.out.println("Array Elements after sorting:");
		for(int i=0;i<size;i++)
		{
			System.out.println(Array[i]);
		}
		
	}
}
		
				
				