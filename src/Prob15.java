import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;


class Prob15 
{
	
	public static void main(String args[])
	{
		BigInteger b1=new BigInteger("815915283247897734345611269596115894272000000000");
		BigInteger b2=new BigInteger("2432902008176640000");
		BigInteger b3=new BigInteger("2432902008176640000");
		BigInteger res=b1.divide(b2);
		res=res.divide(b3);
		System.out.println(res);
	}
}
