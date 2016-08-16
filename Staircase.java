package HackerRank;
import java.util.*;

public class Staircase {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for (int i = n; i > 0; i--)
		{//start for1
			int c = 0;
			if (i != 1)
			{//start if
				do {//start do
				System.out.print(" ");
				c++;
			} while (c < i - 1);//end do
			}//end if
				for (int x = n - (n - i + 1); x < n; x++)
					System.out.print("#");
			System.out.print("\n");
		}//end for2
	}//end main
}//end class