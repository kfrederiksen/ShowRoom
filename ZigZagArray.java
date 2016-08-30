package HackerRank;
import java.util.Arrays;

public class ZigZagArray {
static int[] wiggleArrangeArray(int[] intArr) {
		
		Arrays.sort(intArr);
		String sArray2 = Arrays.toString(intArr);
		System.out.println("Sorted array: " + sArray2);
		int max = intArr.length-1;
		System.out.println("Maximum value: " + max);
		int min = 0;
		System.out.println("Minimum value: " + min);
		int[] iAZigZag = new int[intArr.length];
		
		for (int i = 0; i <= iAZigZag.length-1; i++)
		{//start for
			if (max != min || max - min != 1)
			{if (i == 0 || i % 2 == 0)
				{iAZigZag[i] = intArr[max];
				String sArray3 = Arrays.toString(iAZigZag);
				System.out.println("Array thus far: " + sArray3);
				max--;}
			else
			{iAZigZag[i] = intArr[min];
			String sArray4 = Arrays.toString(iAZigZag);
			System.out.println("Array thus far: " + sArray4);
			min++;}}
		}//end for
		
		return iAZigZag;
	}
	public static void main(String[] args)
	{//start main
		int[] array = { 5, 2, 7, -2, 25, 25 };
		
		String sArray = Arrays.toString(wiggleArrangeArray(array));
		System.out.println(sArray);
	}//end main
}
