package com.demo.loops;
//Write a Program To print sum of 1 to 50 EVEN nos
public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even_sum=0;
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				even_sum=even_sum+i;
			}
		}
		System.out.println("Even Number sum between 1 to 50::"+even_sum);

	}

}
