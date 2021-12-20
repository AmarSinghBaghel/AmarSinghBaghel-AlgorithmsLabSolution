package com.greatlearning.Driver;
import java.util.*;
import com.greatlearning.model.*;
import com.greatlearning.services.*;

public class DriverQ1 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transactional array");
		n = sc.nextInt();
		int arr[] = null ;		
		arr = ArrayCreator.arry(n);
		display.PrintArr(arr,n);		
		TargetCal.tarcal(arr);
			
	}
      
}
