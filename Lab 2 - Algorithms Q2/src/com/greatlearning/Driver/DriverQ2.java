package com.greatlearning.Driver;
import java.util.*;

import com.greatlearning.services.*;

public class DriverQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		n = sc.nextInt();
		int arr[] = null ;		
		arr = ArrayCreator.arry(n);
		//system.out.println("Enter the  currency denominations are");
		//display.PrintArr(arr,n);		
		MergeSort.mergeSort(arr, 0, arr.length-1);
		//System.out.println("The  sorted currency denominations are");
		//display.PrintArr(arr,n);
		MinNoteCal.minNote(arr);
	}

}
