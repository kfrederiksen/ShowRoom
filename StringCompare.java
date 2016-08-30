package HackerRank;
import java.util.*;

public class StringCompare 
{//start class
	public static void main(String[] args) 
	{//start main
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String sString = in.next();
        int k = in.nextInt();
        ArrayList<String> aLString = new ArrayList<String>();
        
        for(int i = 0; i < sString.length()-k+1; i++)
        {//start for
        	aLString.add(sString.substring(i, k+i));
        }//end for
        
        Collections.sort(aLString);
        for(int x = aLString.size() - 1; x > 0; x--)
        	System.out.println(aLString.get(x));
    }//end main
}//end class