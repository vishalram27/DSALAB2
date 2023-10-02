package com.greatlearning.dsa.denomination;

public class Currency {

	public static void countCurrency(int amount, int[] notes, int size)
    {
    
        int[] noteCounter = new int[size];
        for (int i = 0; i < size; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }
        // Print notes
        System.out.println("Your payment approach in order to give min no of notes will be ");
        for (int i = 0; i < size; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                    + noteCounter[i]);
            }
        }
    }
}
