package com.demo.loops;
//Generate the Series... 0 1 1 2 3 5 8 13 21.
public class Prog16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0;
		int n2=1;
		int n3=0;
		for(int i=0;i<10;i++) {
			n3=n1+n2;
			System.out.print(n3 + " ");
			n1=n2;
			n2=n3;
		}

	}

}
