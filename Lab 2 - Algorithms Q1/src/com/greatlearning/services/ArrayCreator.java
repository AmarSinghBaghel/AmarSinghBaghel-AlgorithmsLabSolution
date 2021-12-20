package com.greatlearning.services;

import java.util.Scanner;

public class ArrayCreator {

	
	public static int[] arry(int n) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[n];
		System.out.println("Enter the " + n + " values in array");
		for (int i = 0; i<n ; i++) {
			
			//System.out.println("Enter the values in position  " + (i+1) + " of array");
			arr[i] = sc.nextInt();
						
		}
		
		return arr;
		
		
	}
}
