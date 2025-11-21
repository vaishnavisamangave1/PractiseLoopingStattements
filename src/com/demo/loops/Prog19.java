package com.demo.loops;

import java.util.Scanner;

public class Prog19 {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter Value i");
		 int j=sc.nextInt();
		 boolean isPrime=true;
		 
		 while(j<=1) {
			 isPrime=false;
		 }
		 
		 for(int i=2;i<=j/2;i++) {
			 
			 if(j%2==0) {
				 isPrime=false;
				 break;
			 }
			
		 }
		 
		 if(isPrime) {
			 System.out.println("prime"+j);
		 }
		 else {
			 System.out.println("not prime"+j);
			 
		 }
		 
		 
		 
		 
		 
		 
		 

	}

}
