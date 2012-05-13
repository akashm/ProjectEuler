import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;


class Prob18 
{
	static int sum(int[][] a,int row,int col)
	{
		if(row==a.length)
		{
			return 0;
		}
		int c=a[row][col]+sum(a,row+1,col);
		int d=a[row][col]+sum(a,row+1,col+1);
		int e=(int)Math.max(c, d);
		return e;
	}
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		int tests=Integer.parseInt(br.readLine());
		int i,j,k;
		int input[][];
		for(i=0;i<tests;i++)
		{
			int lines=Integer.parseInt(br.readLine());
			input=new int[lines][];
			for(j=0;j<lines;j++)
			{
				String t[]=br.readLine().split("\\s+");
				input[j]=new int[t.length];
				for(k=0;k<t.length;k++)
				{
					input[j][k]=Integer.parseInt(t[k]);
				}
			}
			int m=sum(input,0,0);
			out.println(m);
			out.flush();
			input=null;
		}
	}
}
