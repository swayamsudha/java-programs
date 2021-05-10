class N_Fibbo
{
	int nthfibbo(int N)
	{
		int f=0;
		for(int i=1;i<=N;i++)
		{
			f+=i;
		}
	return f;
	}
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		int val;
		N_Fibbo ob = new N_Fibbo();
		val = ob.nthfibbo(n);
		System.out.println("The value of " +n+"th fibbonaci number is = " +val);
			
	}
}