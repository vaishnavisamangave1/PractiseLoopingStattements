package com.demo.dowhileloop;
// Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10.
public class Prog15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		do {
		if(i%2==1) {
			System.out.print(i+" ");
		}
		else {
			System.out.print(-i+" ");
		}
		i++;
		}while(i<=10);
	}

}
