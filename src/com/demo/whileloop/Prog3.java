package com.demo.whileloop;
//3) Write a Program To print 1 to 100 Odd nos.

public class Prog3 {

	public static void main(String[] args) {
		int i=1;int count=0;
		while(i<=100) {
			if(i%2==1) {
				System.out.println(i);
				count++;
			}
			i++;
			//count++;
			
		}
System.out.println("count::"+count);
	}
	//System.out.println("count::"+count);
}
