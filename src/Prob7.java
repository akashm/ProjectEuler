
public class Prob7 
{
	public static void main(String args[])
	{
		int count=0;
		long n=2,n2=0;
		for(n=2;count<10001;n++)
		{
			boolean flag=true;
			for(int j=2;j<n;j++)
			{
				if(n%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				++count;
				n2=n;
			}
		}
		System.out.println(n2);
	}
}
