package org.selva.math;

import java.util.ArrayList;
import java.util.List;

/**
 * to find the number of factors for a given number n
 * 
 * @author skrishnamoorthy44
 *
 */
public class NumberFactorization {

	public static void main(String[] args) {
		int n = 36;
		List<Integer> factors = new ArrayList<Integer>();
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				factors.add(i);
				if (i != n/i)
					factors.add(n / i);
			}
		}
		System.out.println(factors.toString());

	}

}
