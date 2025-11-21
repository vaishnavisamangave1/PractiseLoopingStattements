package com.demo.whileloop;
//Write a Program To print sum of 1 to 50 EVEN nos.
public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;int sum=0;
		
		while(i<=50) {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);

	}

}
