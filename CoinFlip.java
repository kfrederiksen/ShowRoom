package Play;
import java.util.*;

public class CoinFlip 
{//start class
	public static void main(String[] args)
	{//start main
		Scanner in = new Scanner(System.in);
		Random randomNumber = new Random();
		int iHeads = 0;
		int iTails = 0;
		System.out.println("How many times to flip?");
		int iTimesToFlip = in.nextInt();
		System.out.println();
		String[] sAOutcome = new String[iTimesToFlip];
		int iX = 0;
		
		while (iX < iTimesToFlip)
		{//start while
			int coin = 1 + randomNumber.nextInt(2);
			if (coin == 1)
				{iHeads ++;
				sAOutcome[iX] = "H";}
			else
			{iTails++;
			sAOutcome[iX] = "T";}
			iX++;
		}//end while
			
		System.out.print("Outcomes: ");
		if(iTimesToFlip <= 10)
		{//start if
		for (int x = 0; x < iTimesToFlip; x++)
			System.out.printf("%s ", sAOutcome[x]);
		}//end if
		else
		{//start else
			for(int y = 0; y < iTimesToFlip; y++)
				{if (y % 10 == 0)
					System.out.printf("%n%s ", sAOutcome[y]);
				else
					System.out.printf("%s ", sAOutcome[y]);
				}	
		}//end else
		
		System.out.printf("%nNumber of Heads: %d%nNumber of Tails: %d", iHeads, iTails);
	}//end main
}//end class