package org.selva.search;

public class BinarySearch {

	int mid = 0, startIndex = 0, endIndex = 0;

	public static void main(String[] args) {
		BinarySearch problem = new BinarySearch();
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 18 };
		System.out.println(problem.binarySearch(a, a.length, 12));

	}

	private String binarySearch(int[] a, int n, int x) {
		endIndex = n - 1;
		while (startIndex <= endIndex) {
			mid = (startIndex + endIndex) / 2;
			if (a[mid] == x)
				return x + " found in array at " + a[mid];
			else if (x > a[mid])
				startIndex = mid + 1;
			else if (x < a[mid])
				endIndex = mid - 1;
		}
		return "not found";
	}
}
