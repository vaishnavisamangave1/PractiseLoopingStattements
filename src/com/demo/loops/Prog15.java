package com.demo.loops;
//Generate the Series... 1 3 6 10 15 21 28 36 45.
public class Prog15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum=i+sum;
			System.out.print(sum+" ");
		}

	}

}
