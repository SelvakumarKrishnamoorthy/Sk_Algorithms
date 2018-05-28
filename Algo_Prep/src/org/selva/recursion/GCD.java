package org.selva.recursion;


/**
 * GCD or euclidian problem to find the common divisor between the two integers using recursive approach. 
 * The problem converges at the base condition when b=0;
 * 
 * @author selvakumar krishnamoorthy
 *
 */
public class GCD {

	public static void main(String[] args) {
		
		GCD problem = new GCD();
		System.out.println(problem.gcd(45, 10));

	}
	
	public int gcd(int a , int b) {
		// base case if 
		if(b==0) {
			return a;
		}
		// recursive call if a > b
		else if(a>b) {
			int c = a%b;
			return gcd(b , c);
		}
		// if b is greater then , swap the two integers
		else if (b>a) {
			int temp;
			temp = a;
			a= b;
			b= temp;
		}
		return 1;
		
	}

}
