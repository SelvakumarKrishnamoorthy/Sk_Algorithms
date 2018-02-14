package org.selva.recursion;

public class GCD {

	public static void main(String[] args) {
		
		GCD problem = new GCD();
		System.out.println(problem.gcd(45, 10));

	}
	
	public int gcd(int a , int b) {
		
		if(b==0) {
			return a;
		}else if(a>b) {
			int c = a%b;
			return gcd(b , c);
		}
		return 1;
		
	}

}
