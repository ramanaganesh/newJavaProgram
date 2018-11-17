package com.utility;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class Utility 
{

//**********************************************************************
	/**
	 * 
	 * @param uname to print the name
	 * 
	 */
	public static void replaceString(String string[])
	{
		//check whether the user name is having min 3 character or not
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter user name");
			String userName=scanner.nextLine();
			String newSentence="";
			while(userName.length()<3)
			{
				System.out.println("enter the correct string ");
				userName=scanner.next();
			}
			for (int i = 0; i < string.length; i++) 
			{
				if(i==1)
					newSentence=newSentence+userName+" ";
				else
				newSentence=newSentence+string[i]+" ";
			}
			System.out.println(newSentence);
			scanner.close();
	}
//**********************************************************************

	
	
	
//**********************************************************************
	/**
	 * 
	 * @param year to check whether the year is leap year or not
	 * 
	 */
	public static void isLeapYear(int year)
	{
		Scanner s=new Scanner(System.in);
		
		/*
		 *
		 * Integer.toString(year).length():To count the integer value
		 * if:to check the length of the year is 4 
		 * else:print some message
		 * 
		 */
		
		while(Integer.toString(year).length()<4)
		{
			System.out.println("year must be 4 digits");
			System.out.println("enter the year");
			year=s.nextInt();
		}
			/*
			 * 
			 * if:to check the logic for the leap year
			 * 	  print the year as leap year
			 * else:print some message
			 * 
			 */
			if(year%400==0 || year%4==0 && year%100!=0)
			{
				System.out.println(year+" is leap year");
			}
			else
				System.out.println(year+" is not leap year");
		s.close();
		
	}
//**********************************************************************
	

	
	
	
//**********************************************************************
	/**
	 * 
	 * @param times is used to number of times to flip
	 * 
	 */
public static void flipCoin(int times)
{
	Scanner s=new Scanner(System.in);
	while(times<0)
	{
		System.out.println("enter correct number");
		times=s.nextInt();
	}
	/*
	 * Initializing two variables 
	 * to find percentage
	 */
	double head=0,tail=0;
	
	/*
	 * using for loop 
	 * initializing i=0
	 * i iterate upto number of times to flip coin
	 *  
	 */
	for(int i=0;i<times;i++)
	{
	/*
	 * if the values is <0.5 head increment
	 * else tail increment
	 * 
	 */
		
		if(Math.random()<0.5)
				head++;
			
		else
				tail++;
		
			
	}
	
	//formula to calculate head and tail percentage
	double hperc=(head/times)*100;
	double tperc=(tail/times)*100;
	
	//print the possible number of head and tail with its percentage
	System.out.println("number of head "+head+" with head percentage is "+hperc+"%");
	System.out.println("number of tail "+tail+" with tail percentage is "+tperc+"%");
	s.close();
}
//**********************************************************************





//**********************************************************************
/**
 * 
 * @param n is used to determine the power of 2
 * 
 */
public static void power(int n)
{
	/*
	 * 
	 * if:check the user enter number is in the range 
	 * else: print some message
	 * 
	 */
	Scanner s=new Scanner(System.in);
	while(n>31 || n<0)
	{
		System.out.println("enter the correct number");
		n=s.nextInt();
	}
		/*
		 * using for loop 
		 * initializing i=0
		 * i iterate upto n
		 *  
		 */
		
		for(int i=0;i<=n;i++)
		{
			/*
			 * inner for loop
			 * using for loop 
			 * initializing j=0
			 * j iterate upto i
			 * every time pow is initialized in to 1
			 *  
			 */
			int pow=1;
		for(int j=0;j<i;j++)
		{
			//to calculate the power of (2,i)
			pow=pow*2;
		}
		//print the power of (2,i) upto n
		System.out.println("the power of 2^"+i+" is "+pow);
	}
	
	
	s.close();
}
//**********************************************************************




//**********************************************************************
/**
 * 
 * @param n is determine the series of harmonic value
 * 
 */
public static void harmonicSeries(int n)
{
	/*
	 *if:check whether n is not equal to 0
	 *
	 */
	Scanner s=new Scanner(System.in);
	if(n!=0)
	{
		/*
		 * using for loop 
		 * initializing i=1
		 * i iterate upto n
		 * every time sum is initialized in to 0
		 *  
		 */
		
		double sum=0;
		for(double i=1;i<=n;i++)
		{
			//sum to calculate the nth harmonic number
			sum=sum+(1/i);
		}
		//print the fisrt nth harmonic number
		System.out.println("the compute value of first "+n +" number is "+sum);
	}
	s.close();
}
//**********************************************************************






//**********************************************************************
public static void factor(long num)
{
	Scanner s=new Scanner(System.in);
	/*
	 * using for loop 
	 * initializing i=2
	 * i iterate upto (i*i<=num)
	 *  
	 */
	for(long i=2;i*i<=num;i++)
	{
		/*
		 * using while loop 
		 * check the condition num%i==0
		 * iterate to num=num/i
		 *  
		 */
	 while(num%i==0)
	 {
		 //print the prime factors
		 
		 System.out.println(i+" ");
		 num=num/i;
	 }
	}
	/*
	 * 
	 * if:check the final num>1 print the num
	 * 
	 */
if(num>1) 
	System.out.println(num);
else
	System.out.println();
s.close();
}
//**********************************************************************





//**********************************************************************
/**
 * 
 * @param stake inital amount
 * @param goal final amount
 * @param trial times
 * 
 */
public static void gambler(int stake,int goal,int trial)
{
	/*
	 * Initializing two variables 
	 * to find percentage
	 * 
	 */
	
	int win=0,bet=0;
	
	/*
	 * using for loop 
	 * initializing i=1
	 * i iterate upto trial
	 *  
	 */
	for(int i=1;i<=trial;i++)
	{
		
		//we take temp variable to store stake
		int cash=stake;
		

		/*
		 * using while loop 
		 * check the condition cash >0 && cash<goal
		 * iterate upto cash<goal
		 *  
		 */
		while(cash >0 && cash<goal)
		{
			/*
			 * 
			 * every times while condition satisfies it increment bet
			* if the values is <0.5 cash increment
			* else cash decrement
			* 
			*/
			bet++;
		if(Math.random()<0.5)
		{
			cash++;
		}
		else
			cash--;
	}
		/*
		 * 
		 * if:cash==goal win incremented
		 * 
		 */
		if(cash==goal)
			win++;
}
	
	//print the results
	System.out.println(win + " of "+trial);
	System.out.println("the win percentage is "+100.0*win/trial);
	System.out.println("average bet "+1.0*bet/trial);
	
}
//**********************************************************************





//**********************************************************************	
/**
 * 
 * @param row represent row
 * @param col reperesent column
 * 
 */
static public void array2D(int row,int col)
{
	System.out.println("hi");
	Scanner s=new Scanner(System.in);

	/*
	 * 
	 * declaring array to store the values
	 * 
	 */
	int arr[][]=new int[row][col];
	
	 /* using for loop
	 *  initializing i=0
	 *  i iterate upto row
	 * 
	 */ 
	for(int i=0;i<row;i++)
	{
		 /* using for loop
		 *  initializing j=0
		 *  j iterate upto col
		 * 
		 */
		for(int j=0;j<col;j++)
		{
			/*
			 * read the input from the user
			 * 
			 */
		    System.out.print("arr["+i+"]["+j+"]=");
		    arr[i][j]=s.nextInt();
		    System.out.println();
		}
	}
	//print the 2-D array
	System.out.println("2D array is");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	s.close();	
}
//**********************************************************************	






//**********************************************************************	
/**
 * 
 * @param a its array to print triplets 
 * 
 */
public static void triplets(int a[])
{
	/*
	 * 
	 * using for loop
	 * initializing i=0
	 * i iterate upto n -2
	 * i increment
	 * 
	 */
	for(int i=0;i<a.length-2;i++)
		{
		/*
		 * 
		 * inner loop
		 * using for loop
		 * initializing j=i
		 * j iterate upto n-2
		 * j increment
		 * 
		 */
		int sum=0;
		int k=i;
		for(int j=i;j<a.length-2;j++)
		{
			/*
			 * add the 3 values
			 * if:sum=0 means print the triplets
			 *    break used to stop the loop
			 *    
			 */
			sum=a[k]+a[j+1]+a[j+2];
			if(sum==0)
				{
				System.out.println(a[k]+" "+a[j+1]+" "+a[j+2]);
			   
				}
		}
		
	}
}
//**********************************************************************	
public static void couponNumber(int lim)
{
	ArrayList<Integer> arrayList=new ArrayList<>(lim);
	Random o=new Random();
	int iteartionCount=0;
	System.out.print("repeated random number ");
	for(int i=0;i<lim;i++)
	{
		Integer randomNumber=o.nextInt(lim)+1;
		if(arrayList.contains(randomNumber))
		{
			System.out.print(randomNumber+" ");
			i--;
			iteartionCount++;
		}
		else
		{
			arrayList.add(randomNumber);
			
		}
	}
	System.out.println();
	System.out.println("the arraylist is ");
	System.out.println(arrayList);
	System.out.println("the number of random number generate is:"+(iteartionCount+lim));
}




//**********************************************************************
/**
 * 
 * @param x1 first point
 * @param y1 sec point
 */
public static void distance(int x1,int y1)
{
	//formula to find distance
	int sq=(x1*x1)+(y1*y1);
	//print the result
	System.out.println(Math.sqrt(sq));
}
//**********************************************************************



//**********************************************************************
/**
 * 
 * @param ch it is used to swap the character
 * @param j its for the position
 * @return no
 */
public static void permutation(char[] ch, int j) {
	/*
	 * 
	 * if:prints the overall values it reach ch.length-1
	 * 
	 */
	if(ch.length-1==j)
	{
		
		System.out.println(String.valueOf(ch));
	}/*
	 * 
	 * using for loop
	 * initializing i=j
	 * i iterate upto ch.length
	 * i increment
	 * 
	 */
	for(int i=j;i<ch.length;i++)
	{	
		//Calling a function
		swap(ch,j,i);
		//Calling a recursive call
		permutation(ch, j+1);
		//Calling a function
		swap(ch,j,i);
	
	}
}
/**
 * 
 * @param c this id array
 * @param i this is the position for swapping
 * @param j this is the position for swapping
 * @return no
 */
private static void swap(char c[], int i,int j) {
	//swapping the variables
char temp=c[i];
c[i]=c[j];
c[j]=temp;
//System.out.println(c);	
}
//**********************************************************************





//**********************************************************************
public static void play(char cell[][])
{
	Scanner s=new Scanner(System.in);
	Random r=new Random();
	System.out.println("TIC TAC TOE GAME");
	/*
	 * getting an input from the user with the help of scanner
	 */
	System.out.println("SELECT THE MODE \n1.EASY \n2.HARD");
	int mode=s.nextInt();
	System.out.println("Start The Game");
	/*
	 * print the board
	 * using for loop
	 * initializing i=0
	 * i iterate upto cell.length-1	
	 * 
	 */
	for (int i = 0; i < cell.length; i++) {
		/*
		 * inner loop
		 * using for loop
		 * initializing j=0
		 * j iterate upto cell.length-1	
		 * 
		 */
		for (int j = 0; j < cell.length; j++) {
			System.out.print(cell[i][j]+" ");
		}
		System.out.println();
	}
	/*
	 * 
	 * initializing two variable
	 * count is used for iterating the while loop
	 * k is used as computer or user play
	 * 
	 */
	int count=0,k=0;
	
	while(count<9)
	{
		/*
		 * if k is even computer play
		 * 
		 */
		int c1 = 0,c2=0;
		if(k%2==0)
		{
			/*
			 * if:mode=1 is for easy
			 * 	  it take random values
			 * else if:mode=2 is for hard
			 *         it take input from user
			 *           
			 * 
			 */
			if(mode==1)
			{
			System.out.println("computer play");
			c1=r.nextInt(3);
			c2=r.nextInt(3);
			}	
			else if(mode==2)
			{
				System.out.println("computer play");
				c1=s.nextInt();
				c2=s.nextInt();
				
			}
		    /*
		     * if:check wheher the input is valid or not
		     * else:print some message
		     * 
		     */
			if(c1<3 && c2<3)
			{
				/*
				 * if:check the unfilled box and then fill X
				 * else:print some message
				 * 
				 */
				if(cell[c1][c2]=='E')
				{
					cell[c1][c2]='X';
					count++;
					k++;
				}
				else
				{
					System.out.println("the place is already filled");
				}
			}
			else
			{
				System.out.println("give correct location");
			}
			//print the intermediate results
			for (int i = 0; i < cell.length; i++) {
				for (int j = 0; j < cell.length; j++) {
					System.out.print(cell[i][j]+" ");
				}
				System.out.println();
			}
			/*
			 *  Initializing three variables 
			 *  a,b,c for index
			 *  if and else if: logics for the game
			 *                  print the result
			 *  else if:count=9 means game over result is draw
			 */
			int a=0,b=1,c=2;
			if((cell[a][a]=='X' && cell[a][b]=='X' && cell[a][c]=='X')  || (cell[a][a]=='X' && cell[b][a]=='X' && cell[c][a]=='X') || (cell[a][b]=='X' && cell[b][b]=='X' && cell[c][b]=='X') || (cell[a][c]=='X' && cell[b][c]=='X' && cell[c][c]=='X'))
			{
				System.out.println("computer wins");
				break;
			}
			else if((cell[a][a]=='X' && cell[b][b]=='X' && cell[c][c]=='X') || (cell[c][a]=='X' && cell[b][b]=='X' && cell[a][c]=='X'))
			{
				System.out.println("computer wins");
				break;
			}
			else if((cell[b][a]=='X' && cell[b][b]=='X' && cell[b][c]=='X') || (cell[c][a]=='X' && cell[c][b]=='X' && cell[c][c]=='X'))
			{
				System.out.println("computer wins");
				break;
			}
			else if(count==9)
			{
				System.out.println("draw");
				break;
			}
		}

		else
		{
			System.out.println("user play");
		    c1=s.nextInt();
			c2=s.nextInt();
			/*
		     * if:check wheher the input is valid or not
		     * else:print some message
		     * 
		     */
			if(c1<3 && c2<3)
			{
				/*
				 * if:check the unfilled box and then fill O
				 * else:print some message
				 * 
				 */
				if(cell[c1][c2]=='E')
				{
					cell[c1][c2]='O';
					count++;
					k++;
				}
				else
				{
					System.out.println("the place is already filled");
				}
			}
			else
			{
				System.out.println("give correct location");
			}
			//print the intermediate results
			for (int i = 0; i < cell.length; i++) {
				for (int j = 0; j < cell.length; j++) {
					System.out.print(cell[i][j]+" ");
				}
				System.out.println();
			}
			/*
			 *  Initializing three variables 
			 *  a,b,c for index
			 *  if and else if: logics for the game
			 *                  print the result
			 *  else if:count=9 means game over result is draw
			 */
			int a=0,b=1,c=2;
			if((cell[a][a]=='O' && cell[a][b]=='O' && cell[a][c]=='O')  || (cell[a][a]=='O' && cell[b][a]=='O' && cell[c][a]=='O') || (cell[a][b]=='O' && cell[b][b]=='O' && cell[c][b]=='O') || (cell[a][c]=='O' && cell[b][c]=='O' && cell[c][c]=='O'))
			{
				System.out.println("user wins");
				break;
			}
			else if((cell[a][a]=='O' && cell[b][b]=='O' && cell[c][c]=='O') || (cell[c][a]=='O' && cell[b][b]=='O' && cell[a][c]=='O'))
			{
				System.out.println("user wins");
				break;
			}
			else if((cell[b][a]=='O' && cell[b][b]=='O' && cell[b][c]=='O') || (cell[c][a]=='O' && cell[c][b]=='O' && cell[c][c]=='O'))
			{
				System.out.println("user wins");
				break;
			}
			else if(count==9)
			{
				System.out.println("draw");
				break;
			}
		}

		}
	//print the final result
	System.out.println("GAME OVER");
	for (int i = 0; i < cell.length; i++) {
		for (int j = 0; j < cell.length; j++) {
			System.out.print(cell[i][j]+" ");
		}
		System.out.println();
	}
	s.close();
}
//**********************************************************************





//**********************************************************************
/**
 * 
 * @param a used as points
 * @param b used as points
 * @param c used as points
 */
public static void quadratic(int a,int b,int c)
{
	System.out.println("("+a+"x*x)+"+b+"x+"+c);
	//mul is used for iteration
    int mul=a*c;
    /*
	 * 
	 * using for loop
	 * initializing i=1
	 * i iterate upto a*c
	 * i increment
	 */
	for(int i=1;i<(a*c);i++)
	{
		/*
		 * if:for prime values
		 */
		if(mul%i==0)
		{
			int quo=mul/i;
                /*
                 * if:for check sum of 2 roots= b		
                 */
			if((quo+i)==b)
			{
					/*
					 * if:a=1 print the 2 roots
					 * else:a>1 print the 2 roots
					 * 
					 */
					if(a==1)
					{	System.out.println("the roots are "+"(x+"+quo+")(x+"+i+")");
						break;
					}
					else
					{
						double quo1=(double)quo/a;
						double quo2=(double)i/a;
						
						if(quo1==1.0 && quo2==1.0)
						{
							System.out.println("the roots are "+"(x+"+(int)quo1+")(x+"+(int)quo2+")");
							break;
						}
						else if(quo2==1.0)
						{
							System.out.println("the roots are "+"(x+"+(int)quo2+")("+a+"x+"+quo+")");
							break;
						}
						else if(quo1==1.0)
						{	System.out.println("the roots are "+"(x+"+(int)quo1+")("+a+"x+"+i+")");
							break;
						}
					}
			}
		}
	}
}
//**********************************************************************






//**********************************************************************
public static void findWindChill(double temp,double v)
{
	/*
	 * if:condtion satisfies means print the windmill speed
	 * else:print message
	 * 
	 */
	if(temp< 50 && v>=3 && v<=120)
	{
		//formula for windmill
		double p=Math.pow(v, 0.16);
		double windmill=35.74+(0.6215*temp)+(((0.4275*temp)-35.75)*p);
		System.out.println("windmill="+windmill);
	}
	else
		System.out.println("its out of limit");
}
//**********************************************************************





//**********************************************************************
/**
 * 
 * @param string1 to store the string to check anagram
 * @param string2 to store the string to check anagram
 * @return no
 */
public static boolean isAnagram(String string1,String string2)
{
/*
 * function call to check the two string anagram or not
 * 
 * 
 */
boolean flag=check(string1,string2);
/*
 * 
 * if:true print ana=gram
 * else: print not anagram
 * 
 */
if(flag)
	System.out.println("given String is anagram");
else
	System.out.println("given string is not anagram");
return true;
}

/**
* 
* @param string2  taking input string from calling function
* @param string1 taking input string from calling function
* @return true or false
*/
private static boolean check(String string1,String string2)
{
/*
 * 
 * initializing two integer array
 * to store the inputs for corresponding alphabet letter
 * 
 */
	int count[]=new int[26];
	int count1[]=new int[26];
	
	//its used to convert string into character array
	char character[]=string2.toCharArray();
	char character1[]=string1.toCharArray();
	/*
	 * using for loop 
	 * initializing i=0
	 * i iterate upto last letter(ch.length)
	 *  
	 */
	
	for (int i = 0; i < character.length; i++) 
		{
			if(character[i]>='a' && character[i]<='z')
			{
				//to store the inputs for corresponding alphabet letter
				count[character[i]-97]++;
				
			}
		}
	/*
	 * using for loop 
	 * initializing i=0
	 * i iterate upto last letter(ch.length)
	 *  
	 */
	for (int i = 0; i < character1.length; i++) 
	{
		if(character1[i]>='a' && character1[i]<='z')
		{
			
			//to store the inputs for corresponding alphabet letter
			count1[character1[i]-97]++;
		}
	}
	/*
	 * using for loop 
	 * initializing i=0
	 * i iterate upto 26
	 *  
	 */
     	for(int i=0;i<26;i++)
     	{
     		/*
     		 * 
     		 * if:check whether its same or not if its differ means its return false
     		 */
     		if(count[i]!=count1[i])
     				return false;
     		
     	}
     	return true;
     	
}
//**********************************************************************




//**********************************************************************
/**
 * 
 * @param n denotes to print the number upto n
 */
static int value[]=new int[1000];
public static int isPrime(int limit)
{
int count=0;
System.out.println("the prime numbers between 1 to"+limit);
/*
 * using for loop 
 * initializing i=1
 * i iterate upto n
 *  
 */
for (int i = 1; i <= limit; i++)         
{ 	
	//counter is used to print the prime number
   int counter=0;	
   /*
	 * using for loop 
	 * initializing num=i
	 * num iterate upto 1
	 *  
	 */
   for(int number =i; number>=1; number--)
  {
	   /*
	    * if: to check the number is divisible by a 1 and num
	    * 
	    */
      if(i%number==0)
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
 	  value[count]=i;
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
	int newNumber=0;
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
		int remainder=temp%10;
		if(temp/10==0)
		{
			newNumber=newNumber+remainder;
			//System.out.println(nnum);
		}	
		else
			{
			newNumber=newNumber+remainder;
			newNumber=newNumber*10;
			}
		
	//	System.out.println(nnum);
		//next iteration for while loop
		 temp=temp/10;
	}
	
	if(newNumber==i)
	{
		//print the result of palindrome
		System.out.println("the number "+i +" is palindrome");
	}
}

}
public static void anagramDisplay(int count)
{


for(int i=0;i<count-2;i++)
{
	for(int j=i+1;j<count;j++)
	{
		if(value[i]!= 0 && value[j]!=0)
		{
			
		 boolean flag=isAnagram(value[i], value[j]);
		
		if(flag==true)
		{System.out.println(value[i]+" "+value[j]);
			//System.out.print(val[i]+" "+val[j]);
		}
	
		}
		//System.out.println();
}
}
}
static boolean isAnagram(int string1,int string2)
{
boolean flag=check(string1,string2);

return flag;
}

private static boolean check(int string1,int string2)
{
	int count[]=new int[10];
	int count1[]=new int[10];

	while(string1!=0)
	{
		int remainder=string1%10;
		count[remainder]++;
		string1=string1/10;
	}
	while(string2!=0)
	{
		int remainder=string2%10;
		count1[remainder]++;
		string2=string2/10;
	}
     	for(int i=0;i<10;i++)
     	{
     		if(count[i]!=count1[i])
     				return false;
     		
     	}
     	return true;
     	
}
//**********************************************************************




//**********************************************************************
/**
 * 
 * @param a its an integer array
 * @param key its a search key
 * 
 */

static public void binarySearch(int number[],int key)
{
//System.out.println("Integer");

int low=0,flag=0;
int high=number.length-1;
/*
* 
* using while loop
* we have to iterate upto low <=high
* 
*/
while(low<=high)
{
//for binary search we have to find mid value for current low and high
int mid=(low+high)/2;
/*
 * 
 * if: we have to check whether the key value is left side
 * else if: we have to check whether the key value is right side
 * else if: its in mid position we have to print the key
 */
System.out.println(low+" "+mid+" "+high);
if(number[mid]>key)
{
	System.out.println(mid);
	high=mid-1;
	//System.out.println(low+" "+high);
}
else if(number[mid]<key)
{
	System.out.println(mid);
	low=mid+1;
}
else if(number[mid]==key)
{
	System.out.println(low+" "+mid+" "+high);
	//flag is used to check the key is found or not 
	flag=1;
	//print the result with position
	System.out.println("the key is found "+key+ " in "+mid+" position");
	break;
}
}
if(flag==0)
System.out.println("the key is not in the array");
}

static public void binarySearch(String word[],String key)
{
//System.out.println("String");
int low=0;byte flag=0;
int high=word.length-1;
/*
 * 
 * using while loop
 * we have to iterate upto low <=high
 * 
 */
while(low<=high)
{
	//for binary search we have to find mid value for current low and high
	int mid=(low+high)/2;
	/*
	 * 
	 * if: we have to check whether the key value is left side
	 * else if: we have to check whether the key value is right side
	 * else if: its in mid position we have to print the key
	 */
	if(word[mid].compareTo(key)>0)
	{
		
		high=mid-1;
	}
	else if(word[mid].compareTo(key)<0)
	{
		
		low=mid+1;
	}
	else if(word[mid].compareTo(key)==0)
	{
		
		//flag is used to check the key is found or not 
		flag=1;
		//print the result with position
		System.out.println("the key is found "+key+ " in "+mid+" position");
		break;
	}
	
}
System.out.println(flag);
if(flag==0)
	System.out.println("the key is not in the array");
}
static public void binarySearch1(int number[])
{
//System.out.println("Integer");
Scanner scanner=new Scanner(System.in);	
int low=0,flag=0;
int high=number.length-1;
String check="false";
/*
* 
* using while loop
* we have to iterate upto low <=high
* 
*/
int choice=0;
do
{

while(low<=high)
{
//for binary search we have to find mid value for current low and high
int mid=(low+high)/2;
if(check!="true")
{
	System.out.println("if ur guess number is "+number[mid]);
	System.out.println("true or false");
	check=scanner.next();
	
	if(check.equals("true"))
	{
		System.out.println("the key is found " +number[mid]);
		flag=1;
		break;
	}
}
if(high!=mid && mid!=low && check.equals("false"))
{
System.out.println("ur guess number is \n1.less than "+number[mid]+" \n2.greater than "+number[mid]);
 choice=scanner.nextInt();
}
/*
 * 
 * if: we have to check whether the key value is left side
 * else if: we have to check whether the key value is right side
 * else if: its in mid position we have to print the key
 */
System.out.println(low+" "+mid+" "+high);
if(choice==1 && high!=mid && mid!=low && check!="true")
{

	high=mid-1;
	
	
}
else if(choice==2 && high!=mid && mid!=low && check!="true")
{

	
	low=mid+1;
	
}

else if(low==high)
{
	//flag is used to check the key is found or not 
	flag=1;
	//print the result with position
	System.out.println("the key is found " +number[low]);
	check="true";
	break;
}
}

}while(check=="false");
if(flag==0)
System.out.println("the key is not in the array");
scanner.close();
}

/**
 * 
 * @param arr its an integer array
 * @return sorted array
 */
static public int[] sorting(int number[])
{
//System.out.println("Integer");
/*
 * using for loop 
 * initializing i=1
 * i iterate upto arr.length
 *  
 */

for(int i=1;i<number.length;i++)
{
	int key=number[i];
	int j=i-1;
	/*
	 * 
	 * using while loop
	 * we have to check j upto 0
	 * 
	 * 
	 */
	while(j>=0 && number[j]>key)
	{
		//if the key value is less than arr[j] means store the value in arr[j+1]j
		number[j+1]=number[j];
		j=j-1;
	}
	number[j+1]=key;
}
return number;
}
/**
* 
* @param arr its an string array
* @return sorted array
*/
static public String[] sorting(String word[])
{
//System.out.println("String");
/*
 * using for loop 
 * initializing i=1
 * i iterate upto arr.length
 *  
 */

for(int i=1;i<word.length;i++)
{
	String key=word[i];
	int j=i-1;
	/*
	 * 
	 * using while loop
	 * we have to check j upto 0
	 * 
	 */
	while(j>=0 && word[j].compareTo(key)>0)
	{
		//if the key value is less than arr[j] means store the value in arr[j+1]j
		word[j+1]=word[j];
		j=j-1;
	}
	word[j+1]=key;
}
return word;
}

/**
 * 
 * @param arr its an integer array
 * @return sorted array
 */
static public int[] sort(int number[])
{
//System.out.println("Integer");
/*
 * using for loop 
 * initializing i=0
 * i iterate upto arr.length-1
 *  
 */
for(int i=0;i<number.length-1;i++)
{
	/*
	 * using inner for loop 
	 * initializing j=0
	 * j iterate upto arr.length
	 *  
	 */
	for(int j=i;j<number.length;j++)
	{
		/*
		 * 
		 * if:the next value is greater than swap the values
		 * 
		 */
		if(number[j]<number[i])
		{
			int temp=number[i];
			number[i]=number[j];
			number[j]=temp;
		}
	}
}
return number;
}
/**
* 
* @param arr its an String array
* @return sorted array
*/

static public String[] sort(String word[])
{//System.out.println("string");
/*
 * using for loop 
 * initializing i=0
 * i iterate upto arr.length-1
 *  
 */
for(int i=0;i<word.length-1;i++)
{
	/*
	 * using inner for loop 
	 * initializing j=0
	 * j iterate upto arr.length
	 *  
	 */
	for(int j=i;j<word.length;j++)
	{
		/*
		 * 
		 * if:the next value is greater than swap the values
		 * 
		 */
		if(word[j].compareTo(word[i])<0)
		{
			String temp=word[i];
			word[i]=word[j];
			word[j]=temp;
		}
	}
}
return word;
}
//**********************************************************************



//**********************************************************************
/**
 *  find funtion to check whether the number is or not using binary search 
 * 
 */
	static boolean check=false;	
static public void find()
{
//getting an input from the user with the help of scanner
Scanner scanner=new Scanner(System.in);
System.out.println("enter the number");
int limit=scanner.nextInt();
/*
 * 
 * using while loop
 * to check the given  number is power of 2 or not 
 * its not means again user enter another number
 * check() is function call to check the number
 * 
 */
while(check(limit)!=false)
{
	System.out.println("enter the number");
	limit=scanner.nextInt();
	
}
/*
 * array declaration
 * to store upto n-1
 * 
 */
int number[]=new int[limit];
/*
 * 
 * using for loop
 * initializing i=0;
 * i iterate upto n-1
 * 
 */
for (int i = 0; i < number.length; i++) {
			number[i]=i;
}
		System.out.println("think your guess number");
		binarySearch1(number);
		scanner.close();

}
private static boolean check(int number) {
	int multiply=1;
for (int i = 0; i < 1000; i++) {
	multiply=multiply*2;
	if(multiply==number)
		return false;

}
return true;
}
//**********************************************************************



//**********************************************************************

}

