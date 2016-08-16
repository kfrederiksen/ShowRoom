package HackerRank;
import java.util.*;
import java.io.*;

public class JavaLoopsII {
	public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int x = 0;
        for(int i = 0; i < t; i++){//start for1
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        x += a;        
        for(int j = 0; j < n; j++)
            {//start for2
            x += b *(int)(Math.pow(2, j));
            System.out.print(x+" ");
        }//end for2
        x = 0;
        System.out.println();
    }//end for1
}
}
