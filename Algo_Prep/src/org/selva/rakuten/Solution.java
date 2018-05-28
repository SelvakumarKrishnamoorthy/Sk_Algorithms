package org.selva.rakuten;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		 
         int N = 121;
         System.out.println(solution(N));
	}
	
	
	public static int solution(int N){
		String s_num = Integer.toString(N);
        int n = s_num.length();
        int all_permu = fact(n);
        Map<Integer,Integer> lookupMap = new HashMap<Integer,Integer>();
        
        if(N==0) {
        	return 1;
        }
        
        
        for(int i=0;i<10;i++) {
        	lookupMap.put(i, 0);
        }
        
        for(int i=0;i<n;i++){
               lookupMap.put(Integer.valueOf(String.valueOf(s_num.charAt(i))) , lookupMap.get(Integer.valueOf(String.valueOf(s_num.charAt(i))))+1);
        }
        for(int j=0;j<lookupMap.size();j++){
        	all_permu=all_permu/fact(lookupMap.get(j));
        }
        return all_permu-lookupMap.get(0);
}

	private  static int fact(int n) {
		int out;
		if (n == 0 || n == 1)
			return 1;
		out = fact(n - 1) * n;
		return out;
	}

}
