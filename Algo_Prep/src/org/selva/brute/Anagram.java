package org.selva.brute;

public class Anagram {

	public static void main(String[] args) {

		int[] count = new int[26];
		char[] str1 = "tea".toCharArray();
		char[] str2 = "toe".toCharArray();
		int occurences = 0;

		if (str1.length == str2.length) {
			for (int i = 0; i < str1.length; i++) {
				count[(int) str1[i] - 96]++;
				count[(int) str2[i] - 96]--;
			}
		} else {
			occurences = -1;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] == 1) {
				occurences++;
			}
		}
		if (occurences == -1) {
			System.out.println("str1 and st2 is not an anagram");
		}else {
			System.out.println("str1 and st2 is not an anagram but we can modify a minimum of "+(occurences) +" character in either string to make them anagrams.");
		}
	}

}
