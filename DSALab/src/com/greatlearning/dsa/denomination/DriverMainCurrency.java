package com.greatlearning.dsa.denomination;

import java.util.Arrays;
import java.util.Scanner;

public class DriverMainCurrency {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Currency denominations");
		int size = sc.nextInt();
		int notes[] = new int[size];
		System.out.println("Enter the Currency denominations value");
		for (int i = 0; i < size; i++)
		notes[i] = sc.nextInt();
		Arrays.sort(notes);
		Sort.reverse(notes);
        System.out.println(Arrays.toString(notes));
		System.out.println("Enter the Amount you want to pay");
        int amount = sc.nextInt();
        Currency.countCurrency(amount, notes, size);
        sc.close();
    }
}
