package com.demo.dowhileloop;
//Write a Program To print 1 to 100 Odd nos.
public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do {
			if(i%2==1) {
				System.out.println(i);
				
			}
			i++;
			
		}
		while(i<=100);

	}

}
