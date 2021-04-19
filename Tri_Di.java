class Tri_Di
{
	public static void main(String args[])
	{
		
		for(int l=1;l<=5;l++)
		{
			for(int sp=4;sp>=l;sp--)
			{
				System.out.print(" ");
			}
			for(int c=l;c>=1;c--)
			{
				System.out.print(+c);
			}
			for(int d=2;d<=l;d++)
			{
				System.out.print(+d);
			}
			System.out.println();
		}
		for(int l =1; l<=4; l++)
		{
			
			for(int sp=1;sp<=l;sp++)
			{
				System.out.print(" ");
			}
			for(int c=5-l;c>=1;c--)
			{
				System.out.print(+c);
			}
			for(int d=2; d<=5-l; d++)
			{
				System.out.print(+d);
			}
			System.out.println();
		}
	}
}