/*
 * purpose:Merge sort 
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;

public class Sort {
	/**
	 * 
	 * @param a its a string array
	 * @param low initial value 
	 * @param high last value
	 * @return sorted string array
	 */

    static String[] sort(String a[],int low,int high)
    {
    	/*
    	 * 
    	 * if: to check upto low<high
    	 * 
    	 */
    	if(low<high)
    	{
    		//to find the mid value
    		int mid=(low+high)/2;
    		/*
    		 * recurrsive call of sort
    		 * 
    		 */
    		sort(a, low, mid);
    		
    		sort(a,mid+1,high);
    		/*
    		 * function calling
    		 * to merge the values
    		 * 
    		 */
    		Merge.merge(a, low, mid, high);
    	}
    	return a;
    }
}
