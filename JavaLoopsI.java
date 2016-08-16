package HackerRank;
import java.util.*;

public class JavaLoopsI {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for (int i = 1; i < 11; i++)
            System.out.printf("%n%d x %d = %d", n, i, n*i);
    }
}