package com.demo.whileloop;
//Write a Program To print 50 to 100 nos.
//9) Write a Program To print sum of odd and even no.
// Write a Program To print 1 to 100 no.s
public class Prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=50;int evensum=0,oddsum=0;
		while(i<=100) {
			if(i%2==0) {
			
			System.out.println("even"+i);
			evensum+=i;
			
			i++;
			}
			else {
				System.out.println(i);
				oddsum+=i;
				i++;
				
			}
		}
		System.out.println("evensum"+evensum);
		System.out.println("oddsum"+oddsum);
	}

}
