package HackerRank;
import java.util.*;

public class LongArraySum {

    public static void main(String[] args) 
        {//start main
	Scanner input = new Scanner(System.in);
	
	long sum = 0;
	int x1 = 0;
	
	int arrayLength = input.nextInt();
	ArrayList<Long> array = new ArrayList<>(arrayLength);
	do{
			array.add(x1, input.nextLong());
			x1++;
	} while(x1 < arrayLength);
	
	for (long x : array)
		sum += x;
	
	System.out.print(sum);
	}//end main
}//end class