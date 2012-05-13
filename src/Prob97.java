import java.math.BigInteger;


public class Prob97 
{
	public static void main(String args[])
	{
		BigInteger part1=new BigInteger("28433");
		BigInteger part2=new BigInteger("2");
		BigInteger sum=BigInteger.ONE;
		for(int i=1;i<=7830457;i++)
		{
			String s=sum.toString();
			int len=s.length();
			if(len>=10)
			{
				String t=s.substring(len-10,len);
				sum=new BigInteger(t);
			}
			sum=sum.multiply(part2);
		}
		//System.out.println(sum.toString());
		part1=part1.multiply(sum);
		part1.add(BigInteger.ONE);
		System.out.println(part1.toString());
	}
}
