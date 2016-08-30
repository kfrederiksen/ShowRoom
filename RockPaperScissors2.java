package Play;
import java.util.*;

public class RockPaperScissors2 
{//start class
	private static boolean x;
	public static void main(String[] args)
	{//start main
		Scanner input = new Scanner(System.in);
		Random compNumber = new Random();
		
		ArrayList<String> alsUChoice = new ArrayList<String>();
		alsUChoice.add("Rock");
		alsUChoice.add("Paper");
		alsUChoice.add("Scissors");
		
		do
		{//start dowhile
		System.out.print("\nRock, Paper, Scissors, SHOOT! ");
		String sUChoice = input.next();
		int y = 1 + compNumber.nextInt(3);
		if (!alsUChoice.contains(sUChoice))
		System.out.print("\nQuitters never win!");
		else{//start else
		int iConvert = 1 + alsUChoice.indexOf(sUChoice);
		if (iConvert == y)
		{//start if1
			System.out.printf("%s/%s. Try Again!\n", sUChoice, sUChoice);
		}//end if1
		else if (iConvert == 1)
		{//start ifrock
			if (y == 2)
				System.out.print("\nPaper beats Rock. You lose!");
			else if (y == 3)
			System.out.print("\nRock beats Scissors. You win!");
		}//end ifrock
		else if (iConvert == 2)
		{//start ifpaper
			if (y == 1)
			System.out.print("\nPaper beats Rock. You win!");
			else if (y == 3)
			System.out.print("\nScissors beats Paper. You lose!");
		}//end ifpaper
		else if (iConvert == 3)
		{//start ifscissors
			if (y == 1)
			System.out.print("\nRock beats Scissors. You lose!");
			else if (y == 2)
			System.out.print("\nScissors beats Paper. You win!");
		}//end ifscissors
		}//end else
		System.out.print("\nContinue? (0 = No)");
		String n = input.next();
		if (n.equals("0"))
			System.out.print("\nThanks for playing!");
			x = true;
		} while (x == false);//end do while		
	}//end main
}//end class