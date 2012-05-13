import java.math.BigInteger;


public class Prob48 
{
	static String reverseMe(String s) 
	{
	    StringBuilder sb = new StringBuilder();
	    for (int i = s.length() - 1; i >= 0; --i)
	        sb.append(s.charAt(i));
	    return sb.toString();
	}
	public static void main(String args[])
	{
		BigInteger sum=new BigInteger("0");
		for(int i=1;i<=1000;i++)
		{
			BigInteger base=new BigInteger(i+"");
			int exp=i;
			sum=sum.add(base.pow(i));
		}
		String s=reverseMe(sum.toString());
		s=s.substring(0,10);
		s=reverseMe(s);
		System.out.println(s);
	}
}
