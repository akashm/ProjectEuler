import java.util.HashSet;


public class Prob21 
{
	public static int d(int n)
	{
		int sum=0;
		for(int j=1;j<=n/2;j++)
		{
			if(n%j==0)
			sum+=j;
		}
		return sum;
	}
	public static void main(String args[])
	{
		HashSet<Integer> h=new HashSet<Integer>();
		long sum=0L;
		for(int i=1;i<=10000;i++)
		{
			int a=i;
			int da=d(a);
			int b=da;
			int db=d(b);
			if(da==b && db==a && a!=b)
			{
				h.add(a);
				h.add(b);
			}
			
		}
		Object[] num=h.toArray();
		for(int i=0;i<num.length;i++)
		{
			sum+=Integer.parseInt(num[i].toString());
		}
		System.out.println(sum);
	}
}
