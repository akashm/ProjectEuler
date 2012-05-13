import java.math.BigInteger;


public class Prob36 
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
		for(int i=0;i<1000000;i++)
		{
			String base10=i+"";
			String base2=Integer.toBinaryString(i);
			String rbase10=reverseMe(base10);
			String rbase2=reverseMe(base2);
			if(base10.equals(rbase10) && base2.equals(rbase2))
			{
				sum=sum.add(new BigInteger(base10));
			}
		}
		System.out.println(sum);
	}
}
