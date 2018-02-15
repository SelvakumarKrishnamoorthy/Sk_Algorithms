package org.selva.brute;

/**
 * Maximum difference of zeros and ones in binary string | Set 2 (O(n) time) 3
 * Given a binary string of 0s and 1s. The task is to find the length of
 * substring which is having a maximum difference of number of 0s and number of
 * 1s (number of 0s – number of 1s). In case of all 1s print -1.
 * 
 * @author skrishnamoorthy44
 *
 */

public class MaxDiffOfBinaryString {

	public static void main(String[] args) {
		String s = "11000010001";
		MaxDiffOfBinaryString problem = new MaxDiffOfBinaryString();
		System.out.println(problem.diffCalculator(s));

	}

	private int diffCalculator(String binString) {

		int curSum = 0, maxsum = 0;
		for (int i = 0; i < binString.length(); i++) {
			curSum += binString.charAt(i) == '1' ? -1 : 1;
			if (curSum < 0)
				curSum = 0;
			maxsum = Math.max(curSum, maxsum);
		}
		return maxsum == 0 ? -1 : maxsum;
	}

}
