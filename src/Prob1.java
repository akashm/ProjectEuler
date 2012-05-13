import java.util.*;

public class Prob1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter max limit");
		int lim=sc.nextInt();
		int sum=0;
		for(int i=1;i<lim;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
