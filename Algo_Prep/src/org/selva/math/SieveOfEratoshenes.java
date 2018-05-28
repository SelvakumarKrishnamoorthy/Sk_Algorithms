package org.selva.math;

import java.util.Arrays;

public class SieveOfEratoshenes {

	public static void main(String[] args) {
		
		int N=1000;
		int[] primeArr= new int[N+1];
		for (int i=0;i<=N;i++) {
			primeArr[i]=1;
		}
		
		primeArr[0]=0;
		primeArr[1]=0;
		
		for(int i=2;i<=Math.sqrt(N);i++) {
			
			for(int j=2;j*i<=N;j++) {
				primeArr[j*i]=0;
			}
		}
		
		System.out.println(Arrays.toString(primeArr));
	}

}
