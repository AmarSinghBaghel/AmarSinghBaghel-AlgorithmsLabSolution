package com.greatlearning.services;

public class MergeSort {
	
	
	public static void  merge (int[] arr , int l , int mid, int r) {
		int llength = mid-l+1;
		int rlength = r-mid;
		
		int m = mid ;
		int Leftarry[] = new int[llength];
		int Rightarry[] = new int [rlength];
		
		for (int i=0; i< llength ; i++) {
			Leftarry[i] = arr[l+i];
		}
		for (int j=0; j< rlength ; j++) {
			Rightarry[j] = arr[mid+1+j];
		}

		int i,j,k ;
		i=0;
		j=0;
		k = l;

		while (i < llength && j < rlength ) {
			
	     if (Leftarry[i]>= Rightarry[j]) {
	    	 
	    	 arr[k] = Leftarry[i];
	    	 i++;
	    	 
	     }else {
	    	 
	    	arr[k] = Rightarry[j];
	    	j++;
	    	
	     }
		k++;
		}
	     while (i< llength) {
	    	 
	    	 arr[k] = Leftarry[i];
	    	 i++;
	    	 k++;
	    	 
	     }
		
     }
 
public static void mergeSort(int arr[], int l, int r)	{	
	
	if (l<r) {
				
		int m = (l+r)/2;		
		mergeSort(arr,l,m);
		mergeSort(arr,m+1,r);		
		
		merge(arr,l,m,r);
			    			    	    
	}		
	
}  
	
}



