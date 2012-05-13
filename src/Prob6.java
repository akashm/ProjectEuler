
public class Prob6 
{
	public static void main(String args[])
	{
		long sumsq=0;
		for(int i=1;i<=100;i++)
		{
			sumsq+=i*i;
		}
		long sum=0;
		for(int i=1;i<=100;i++)
		{
			sum+=i;
		}
		sum=sum*sum;
		System.out.println(sum-sumsq);
	}
}
