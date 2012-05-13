import java.math.BigInteger;


public class CountLet
{
	public static void main(String args[])
	{
		String units[]={"one","two","three","four","five","six","seven","eight","nine"};
		String tens[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String hundred="hundred";
		String thousand="thousand";
		BigInteger b=new BigInteger("0");
		for(int i=1;i<=1000;i++)
		{
			String word="";
			int unit=(i%10)/((int)Math.pow(10, 0));
			int ten=(i%100)/((int)Math.pow(10, 1));
			int hund=(i%1000)/((int)Math.pow(10, 2));
			int thous=(i%10000)/((int)Math.pow(10, 3));
			if(thous>0)
			{
				word+=units[thous-1]+thousand;
			}
			if(hund>0)
			{
				word+=units[hund-1]+hundred;
			}
			if((hund>0 && unit!=0) || (hund>0 && ten!=0))
			{
				word+="and";
			}
			if(ten>0)
			{
				switch(ten)
				{
					case 1:
						word+=tens[unit];
					break;
					
					case 2:
						word+="twenty";
						if(unit>0)
							word+=units[unit-1];
					break;
					
					case 3:
						word+="thirty";
						if(unit>0)
							word+=units[unit-1];
					break;
					
					case 4:
						word+="forty";
						if(unit>0)
							word+=units[unit-1];
					break;
					
					case 5:
						word+="fifty";
						if(unit>0)
							word+=units[unit-1];
					break;
					
					case 6:
						word+="sixty";
						if(unit>0)
							word+=units[unit-1];
					break;
					
					case 7:
						word+="seventy";
						if(unit>0)
							word+=units[unit-1];
					break;
					
					case 8:
						word+="eighty";
						if(unit>0)
							word+=units[unit-1];
					break;
					
					case 9:
						word+="ninety";
						if(unit>0)
							word+=units[unit-1];
					break;
				}
			}
			if(ten==0 & unit!=0)
			{
				word+=units[unit-1];
			}
			System.out.println(word);
			b=b.add(new BigInteger(word.length()+""));
		}
		System.out.println(b);
	}
}