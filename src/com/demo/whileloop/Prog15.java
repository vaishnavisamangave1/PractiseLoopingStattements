package com.demo.whileloop;
// Generate the Series... 0 1 1 2 3 5 8 13 21.
public class Prog15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=1;
		int num3;
		int i=1;
		
		
		while(i<=7) {
			num3=num2+num1;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
			
			i++;
			
			
			
			//System.out.println(num3+" ");
		}

	}

}
