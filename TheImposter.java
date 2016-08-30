package Play;

public class TheImposter
{
	public static void main(String[] args)
	{
		String x = "I love Computer Science!";
		char[] array1 = x.toCharArray();
		char[] array2 = new char[14];
		
		System.arraycopy(array1, 0, array2, 0, 14);
		array1[0] ^= 'a'; array1[1] |= '!'; array1[1] <<= 1; array1[2] >>= 1; array1[2] |= 9;
		array1[2] &= '5'; array1[2] |= '@'; array1[3] >>= 1; array1[3] &= 4; array1[3] |= '>';
		array1[3] &= ':'; array1[3] <<= 1; array1[4] &= '@'; array1[4] >>= 1; array1[5] ^= ',';
		array1[7] ^= '+'; array1[8] >>= 6; array1[8] |= '`'; array1[9] >>= 1; array1[9] ^= '@';
		array1[10] &= '`'; array1[10] |= '%'; array1[11] &= '@'; array1[11] >>= 1; array1[12] &= '_';
		array1[12] ^= ':'; array1[13] ^= '*'; array1[13] |= ' '; array1[14] &= '@'; array1[14] >>= 1;
		array1[15] |= '@'; array1[15] |= ')'; array1[16] ^= '7'; array1[17] |= '<'; array1[17] &= '2';
		array1[17] <<= 1; array1[17] |= '!'; array1[18] &= '!'; array1[18] |= '@'; array1[19] &= '@';
		array1[19] >>= 1; array1[20] >>= 1; array1[20] |= '@'; array1[21] &= '`'; array1[21] |= '(';
		array1[22] &= '!'; array1[22] |= '@'; array1[23] ^= 'U'; array2[0] &= '@'; array2[0] >>= 1;
		array2[1] |= '&'; array2[1] >>= 2; array2[1] |= '@'; array2[2] ^= 'K'; array2[3] &= '-';
		array2[3] |= '@'; array2[4] &= '@'; array2[4] >>= 1; array2[5] &= '$'; array2[5] |= '@';
		array2[6] <<= 1; array2[6] |= '/'; array2[7] &= ')'; array2[7] |= ')'; array2[7] |= '@';
		array2[8] &= '~'; array2[9] &= '%'; array2[9] <<= 1; array2[9] ^= '-'; array2[10] ^= '^';
		array2[11] ^= '['; array2[12] ^= 'Z'; array2[13] ^= 'L';
		System.out.print(array1);
		System.out.print(array2);
	}
}