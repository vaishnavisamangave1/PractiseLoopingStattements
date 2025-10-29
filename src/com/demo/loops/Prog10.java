package com.demo.loops;
//Write a Program To print even and odd No

public class Prog10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********EVEN NUMBERS*********");
		/*for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}*/
		for(int i=2;i<=100;i+=2) {
			System.out.println(i);
		}
		System.out.println("**********ODD NUMBERS*********");
		/*for(int i=1;i<=100;i++) {
			 if(i%2==1){
				System.out.println(i);
				
			}
		}*/
		for(int i=1;i<=100;i+=2) {
			System.out.println(i);
		}

	}

}
