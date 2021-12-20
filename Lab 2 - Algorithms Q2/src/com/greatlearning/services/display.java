package com.greatlearning.services;

public class display {
	
public static void PrintArr (int arr[], int n) {
		
		System.out.println("The enterted values in array of " + n + " size is ");
		System.out.print("{ ");
		for (int i = 0 ; i<n;i++) {
        	
        	System.out.print( arr[i] + " , " );
        }
		System.out.println(" } ");
		
		
	}

}
