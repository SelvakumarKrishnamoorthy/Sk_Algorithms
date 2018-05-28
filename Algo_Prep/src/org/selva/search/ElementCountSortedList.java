package org.selva.search;

public class ElementCountSortedList {

	int sI = 0, eI = 0, mid = 0, count = -1;

	public static void main(String[] args) {

		int[] sortedArray = { 2, 2, 2, 4, 4, 5, 6, 7, 7, 7, 8, 8, 8, 8, 8, 9 };
		ElementCountSortedList problem = new ElementCountSortedList();
		int result = problem.searchElement(sortedArray, 8, sortedArray.length, true);

	}

	private int searchElement(int[] a, int x, int n, boolean turnLeft) {
		eI = n - 1;
		mid = (sI + eI) / 2;
		while (eI <= sI) {
			if (x == a[mid]) {
				count = mid;
				if (turnLeft)
					eI = mid - 1;
				else
					sI = mid + 1;
			} else if (x < a[mid])
				eI = mid - 1;
			else if (x > a[mid])
				sI = mid + 1;
		}
		return count;
	}

}
