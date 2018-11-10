/*
 * purpose:Merge sort 
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;

public class Merge {
	/**
	 * 
	 * @param arr string array
	 * @param l low position
	 * @param m mid position
	 * @param h last position
	 */
	static void merge(String arr[], int l, int m, int h) 
    { 
        /*
         * initializing two variable
         * n1 and n2 for length for string array
         * 
         */
        int n1 = m - l + 1; 
        int n2 = h - m; 
        //temporary array
        String L[] = new String[n1]; 
        String R[] = new String[n2]; 
  
        //to store the arr values into string array
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        int i = 0, j = 0; 
  
       
        int k = l; 
        while (i < n1 && j < n2) 
        { 
        	/*
        	 * 
        	 * if: to compare with next element <=0 means add in arr[k]=l[i]
        	 * else arr[k]=r[i]
        	 * 
        	 */
            if (L[i].compareTo(R[j])<=0) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
     
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
       
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
	
}
