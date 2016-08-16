package HackerRank;
import java.util.*;
import java.math.*;
import java.lang.*;

public class DiagonalArraySum 
{//start class
	public static void main(String[] args)
{//start main
	Scanner input = new Scanner(System.in);
	
	int sum = 0;
	int a = 0;
	int b = 0;
	int length = input.nextInt();
	
	for (int i = 0; i < length; i++)
	{//start for1
		for (int x = 0; x < length; x++)
		{//start for2
			int c = input.nextInt();
			if (x == i)
				a += c;
			if (x + i == length - 1)
				b += c;
		}//end for2
	}//end for1
		
	sum += (a - b);
	
	System.out.print(Math.abs(sum));
	}//end main
}//end class