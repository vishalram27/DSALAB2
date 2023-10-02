package com.greatlearning.dsa.transaction;

public class Transaction{
	
	public int targetCheck(int[] arr, int target) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
			if(sum >= target) {
				return i;
			}
		}
		return -1;
		
	}
		
}