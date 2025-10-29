package com.demo.loops;
//Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10.
public class Prog13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.print(-i+" ");
			}
			else if(i%2==1) {
				System.out.print(i+" ");
			}
		}

	}

}
