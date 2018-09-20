package org.selva.dp;

public class ChessPawn {

	public static void main(String[] args) {
		System.out.println(validPaths(4,2));
		
	}

	private static int validPaths(int rows, int cols) {

		if (rows == 0 || cols == 0)
			return 1;
		else {
			return validPaths(rows-1,cols)+validPaths(rows,cols-1);
		}
	}

}
