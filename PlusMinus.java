package HackerRank;
import java.util.*;
import java.math.*;

public class PlusMinus {
	  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner input = new Scanner (System.in);
	        
	        int x = 0;
	        int posSum = 0;
	        int negSum = 0;
	        int zeroSum = 0;
	        double pos = 0;
	        double neg = 0;
	        double zero = 0;
	        
	        int arrayLength = input.nextInt();
	        do{//start do
	        	int c = input.nextInt();
	        	if (c == 0)
	        		zeroSum++;
	        	else if(c < 0)
	        		negSum++;
	        	else if (c > 0)
	        		posSum++;
	        	x++;
	        } while (x < arrayLength);//end do
	        
	        pos += (double) posSum / arrayLength;
	        neg += (double) negSum / arrayLength;
	        zero += (double) zeroSum / arrayLength;
	        
	        System.out.printf("%d%n%d%n%d%n", pos, neg, zero);
	}
	}//end class
