import java.io.*;
import java.util.ArrayList;


public class Prob24 
{
	static ArrayList<String> a=new ArrayList<String>();
	public void permuteString(String beginningString, String endingString)
	{
		if (endingString.length() <= 1)
		{
			System.out.println((beginningString + endingString));
			//a.add(beginningString + endingString);
		/*	if(a.size()==1000000)
			{
				System.exit(0);
			}*/
		}
		else
		{
			for (int i = 0; i < endingString.length(); i++)
			{
				try 
				{
					String newString = endingString.substring(0, i) + endingString.substring(i + 1);
					permuteString(beginningString + endingString.charAt(i), newString);
				} 
				catch (StringIndexOutOfBoundsException exception)
				{
					exception.printStackTrace();
				}
			}
		}
	}
	public static void main(String args[]) throws Exception
	{
		new Prob24().permuteString("","0123456789");
		//System.out.println(Prob24.a.size());
	}
}
