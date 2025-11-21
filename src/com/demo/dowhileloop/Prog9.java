package com.demo.dowhileloop;
//Write a Program To print sum of odd and even no.
//10) Write a Program To print even and odd No
public class Prog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =1;
		
        int sum=0,oddSum=0;
        do {
        	if(i%2==0) {
        		sum+=i;
        		//System.out.println("even sum");
        		System.out.println("evenno"+i);
        		
        		i++;
        	}
        	else  {
        		oddSum+=i;
        		System.out.println("oddNo"+i);
        		i++;
        	}
        }while(i<=100);
        
        System.out.println("even"+sum);
        System.out.println("odd"+oddSum);
	}

}
