package com.functionalprogram;

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
	static void isLeap(int year)
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
static void power(int n)
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
public static void harmonic(int n)
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
static void factor(long num)
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
static void gambler(int stake,int goal,int trial)
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

//*********************************************************************

	



//**********************************************************************	
/**
 * 
 * @param row represent row
 * @param col reperesent column
 * 
 */
static void array2D(int row,int col)
{
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
static void triplets(int a[])
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
static void couponNumber(int lim)
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
static void distance(int x1,int y1)
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
static void play(char cell[][])
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
static void quadratic(int a,int b,int c)
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
static void findWindChill(double temp,double v)
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

}