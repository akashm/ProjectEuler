
public class Prob4 
{
	public static void main(String[] args)
	{
		int res=0;
		for(int i=100;i<=999;i++)
		{
			for(int j=100;j<=999;j++)
			{
				int tot=i*j;
				//boolean fl=false;
				int rev=0,n1=tot;
				while(n1>0)
				{
					int rem=n1%10;
					rev=rev*10+rem;
					n1/=10;
				}
				if(tot==rev && tot>res)
				{
					res=tot;
				}
			/*	String str=tot+"";
				for(int k=0;k<str.length()/2;k++)
				{
					if(str.charAt(k)!=str.charAt(str.length()-k-1))
					{
						fl=true;break;
					}
				}
				if(!fl)
				{
					System.out.println(tot);
				}*/
			}
		}
		System.out.println(res);
	}
}
