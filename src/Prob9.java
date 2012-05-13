
public class Prob9
{
	public static void main(String args[])
	{
		int a=0,b=0,c=0;
		boolean flag=true;
		for(c=2;flag;c++)
		{
			for(b=1;b<c && flag;b++)
			{
				for(a=0;a<b && flag;a++)
				{
					long n1=a*a;
					long n2=b*b;
					long n3=c*c;
					long n4=n1+n2;
					if(n3==n4)
					{
						if((a+b+c)==1000)
						{
							b=b-1;
							c=c-1;
							flag=false;
							break;
						}
					}
				}
			}
		}
		System.out.println(a*b*c);
	}
}
