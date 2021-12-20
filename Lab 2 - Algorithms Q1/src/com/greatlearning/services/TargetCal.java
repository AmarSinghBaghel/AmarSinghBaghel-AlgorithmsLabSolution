package com.greatlearning.services;
import java.util.Scanner;

public class TargetCal {

	public static void tarcal(int arr[]) {
		
		int n =0 ,m = 0,tar = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of targets that needs to be achieved ");
		m = sc.nextInt();
		for (int i =0 ; i<m;i++) {
			
			System.out.println("------------------------------- ");
			System.out.println("Enter the value of target :- ");
			tar = sc.nextInt();				
		    int sum = 0 ;
		    for (int k = 0; k < arr.length && tar > sum ; k++ ) {
			             sum = arr[k] + sum	;
			             if(sum >= tar ){				            	 
			            	 System.out.println("Target achieved after " + (k+1) +" transactions");
					         break;			            		 			         			            	 
			             }
			             			             
	               } 
		    
	        if (sum < tar) {
	        	
	        	System.out.println("Given target is not achieved");
	        	
	        }
		          
	}
		
	}
	
	}
