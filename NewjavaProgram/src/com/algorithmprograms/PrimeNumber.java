/*
 * purpose:to print prime number between 1 to 1000
 * 
 
 *  @author  Ramana Ganesh
 *  @version 1.2
 *  @since   19-10-2018
  *************************************************************/
package com.algorithmprograms;



public class PrimeNumber {
	/**
	 * 
	 * @param n denotes to print the number upto n
	 */
	static int val[]=new int[1000];
static int isPrime(int n)
{
	int count=0;
	System.out.println("the prime numbers between 1 to"+n);
	/*
	 * using for loop 
	 * initializing i=1
	 * i iterate upto n
	 *  
	 */
	for (int i = 1; i <= n; i++)         
    { 	
		//counter is used to print the prime number
       int counter=0;	
       /*
   	 * using for loop 
   	 * initializing num=i
   	 * num iterate upto 1
   	 *  
   	 */
       for(int num =i; num>=1; num--)
	  {
    	   /*
    	    * if: to check the number is divisible by a 1 and num
    	    * 
    	    */
          if(i%num==0)
	     {
        	  //if its means it will add the counter by 1
		counter = counter + 1;
	     }
	  }
       /*
        * if: counter=2 so the given num is prime
        * 
        */
       if(counter==2)
       {
    	   //print the result
     System.out.println(i+" ");
     /*
 	 * function call
 	 * to check prime number is palindrome or not
 	 * 
 	 */
     	  val[count]=i;
    	  isPalindrome(i);
    	  count++;
       }
      
}
	return count;
}
/**
 * 
 * @param i stores the prime number 
 * check whether the prime number is palindrome or not
 */
static void isPalindrome(int i)
{

	/*
	 * 
     * if: the value between 0 to 9 is palindrome
     * else the value more than 9
     * 
     */
	if(i>0 && i<=9)
		System.out.println("the number "+i +" is palindrome");
	else
	{
		//temp is used to i value because i value cannot be change
		
		int temp=i;
		int nnum=0;
		/*
		 * 
		 * using while loop
		 * to check upto temp!=0
		 * 
		 */
		while(temp!=0)
		{
			/*
			 * if:if the rem is 0 we will directly add rem
			 * else : we will add rem and then nnum will be multiply by 10
			 * 
			 */
			int rem=temp%10;
			if(temp/10==0)
			{
				nnum=nnum+rem;
				//System.out.println(nnum);
			}	
			else
				{
				nnum=nnum+rem;
				nnum=nnum*10;
				}
			
		//	System.out.println(nnum);
			//next iteration for while loop
			 temp=temp/10;
		}
		
		if(nnum==i)
		{
			//print the result of palindrome
			System.out.println("the number "+i +" is palindrome");
		}
	}
	
}
static void anagramDisplay(int count)
{
	
	
	for(int i=0;i<count-2;i++)
	{
		for(int j=i+1;j<count;j++)
		{
			if(val[i]!= 0 && val[j]!=0)
			{
				
			 boolean b=isAnagram(val[i], val[j]);
			
			if(b==true)
			{System.out.println(val[i]+" "+val[j]);
				//System.out.print(val[i]+" "+val[j]);
			}
		
			}
			//System.out.println();
	}
	}
}
static boolean isAnagram(int st1,int st2)
{
	boolean b=check(st1,st2);
	
	return b;
}

private static boolean check(int st2,int st1)
	{
		int c[]=new int[10];
		int c1[]=new int[10];
	
		while(st1!=0)
		{
			int rem=st1%10;
			c[rem]++;
			st1=st1/10;
		}
		while(st2!=0)
		{
			int rem=st2%10;
			c1[rem]++;
			st2=st2/10;
		}
	     	for(int i=0;i<10;i++)
	     	{
	     		if(c[i]!=c1[i])
	     				return false;
	     		
	     	}
	     	return true;
	     	
	}
}
