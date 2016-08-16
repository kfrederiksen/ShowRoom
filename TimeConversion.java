package HackerRank;
import java.util.*;
import java.io.*;

public class TimeConversion {
	public static void main(String[] args)
	{//start main
		Scanner input = new Scanner(System.in);
		
		String time = (input.next());
		
		if(time.contains("PM"))
		{//start if
			StringBuilder sb = new StringBuilder(time);
			String shour = sb.substring(0, 2);
			int ihour = Integer.parseInt(shour);
			if (ihour < 12)
				ihour += 12;
			shour = Integer.toString(ihour);
			sb.replace(0, 2, shour);
			sb.delete(8, 10);
			
			System.out.print(sb);
		}//end if
		else if(time.contains("AM"))
		{//start elseif
			StringBuilder sb = new StringBuilder(time);
			String shour = sb.substring(0, 2);
			int ihour = Integer.parseInt(shour);
			if (ihour == 12){
				ihour -=12;
				shour = Integer.toString(ihour);
				sb.replace(0, 2, shour + "0");
				sb.delete(8, 10);
				System.out.print(sb);}
			else {
				shour = Integer.toString(ihour);
				sb.replace(0, 2, "0" + shour);
				sb.delete(8, 10);
				System.out.print(sb);
			}
		}//end elseif
	}//end main
	}