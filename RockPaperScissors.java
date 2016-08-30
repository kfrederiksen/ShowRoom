package Play;
import java.util.*;

public class RockPaperScissors 
{//start class
	public static void main(String[] args)
	{//start main
		Scanner input = new Scanner(System.in);
		Random randomNumbers = new Random();
		int x = 0;
		
		do
		{//start dowhile1
			while (x == 0)
			{//start while2
			System.out.print("Rock, Paper, Scissors, SHOOT! ");
			String sinput = input.next();
			int icompShoot = 1 + randomNumbers.nextInt(3);		
			switch(sinput)
			{//start mainswitch
			case "Rock":
			{//start rock switch
				switch(icompShoot)
				{
				case 1:
					System.out.print("Rock/Rock, Try Again!");
					break;
				case 2:
					System.out.print("Rock/Paper, You lose!");
					break;
				default:
					System.out.print("Rock/Scissors, You win!");
				}
			}//end rock switch
			break;
			case "Paper":
			{//start paper switch
				switch(icompShoot)
				{
				case 1:
					System.out.print("Paper/Rock, You win!");
					break;
				case 2:
					System.out.print("Paper/Paper, Try Again!");
					break;
				default:
					System.out.print("Paper/Scissors, You lose!");
				}
			}//end paper switch
			break;
			case "Scissors":
			{//start scissors switch
				switch(icompShoot)
				{
				case 1:
					System.out.print("Scissors/Rock, You lose!");
					break;
				case 2:
					System.out.print("Scissors/Paper, You win!");
					break;
				default:
					System.out.print("Scissors/Scissors, Try again!");
				}
			}//end scissors switch
			break;
			default:
				System.out.print("Quitters never win!");
			}//end mainswitch
			System.out.print("\nContinue? (0 = No)");
			String n = input.next();
			if (n.equals("0"))
				x = 0;
			}//end while2
		} while (x == 1);//end dowhile1
		
	}//end main
}//end class