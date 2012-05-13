import java.math.BigInteger;


public class Prob16 
{
	public static void main(String args[])
	{
		BigInteger b=new BigInteger("2");
		b=b.pow(1000);
		String s=b.toString();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			sum+=Integer.parseInt(s.charAt(i)+"");
		}
		System.out.println(sum);
	}
}
