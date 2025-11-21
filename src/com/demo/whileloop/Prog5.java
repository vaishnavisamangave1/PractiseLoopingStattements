package com.demo.whileloop;
//Write a Program To print sum of 1 to 50 Odd nos.

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;int sum=0;
		while(i<=50) {
			if(i%2==1) {
				
				sum=sum+i;
			}
			i++;
		}
System.out.println(sum);
	}

}
