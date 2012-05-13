import java.util.ArrayList;


public class Prob5
{
	public static void main(String[] args)
	{
		ArrayList<Long> nums=new ArrayList<Long>();
		for(long i=1;i<=20;i++)
		{
			nums.add(i);
		}
		long res=begin(nums);
		System.out.println(res);
	}
	public static long gcd(long a,long b)
	{
		long t=0;
		while(b!=0)
		{
			t=b;
			b=a%b;
			a=t;
		}
		return a;
	}
	public static long lcm(long a,long b)
	{
		return a*b /gcd(a,b);
	}
	public static long begin(ArrayList<Long> a)
	{
		if(a.size()==2)
		{
			return lcm(a.get(0),a.get(1));
		}
		else
		{
			long first=a.get(0);
			a.remove(0);
			return lcm(first,begin(a));
		}
	}
}
