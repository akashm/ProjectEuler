import java.util.BitSet;


public class Prob10 
{
	public static void main(String args[])
	{
		//int sum=0;
		BitSet p=new BitSet(2000000);
		p.flip(2,2000000);
		for(int i=2 ;i<2000000;i++)
		{
			if(!p.get(i))
				continue;
			else  
			      for(int j = 2*i; j < 2000000; j += i) 
			         p.set(j,false);
		}
		long sum=0;
		 for(int i = 2; i < 2000000; ++i) 
			    if( p.get(i) ) 
			      sum += i; 
		System.out.println(sum);
	}
}
