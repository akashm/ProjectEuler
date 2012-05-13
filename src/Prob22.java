import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class Prob22 
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader in=new BufferedReader(new FileReader("names.txt"));
		BigInteger b=new BigInteger("0");
		String name[]=in.readLine().split(",");
		Arrays.sort(name);
		ArrayList<String> names=new ArrayList<String>();
		for(int i=0;i<name.length;i++)
		{
			String s=name[i];
			int pos=s.lastIndexOf("\"");
			s=s.substring(1,pos);
			name[i]=s;
			names.add(s);
		}
		for(int i=0;i<name.length;i++)
		{
			String s=name[i];
			int pos=names.indexOf(s)+1;
			int sum=0;
			for(int j=0;j<s.length();j++)
			{
				int ascii=s.charAt(j);
				ascii-=64;
				sum+=ascii;
			}
			long b1=sum*pos;
			b=b.add(new BigInteger(b1+""));
		}
		System.out.println(b);
	}
}
