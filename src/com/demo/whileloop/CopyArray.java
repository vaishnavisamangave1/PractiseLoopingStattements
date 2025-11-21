package com.demo.whileloop;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1stway
		int[]arr= {10,20,20,90,67};
		
		int[]arr2=new int[arr.length];;
		
		for(int i=0;i<=arr.length-1;i++) {
			arr2[i]=arr[i];
			System.out.println(arr2[i]);
		}
	//	System.out.println(arr2[i]);
		
		//2nd way
		
		int[] arr3=arr.clone();
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr3[i]);
		}
		
		//3rd way
		
		int[]ar4=Arrays.copyOf(arr, arr.length);
		for(int i =0;i<arr.length;i++) {
			System.out.println(ar4[i]);
		}
		

	}

}
