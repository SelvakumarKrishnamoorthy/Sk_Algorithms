package org.selva.search;

public class BinarySearchOccurences {

	int mid = 0, startIndex = 0, endIndex = 0;

	public static void main(String[] args) {
		BinarySearchOccurences problem = new BinarySearchOccurences();
		// int[] a = { 1, 2, 3, 4, 5, 10, 10, 10, 10, 10, 11, 13, 15, 17, 18 };
		int[] a = {1};
		int first = binarySearchFirstOccurence(a, a.length, 1);
		int last = binarySearchLastOccurence(a, a.length, 1);

		
			System.out.println((last - first) + 1);

	}

	/**
	 * to find first occurence
	 * 
	 * @param a
	 * @param n
	 * @param s
	 * @return
	 */
	private static int binarySearchFirstOccurence(int[] a, int n, int s) {
		int low = 0;
		int high = n - 1;
		int mid;
		int result = -1;

		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid] == s) {
				result = mid;
				high = mid - 1;
			} else if (a[mid] > s) {
				high = mid - 1;
			} else if (a[mid] < s) {
				low = mid + 1;
			}
		}
		return result;
	}

	private static int binarySearchLastOccurence(int[] a, int n, int s) {
		int low = 0;
		int high = n - 1;
		int mid;
		int result = -1;

		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid] == s) {
				result = mid;
				low = mid + 1;
			} else if (a[mid] > s) {
				high = mid - 1;
			} else if (a[mid] < s) {
				low = mid + 1;
			}
		}
		return result;
	}

}
