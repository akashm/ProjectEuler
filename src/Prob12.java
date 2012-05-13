
public class Prob12 
{
	public static int nod(int n)
	{
		int no=0;
	    int sqrt=(int) Math.sqrt(n);
	 
	    for(int i=1;i<=sqrt;i++)
	    {
	        if(n%i==0)
	        {
	            no+=2;
	        }
	    }
	    if(sqrt*sqrt==n)
	    {
	        no--;
	    }
	 
	    return no;
	}
	public static void main(String args[])
	{
		int number=0,i=1;
		while(nod(number)<500)
		{
			number+=i;
			i++;
		}
		System.out.println(number);
	}
}
