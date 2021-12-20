package com.greatlearning.Driver;
import java.util.*;

import com.greatlearning.services.*;

public class DriverQ2 {

	public static void main(String[] args) {
		
		int n;                                        //Declaring array length variable as n.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		n = sc.nextInt();
		int arr[] = null ;		
		arr = ArrayCreator.arry(n);	             //Array creator method call of array length n , as per  input entered by client.	
		MergeSort.mergeSort(arr, 0, arr.length-1);  //Merge sort method call to sort input array in descending order.
		MinNoteCal.minNote(arr);                    //Minimum note calculator method call.
	}

}
