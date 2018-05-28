package org.selva.brute;

public class Solution {

	public static void main(String[] args) {

		
		    
		
	}
	
	public int solution(int K, int L, int M, int N, int P, int Q, int R, int S) {
		
		int rectangle1Length = M-K;
		int rectangle1Breadth = N-L;
		
		int rectangle2Length = R-P;
		int rectangle2Breadth = S-Q;
		
		if(K==P && L==Q && M==R && S==N ) {
			return rectangle1Breadth*rectangle1Length;
		} 
		
		if(K>P && L>Q && M>R && N>S) {
			return rectangle1Breadth*rectangle1Length;
		}
		if(P>K && Q>L && R>M && S>N) {
			return rectangle2Breadth*rectangle2Length;
		}
		
		return S;
    }

}
