package com.demo.whileloop;
// Write a Program To print 1 to 100 even nos.
public class Prog4 {

	public static void main(String[] args) {
	int i=2;int count=0;
	while(i<=100) {
		if(i%2==0) {
			System.out.println(i);
			i+=2;
			count++;
		}
		
		
	}
     System.out.println("count"+count);
	}

}
