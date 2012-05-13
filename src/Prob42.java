import java.io.*;
import java.util.ArrayList;

public class Prob42
{
	public static void main(String args[]) throws IOException
	{
		ArrayList<Integer> tn=new ArrayList<Integer>();
		for(int i=1;i<=500;i++)
		{
			int sum=((i)*(i+1))/2;
			tn.add(sum);
		}
		BufferedReader in=new BufferedReader(new FileReader(new File("words.txt")));
		String words[]=in.readLine().split(",");
		int count=0;
		for(int i=0;i<words.length;i++)
		{
			int pos=words[i].lastIndexOf("\"");
			String str=words[i].substring(1,pos);
			int sum=0;
			for(int j=0;j<str.length();j++)
			{
				sum+=((int)str.charAt(j))-65+1;
			}
			if(tn.indexOf(sum)!=-1)
				++count;
		}
		System.out.println(count);
	}
}
