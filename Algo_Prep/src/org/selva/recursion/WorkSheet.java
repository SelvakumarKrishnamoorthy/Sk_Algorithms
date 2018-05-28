package org.selva.recursion;

public class WorkSheet {

	public static void main(String[] args) {

		String s = "fog";
		stringReverse(s);
		
		
	}
	
	
	static void stringReverse(String s){
		if(s.length() >0) {
			stringReverse(s.substring(1));
			System.out.print(s.substring(0, 1));
		}
		
	}

}
