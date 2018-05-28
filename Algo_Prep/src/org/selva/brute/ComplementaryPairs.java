package org.selva.brute;

import java.util.Arrays;

public class ComplementaryPairs {

	public static void main(String[] args) {
		System.out.println(noOfComplementaryPairs(new int[]{1,8,-3,0,1,3,-2,4,5}, 6));

	}
	
	public static int noOfComplementaryPairs(int arr[],int k){
        int result = 0;
        
        Arrays.sort(arr);
        
        int i=0 ; int j=arr.length-1;
        int compPairs = 0;
        
        
        while(i<j) {
        	int sum = arr[i]+arr[j];
        	
        	if(arr[i]==k/2 || arr[j]==k/2) {
        		compPairs+=1;
        	}
        	
        	if(sum==k) {
        		compPairs++;
        		i++;
        		j--;
        	}else if(sum<k) {
        		i++;
        	}else {
        		j--;
        	}
        	
        }
        
        return compPairs*2;
         
    }

}
