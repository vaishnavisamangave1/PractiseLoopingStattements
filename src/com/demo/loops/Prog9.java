package com.demo.loops;
//Write a Program To print sum of odd and even no
public class Prog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even_sum=0;
		int odd_sum=0;
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				even_sum=even_sum+i;
			}
			else if(i%2==1) {
				odd_sum=odd_sum+i;
			}
		}
		System.out.println("EvenSum::"+even_sum);
		System.out.println("OddSum::"+odd_sum);

	}

}
