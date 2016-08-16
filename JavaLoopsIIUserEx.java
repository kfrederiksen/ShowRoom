package HackerRank;
import java.util.*;

public class JavaLoopsIIUserEx {
	public static void main(String[] args) {
	    int x=0;
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i=0;i<t;i++){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int n = sc.nextInt();
	    x=x+a;    
	    for(int j=0;j<n;j++){
	        x = x+(int)(Math.pow(2,j))*b;
	        System.out.print(x+" ");
	    }
	        x=0;
	        System.out.println();
	    }
	    }}