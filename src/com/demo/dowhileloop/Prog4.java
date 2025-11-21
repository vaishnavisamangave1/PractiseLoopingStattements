package com.demo.dowhileloop;
//Write a Program To print 1 to 100 even nos.
public class Prog4 {

	public static void main(String[] args) {
		int i = 1;  // Start from 1

        do {
            if (i % 2 == 0) {      // Check if number is even
                System.out.println(i);
            }
            i++;                   // Increment i
        } while (i <= 100);
	}

}
