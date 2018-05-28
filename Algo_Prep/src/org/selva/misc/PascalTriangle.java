package org.selva.misc;

public class PascalTriangle {

	public static void main(String[] args) {
		int numRows=3;
		problemStatement(numRows);
	}
	
	private static int problemStatement(int rows) {
		
		int[] currentRow = {1};
		int[] previousRow ;
		
		for(int i=2;i<=rows;i++) {
			previousRow = currentRow;
			currentRow = new int[i];
			currentRow[0]=1;
			currentRow[i-1]=1;
			
		}
		
		return 0;
		
	}

}
