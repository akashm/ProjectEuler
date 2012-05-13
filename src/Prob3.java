//import java.util.*;

public class Prob3
{
	public static void main(String args[])
	{
		double num=600851475143.0;
		//double num=13195.0;
		double max=0;
		for(double i=2;i<=num;i++)
		{
			/*if(num%i==0)
			{
				boolean b=check(i);
				if(b)
				{
					if(i>max)
						max=i;
				}
			}*/
			while(num%i==0)
			{
				max=i;
				num/=i;
			}
		}
		System.out.println(max);
	}

	/*private static boolean check(double i)
	{
		int fl=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				fl=1;
				break;
			}
		}
		if(fl==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}*/
}
