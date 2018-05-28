package org.selva.math;

public class VerifyPrime {

	public static void main(String[] args) {
		
		int n = 5;
		
		int prime = 0 ;
		
		for(int i=2 ; i<= Math.sqrt(n);i++) {
			if(n%i == 0) {
				prime++;
			}
		}
		
		if (prime==0) {
			System.out.println("PRIME");
		}else {
			System.out.println("NOT A PRIME");
		}

	}

}
