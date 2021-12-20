package com.greatlearning.services;
import java.util.Scanner;

public class MinNoteCal {

	public static void minNote(int arr[]) {
		
		int n =0 ,m = 0,tar = 0,amt = 0 ,notecount ;
		int NoteCountArry[] = new int[arr.length];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to pay ");
		amt = sc.nextInt();
		
		for (int i =0 ; i< arr.length  ;i++) {
						
				notecount = 0;
				notecount = amt/arr[i];
				NoteCountArry[i] = notecount;
				amt = amt%arr[i];
				//System.out.println("notecount " + notecount + " , amt " + amt);
							
		}
		
		//display.PrintArr(arr,arr.length);
		//display.PrintArr(NoteCountArry,arr.length);
		
		if (amt == 0) {
			
			System.out.println("----------------------------");
			System.out.println("Your payment approach in order to give min no of notes will be ");        
			
			for (int i = 0 ; i<arr.length ;i++) {
				
				if( NoteCountArry[i] > 0) {
					
					System.out.println( arr[i] + " : " + NoteCountArry[i] );
					
				}       	
				
		    }
			
		}
				
		else {
			
			System.out.println("----------------------------");
			System.out.println("Not Possible to do payment as you don't have currency denominations to pay Rs " + amt );
			
		}
		
	}	
	
}
