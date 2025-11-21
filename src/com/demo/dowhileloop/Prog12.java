package com.demo.dowhileloop;
//Write a Program To print 1 to 100 no.
//12) Write a Program To print 100 to 1 no.
//13) Write a Program To print 30 to 50 no.
//14) Write a Program To print count of even No 1 to 25 no.
//15) Write a Program To print count of odd No 1 to 25 no
public class Prog12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=100);
		System.out.println("*********");
		int j=100;
		do {
			System.out.println(j);
			j--;
		}while(j>=1);
		
		System.out.println("*********");
		
		int k=30;
		do {
			System.out.println(k);
			k++;
		}
		while(k<=50);
		
		System.out.println("*********");
		
		int m=1;
		do {
			if(m%2==0) {
			System.out.println(m);
			}m++;
		}
		
		while(m<=25);
		

		System.out.println("*********");
		
		int n=1;
		do {
			if(n%2==1) {
			System.out.println(n);
			}n++;
		}
		
		while(n<=25);
		

		

	}

}
