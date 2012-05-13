import java.util.LinkedList;


class Prob14 
{
	public static void main(String args[])
	{
		int chain=0;
		int num=0;
		LinkedList<Long> l=new LinkedList<Long>();
		for(int i=13;i<=1000000;i++)
		{
			long n=i;
			while(n!=1)
			{
				if(n%2==0)
				{
					n=n/2;
					l.add(n);
				}
				else
				{
					n=3*n+1;
					l.add(n);
				}
			}
			if(l.size()>chain)
			{
				chain=l.size();
				num=i;
			}
			l.clear();
		}
		System.out.println(num);
	}
}
