package com.demo.loops;
//Write a Program To print sum of 1 to 50 Odd nos
public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=50;i++) {
			if(i%2==1) {
				sum=sum+i;
			}
		}
		System.out.println("sum of odd number 1 to 50"+sum);

	}

}
