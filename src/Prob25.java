import java.math.BigInteger;


public class Prob25 
{
	public static void main(String args[])
	{
		BigInteger first=new BigInteger("1");
		BigInteger second=new BigInteger("1");
		BigInteger third=new BigInteger("0");
		int i=3;
		while((third=first.add(second)).toString().length()!=1000)
		{
		++i;
			first=second;
			second=third;
		}
		System.out.println(i);
	}
}
