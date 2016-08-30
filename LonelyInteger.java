package HackerRank;

import java.util.Arrays;

public class LonelyInteger {
static int lonelyInteger(int[] arr) {
       
		int m = 0;
		for (int i = 0; i < arr.length; i++)
			m ^= i;
		return m;
}
}