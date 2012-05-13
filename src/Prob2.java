//import java.util.*;

public class Prob2 
{
	public static void main(String args[])
	{
		int first=0;
		int second=1;
		int third=0,sum=0;
		while((third=first+second)<=4000000)
		{
			if(third%2==0)
			{
				sum+=third;
			}
			first=second;
			second=third;
		}
		System.out.println(sum);
	}
}
