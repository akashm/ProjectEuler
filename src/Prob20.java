import java.util.ArrayList;
import java.util.Scanner;


public class Prob20 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int tests=sc.nextInt(),i=0;
	ArrayList<Integer> pro=new ArrayList<Integer>();
	for(int j=1;j<=tests;j++)
	{
		int no=sc.nextInt();
		int no2=no-1,len=0;
		String str="";
		while(no>0)
		{
			pro.add(len++, no%10);
			no=no/10;
		}
		while(no2>0)
		{
			int temp=0,ele=0,x=0;
			for(i=0;i<len;i++)
			{
				ele=pro.get(i);
				x=(ele*no2)+temp;
				pro.set(i, x%10);
				temp=x/10;
			}	
			while(temp!=0)
			{
				pro.add(len++, temp%10);
				temp=temp/10;
			}	
			--no2;
		}
		int sum=0;
		for(i=pro.size()-1;i>=0;i--)
		{
			sum+=pro.get(i);
		}
		System.out.println(sum);
		pro.clear();
	}
	}
}
