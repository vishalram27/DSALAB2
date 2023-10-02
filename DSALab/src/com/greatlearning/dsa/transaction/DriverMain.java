package com.greatlearning.dsa.transaction;

import java.util.Scanner;

public class DriverMain {
	
public static void main(String args[]) {
	
	Transaction transaction = new Transaction();
	Scanner s = new Scanner(System.in);
	System.out.println("enter the size of transaction array");
	int size = s.nextInt();
	int arr[] = new int[size];
	System.out.println("enter the values of array");
	for (int i = 0; i < size; i++)
	arr[i] = s.nextInt();
	System.out.println("enter the total no of targets that needs to be achieved");
	int targetNo = s.nextInt();
	for(int i = 0; i<targetNo; i++) {
	System.out.println("enter the value of target");
	int target = s.nextInt();
	int res = transaction.targetCheck(arr, target);
	if(res >= 0) {
		System.out.println("Target can be acheived after "+ (int)(res+1) +" transaction");
	}else {System.out.println("Target cannot be acheived with given transactions");
	
}
}
	s.close();
}
}