package org.selva.transferwise;

public class Solution {

	public static void main(String[] args) {
//		romanConverter(11);
		
		System.out.println(args.toString());
	}

	private static void romanConverter(int[] numbers) {
		String[] result = new String[numbers.length];
		for (int i = 0 ; i<numbers.length ; i++) {
			int count;
			StringBuilder out = new StringBuilder();
			String[] romanNumerals = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM",
					"M" };
			int[] intNumerals = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
			for (int j = intNumerals.length - 1; j >= 0; j--) {
				count = numbers[i] / intNumerals[j];
				numbers[i] = numbers[i] % intNumerals[j];
				while (count > 0) {
					out.append(romanNumerals[j]);
					count--;
				}
			}
			result[i] = out.toString();
		}
	}
	
	

	//linkedlist redundancy
	private LinkedListNode deleteDups(LinkedListNode head) {
		if(head == null)
		    return head;

		LinkedListNode current = head;       
		while(current!=null){
		    LinkedListNode second = current;
		    while(second.next!=null){
		        if(second.next.val == current.val)
		        	second.next = second.next.next;
		        else
		        	second = second.next;
		    }
		    current = current.next;
		}
		return head;
	}
	
	class LinkedListNode {
        int val;
        LinkedListNode next;
    };
    
    /**
     * Find if the binary search tree follows preorder traversal
     */

}
