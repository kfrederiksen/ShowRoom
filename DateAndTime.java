package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.LocalDate;

public class DateAndTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        
        LocalDate dt = LocalDate.of(month, day, year);
        System.out.print(dt.getDayOfWeek());
    }
}
