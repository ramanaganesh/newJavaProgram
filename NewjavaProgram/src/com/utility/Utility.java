package com.utility;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.algorithmprograms.Merge;

public class Utility {

//**********************************************************************
	/**
	 * 
	 * @param uname to print the name
	 * 
	 */
	public static void replaceString(String string[]) {
		// check whether the user name is having min 3 character or not
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter user name");
		String userName = scanner.nextLine();
		String newSentence = "";
		while (userName.length() < 3) {
			System.out.println("enter the correct string ");
			userName = scanner.next();
		}
		for (int i = 0; i < string.length; i++) {
			if (i == 1)
				newSentence = newSentence + userName + " ";
			else
				newSentence = newSentence + string[i] + " ";
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
	public static void isLeapYear(int year) {
		Scanner s = new Scanner(System.in);

		/*
		 *
		 * Integer.toString(year).length():To count the integer value if:to check the
		 * length of the year is 4 else:print some message
		 * 
		 */

		while (Integer.toString(year).length() < 4) {
			System.out.println("year must be 4 digits");
			System.out.println("enter the year");
			year = s.nextInt();
		}
		/*
		 * 
		 * if:to check the logic for the leap year print the year as leap year
		 * else:print some message
		 * 
		 */
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " is leap year");
		} else
			System.out.println(year + " is not leap year");
		s.close();

	}
//**********************************************************************

//**********************************************************************
	/**
	 * 
	 * @param times is used to number of times to flip
	 * 
	 */
	public static void flipCoin(int times) {
		Scanner s = new Scanner(System.in);
		while (times < 0) {
			System.out.println("enter correct number");
			times = s.nextInt();
		}
		/*
		 * Initializing two variables to find percentage
		 */
		double head = 0, tail = 0;

		/*
		 * using for loop initializing i=0 i iterate upto number of times to flip coin
		 * 
		 */
		for (int i = 0; i < times; i++) {
			/*
			 * if the values is <0.5 head increment else tail increment
			 * 
			 */

			if (Math.random() < 0.5)
				head++;

			else
				tail++;

		}

		// formula to calculate head and tail percentage
		double hperc = (head / times) * 100;
		double tperc = (tail / times) * 100;

		// print the possible number of head and tail with its percentage
		System.out.println("number of head " + head + " with head percentage is " + hperc + "%");
		System.out.println("number of tail " + tail + " with tail percentage is " + tperc + "%");
		s.close();
	}
//**********************************************************************

//**********************************************************************
	/**
	 * 
	 * @param n is used to determine the power of 2
	 * 
	 */
	public static void power(int n) {
		/*
		 * 
		 * if:check the user enter number is in the range else: print some message
		 * 
		 */
		Scanner s = new Scanner(System.in);
		while (n > 31 || n < 0) {
			System.out.println("enter the correct number");
			n = s.nextInt();
		}
		/*
		 * using for loop initializing i=0 i iterate upto n
		 * 
		 */

		for (int i = 0; i <= n; i++) {
			/*
			 * inner for loop using for loop initializing j=0 j iterate upto i every time
			 * pow is initialized in to 1
			 * 
			 */
			int pow = 1;
			for (int j = 0; j < i; j++) {
				// to calculate the power of (2,i)
				pow = pow * 2;
			}
			// print the power of (2,i) upto n
			System.out.println("the power of 2^" + i + " is " + pow);
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
	public static void harmonicSeries(int n) {
		/*
		 * if:check whether n is not equal to 0
		 *
		 */
		Scanner s = new Scanner(System.in);
		if (n != 0) {
			/*
			 * using for loop initializing i=1 i iterate upto n every time sum is
			 * initialized in to 0
			 * 
			 */

			double sum = 0;
			for (double i = 1; i <= n; i++) {
				// sum to calculate the nth harmonic number
				sum = sum + (1 / i);
			}
			// print the fisrt nth harmonic number
			System.out.println("the compute value of first " + n + " number is " + sum);
		}
		s.close();
	}
//**********************************************************************

//**********************************************************************
	public static void factor(long num) {
		Scanner s = new Scanner(System.in);
		/*
		 * using for loop initializing i=2 i iterate upto (i*i<=num)
		 * 
		 */
		for (long i = 2; i * i <= num; i++) {
			/*
			 * using while loop check the condition num%i==0 iterate to num=num/i
			 * 
			 */
			while (num % i == 0) {
				// print the prime factors

				System.out.println(i + " ");
				num = num / i;
			}
		}
		/*
		 * 
		 * if:check the final num>1 print the num
		 * 
		 */
		if (num > 1)
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
	 * @param goal  final amount
	 * @param trial times
	 * 
	 */
	public static void gambler(int stake, int goal, int trial) {
		/*
		 * Initializing two variables to find percentage
		 * 
		 */

		int win = 0, bet = 0;

		/*
		 * using for loop initializing i=1 i iterate upto trial
		 * 
		 */
		for (int i = 1; i <= trial; i++) {

			// we take temp variable to store stake
			int cash = stake;

			/*
			 * using while loop check the condition cash >0 && cash<goal iterate upto
			 * cash<goal
			 * 
			 */
			while (cash > 0 && cash < goal) {
				/*
				 * 
				 * every times while condition satisfies it increment bet if the values is <0.5
				 * cash increment else cash decrement
				 * 
				 */
				bet++;
				if (Math.random() < 0.5) {
					cash++;
				} else
					cash--;
			}
			/*
			 * 
			 * if:cash==goal win incremented
			 * 
			 */
			if (cash == goal)
				win++;
		}

		// print the results
		System.out.println(win + " of " + trial);
		System.out.println("the win percentage is " + 100.0 * win / trial);
		System.out.println("average bet " + 1.0 * bet / trial);

	}
//**********************************************************************

//**********************************************************************	
	/**
	 * 
	 * @param row represent row
	 * @param col reperesent column
	 * 
	 */
	static public void array2D(int row, int col) {
		System.out.println("hi");
		Scanner s = new Scanner(System.in);

		/*
		 * 
		 * declaring array to store the values
		 * 
		 */
		int arr[][] = new int[row][col];

		/*
		 * using for loop initializing i=0 i iterate upto row
		 * 
		 */
		for (int i = 0; i < row; i++) {
			/*
			 * using for loop initializing j=0 j iterate upto col
			 * 
			 */
			for (int j = 0; j < col; j++) {
				/*
				 * read the input from the user
				 * 
				 */
				System.out.print("arr[" + i + "][" + j + "]=");
				arr[i][j] = s.nextInt();
				System.out.println();
			}
		}
		// print the 2-D array
		System.out.println("2D array is");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
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
	public static void triplets(int a[]) {
		/*
		 * 
		 * using for loop initializing i=0 i iterate upto n -2 i increment
		 * 
		 */
		for (int i = 0; i < a.length - 2; i++) {
			/*
			 * 
			 * inner loop using for loop initializing j=i j iterate upto n-2 j increment
			 * 
			 */
			int sum = 0;
			int k = i;
			for (int j = i; j < a.length - 2; j++) {
				/*
				 * add the 3 values if:sum=0 means print the triplets break used to stop the
				 * loop
				 * 
				 */
				sum = a[k] + a[j + 1] + a[j + 2];
				if (sum == 0) {
					System.out.println(a[k] + " " + a[j + 1] + " " + a[j + 2]);

				}
			}

		}
	}

//**********************************************************************	
	public static void couponNumber(int lim) {
		ArrayList<Integer> arrayList = new ArrayList<>(lim);
		Random o = new Random();
		int iteartionCount = 0;
		System.out.print("repeated random number ");
		for (int i = 0; i < lim; i++) {
			Integer randomNumber = o.nextInt(lim) + 1;
			if (arrayList.contains(randomNumber)) {
				System.out.print(randomNumber + " ");
				i--;
				iteartionCount++;
			} else {
				arrayList.add(randomNumber);

			}
		}
		System.out.println();
		System.out.println("the arraylist is ");
		System.out.println(arrayList);
		System.out.println("the number of random number generate is:" + (iteartionCount + lim));
	}

//**********************************************************************
	/**
	 * 
	 * @param x1 first point
	 * @param y1 sec point
	 */
	public static void distance(int x1, int y1) {
		// formula to find distance
		int sq = (x1 * x1) + (y1 * y1);
		// print the result
		System.out.println(Math.sqrt(sq));
	}
//**********************************************************************

//**********************************************************************
	/**
	 * 
	 * @param ch it is used to swap the character
	 * @param j  its for the position
	 * @return no
	 */
	public static void permutation(char[] ch, int j) {
		/*
		 * 
		 * if:prints the overall values it reach ch.length-1
		 * 
		 */
		if (ch.length - 1 == j) {

			System.out.println(String.valueOf(ch));
		} /*
			 * 
			 * using for loop initializing i=j i iterate upto ch.length i increment
			 * 
			 */
		for (int i = j; i < ch.length; i++) {
			// Calling a function
			swap(ch, j, i);
			// Calling a recursive call
			permutation(ch, j + 1);
			// Calling a function
			swap(ch, j, i);

		}
	}

	/**
	 * 
	 * @param c this id array
	 * @param i this is the position for swapping
	 * @param j this is the position for swapping
	 * @return no
	 */
	private static void swap(char c[], int i, int j) {
		// swapping the variables
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
//System.out.println(c);	
	}
//**********************************************************************

//**********************************************************************
	public static void play(char cell[][]) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("TIC TAC TOE GAME");
		/*
		 * getting an input from the user with the help of scanner
		 */
		System.out.println("SELECT THE MODE \n1.EASY \n2.HARD");
		int mode = s.nextInt();
		System.out.println("Start The Game");
		/*
		 * print the board using for loop initializing i=0 i iterate upto cell.length-1
		 * 
		 */
		for (int i = 0; i < cell.length; i++) {
			/*
			 * inner loop using for loop initializing j=0 j iterate upto cell.length-1
			 * 
			 */
			for (int j = 0; j < cell.length; j++) {
				System.out.print(cell[i][j] + " ");
			}
			System.out.println();
		}
		/*
		 * 
		 * initializing two variable count is used for iterating the while loop k is
		 * used as computer or user play
		 * 
		 */
		int count = 0, k = 0;

		while (count < 9) {
			/*
			 * if k is even computer play
			 * 
			 */
			int c1 = 0, c2 = 0;
			if (k % 2 == 0) {
				/*
				 * if:mode=1 is for easy it take random values else if:mode=2 is for hard it
				 * take input from user
				 * 
				 * 
				 */
				if (mode == 1) {
					System.out.println("computer play");
					c1 = r.nextInt(3);
					c2 = r.nextInt(3);
				} else if (mode == 2) {
					System.out.println("computer play");
					c1 = s.nextInt();
					c2 = s.nextInt();

				}
				/*
				 * if:check wheher the input is valid or not else:print some message
				 * 
				 */
				if (c1 < 3 && c2 < 3) {
					/*
					 * if:check the unfilled box and then fill X else:print some message
					 * 
					 */
					if (cell[c1][c2] == 'E') {
						cell[c1][c2] = 'X';
						count++;
						k++;
					} else {
						System.out.println("the place is already filled");
					}
				} else {
					System.out.println("give correct location");
				}
				// print the intermediate results
				for (int i = 0; i < cell.length; i++) {
					for (int j = 0; j < cell.length; j++) {
						System.out.print(cell[i][j] + " ");
					}
					System.out.println();
				}
				/*
				 * Initializing three variables a,b,c for index if and else if: logics for the
				 * game print the result else if:count=9 means game over result is draw
				 */
				int a = 0, b = 1, c = 2;
				if ((cell[a][a] == 'X' && cell[a][b] == 'X' && cell[a][c] == 'X')
						|| (cell[a][a] == 'X' && cell[b][a] == 'X' && cell[c][a] == 'X')
						|| (cell[a][b] == 'X' && cell[b][b] == 'X' && cell[c][b] == 'X')
						|| (cell[a][c] == 'X' && cell[b][c] == 'X' && cell[c][c] == 'X')) {
					System.out.println("computer wins");
					break;
				} else if ((cell[a][a] == 'X' && cell[b][b] == 'X' && cell[c][c] == 'X')
						|| (cell[c][a] == 'X' && cell[b][b] == 'X' && cell[a][c] == 'X')) {
					System.out.println("computer wins");
					break;
				} else if ((cell[b][a] == 'X' && cell[b][b] == 'X' && cell[b][c] == 'X')
						|| (cell[c][a] == 'X' && cell[c][b] == 'X' && cell[c][c] == 'X')) {
					System.out.println("computer wins");
					break;
				} else if (count == 9) {
					System.out.println("draw");
					break;
				}
			}

			else {
				System.out.println("user play");
				c1 = s.nextInt();
				c2 = s.nextInt();
				/*
				 * if:check wheher the input is valid or not else:print some message
				 * 
				 */
				if (c1 < 3 && c2 < 3) {
					/*
					 * if:check the unfilled box and then fill O else:print some message
					 * 
					 */
					if (cell[c1][c2] == 'E') {
						cell[c1][c2] = 'O';
						count++;
						k++;
					} else {
						System.out.println("the place is already filled");
					}
				} else {
					System.out.println("give correct location");
				}
				// print the intermediate results
				for (int i = 0; i < cell.length; i++) {
					for (int j = 0; j < cell.length; j++) {
						System.out.print(cell[i][j] + " ");
					}
					System.out.println();
				}
				/*
				 * Initializing three variables a,b,c for index if and else if: logics for the
				 * game print the result else if:count=9 means game over result is draw
				 */
				int a = 0, b = 1, c = 2;
				if ((cell[a][a] == 'O' && cell[a][b] == 'O' && cell[a][c] == 'O')
						|| (cell[a][a] == 'O' && cell[b][a] == 'O' && cell[c][a] == 'O')
						|| (cell[a][b] == 'O' && cell[b][b] == 'O' && cell[c][b] == 'O')
						|| (cell[a][c] == 'O' && cell[b][c] == 'O' && cell[c][c] == 'O')) {
					System.out.println("user wins");
					break;
				} else if ((cell[a][a] == 'O' && cell[b][b] == 'O' && cell[c][c] == 'O')
						|| (cell[c][a] == 'O' && cell[b][b] == 'O' && cell[a][c] == 'O')) {
					System.out.println("user wins");
					break;
				} else if ((cell[b][a] == 'O' && cell[b][b] == 'O' && cell[b][c] == 'O')
						|| (cell[c][a] == 'O' && cell[c][b] == 'O' && cell[c][c] == 'O')) {
					System.out.println("user wins");
					break;
				} else if (count == 9) {
					System.out.println("draw");
					break;
				}
			}

		}
		// print the final result
		System.out.println("GAME OVER");
		for (int i = 0; i < cell.length; i++) {
			for (int j = 0; j < cell.length; j++) {
				System.out.print(cell[i][j] + " ");
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
	public static void quadratic(int a, int b, int c) {
		System.out.println("(" + a + "x*x)+" + b + "x+" + c);
		// mul is used for iteration
		int mul = a * c;
		/*
		 * 
		 * using for loop initializing i=1 i iterate upto a*c i increment
		 */
		for (int i = 1; i < (a * c); i++) {
			/*
			 * if:for prime values
			 */
			if (mul % i == 0) {
				int quo = mul / i;
				/*
				 * if:for check sum of 2 roots= b
				 */
				if ((quo + i) == b) {
					/*
					 * if:a=1 print the 2 roots else:a>1 print the 2 roots
					 * 
					 */
					if (a == 1) {
						System.out.println("the roots are " + "(x+" + quo + ")(x+" + i + ")");
						break;
					} else {
						double quo1 = (double) quo / a;
						double quo2 = (double) i / a;

						if (quo1 == 1.0 && quo2 == 1.0) {
							System.out.println("the roots are " + "(x+" + (int) quo1 + ")(x+" + (int) quo2 + ")");
							break;
						} else if (quo2 == 1.0) {
							System.out.println("the roots are " + "(x+" + (int) quo2 + ")(" + a + "x+" + quo + ")");
							break;
						} else if (quo1 == 1.0) {
							System.out.println("the roots are " + "(x+" + (int) quo1 + ")(" + a + "x+" + i + ")");
							break;
						}
					}
				}
			}
		}
	}
//**********************************************************************

//**********************************************************************
	public static void findWindChill(double temp, double v) {
		/*
		 * if:condtion satisfies means print the windmill speed else:print message
		 * 
		 */
		if (temp < 50 && v >= 3 && v <= 120) {
			// formula for windmill
			double p = Math.pow(v, 0.16);
			double windmill = 35.74 + (0.6215 * temp) + (((0.4275 * temp) - 35.75) * p);
			System.out.println("windmill=" + windmill);
		} else
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
	public static boolean isAnagram(String string1, String string2) {
		/*
		 * function call to check the two string anagram or not
		 * 
		 * 
		 */
		boolean flag = check(string1, string2);
		/*
		 * 
		 * if:true print ana=gram else: print not anagram
		 * 
		 */
		if (flag)
			System.out.println("given String is anagram");
		else
			System.out.println("given string is not anagram");
		return true;
	}

	/**
	 * 
	 * @param string2 taking input string from calling function
	 * @param string1 taking input string from calling function
	 * @return true or false
	 */
	private static boolean check(String string1, String string2) {
		/*
		 * 
		 * initializing two integer array to store the inputs for corresponding alphabet
		 * letter
		 * 
		 */
		int count[] = new int[26];
		int count1[] = new int[26];

		// its used to convert string into character array
		char character[] = string2.toCharArray();
		char character1[] = string1.toCharArray();
		/*
		 * using for loop initializing i=0 i iterate upto last letter(ch.length)
		 * 
		 */

		for (int i = 0; i < character.length; i++) {
			if (character[i] >= 'a' && character[i] <= 'z') {
				// to store the inputs for corresponding alphabet letter
				count[character[i] - 97]++;

			}
		}
		/*
		 * using for loop initializing i=0 i iterate upto last letter(ch.length)
		 * 
		 */
		for (int i = 0; i < character1.length; i++) {
			if (character1[i] >= 'a' && character1[i] <= 'z') {

				// to store the inputs for corresponding alphabet letter
				count1[character1[i] - 97]++;
			}
		}
		/*
		 * using for loop initializing i=0 i iterate upto 26
		 * 
		 */
		for (int i = 0; i < 26; i++) {
			/*
			 * 
			 * if:check whether its same or not if its differ means its return false
			 */
			if (count[i] != count1[i])
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
	static int value[] = new int[1000];

	public static int isPrime(int limit) {
		int count = 0;
		System.out.println("the prime numbers between 1 to" + limit);
		/*
		 * using for loop initializing i=1 i iterate upto n
		 * 
		 */
		for (int i = 1; i <= limit; i++) {
			// counter is used to print the prime number
			int counter = 0;
			/*
			 * using for loop initializing num=i num iterate upto 1
			 * 
			 */
			for (int number = i; number >= 1; number--) {
				/*
				 * if: to check the number is divisible by a 1 and num
				 * 
				 */
				if (i % number == 0) {
					// if its means it will add the counter by 1
					counter = counter + 1;
				}
			}
			/*
			 * if: counter=2 so the given num is prime
			 * 
			 */
			if (counter == 2) {
				// print the result
				System.out.println(i + " ");
				/*
				 * function call to check prime number is palindrome or not
				 * 
				 */
				value[count] = i;
				isPalindrome(i);
				count++;
			}

		}
		return count;
	}

	/**
	 * 
	 * @param i stores the prime number check whether the prime number is palindrome
	 *          or not
	 */
	static void isPalindrome(int i) {

		/*
		 * 
		 * if: the value between 0 to 9 is palindrome else the value more than 9
		 * 
		 */
		if (i > 0 && i <= 9)
			System.out.println("the number " + i + " is palindrome");
		else {
			// temp is used to i value because i value cannot be change

			int temp = i;
			int newNumber = 0;
			/*
			 * 
			 * using while loop to check upto temp!=0
			 * 
			 */
			while (temp != 0) {
				/*
				 * if:if the rem is 0 we will directly add rem else : we will add rem and then
				 * nnum will be multiply by 10
				 * 
				 */
				int remainder = temp % 10;
				if (temp / 10 == 0) {
					newNumber = newNumber + remainder;
					// System.out.println(nnum);
				} else {
					newNumber = newNumber + remainder;
					newNumber = newNumber * 10;
				}

				// System.out.println(nnum);
				// next iteration for while loop
				temp = temp / 10;
			}

			if (newNumber == i) {
				// print the result of palindrome
				System.out.println("the number " + i + " is palindrome");
			}
		}

	}

	public static void anagramDisplay(int count) {

		for (int i = 0; i < count - 2; i++) {
			for (int j = i + 1; j < count; j++) {
				if (value[i] != 0 && value[j] != 0) {

					boolean flag = isAnagram(value[i], value[j]);

					if (flag == true) {
						System.out.println(value[i] + " " + value[j]);
						// System.out.print(val[i]+" "+val[j]);
					}

				}
				// System.out.println();
			}
		}
	}

	static boolean isAnagram(int string1, int string2) {
		boolean flag = check(string1, string2);

		return flag;
	}

	private static boolean check(int string1, int string2) {
		int count[] = new int[10];
		int count1[] = new int[10];

		while (string1 != 0) {
			int remainder = string1 % 10;
			count[remainder]++;
			string1 = string1 / 10;
		}
		while (string2 != 0) {
			int remainder = string2 % 10;
			count1[remainder]++;
			string2 = string2 / 10;
		}
		for (int i = 0; i < 10; i++) {
			if (count[i] != count1[i])
				return false;

		}
		return true;

	}
//**********************************************************************

//**********************************************************************
	/**
	 * 
	 * @param a   its an integer array
	 * @param key its a search key
	 * 
	 */

	static public void binarySearch(int number[], int key) {
//System.out.println("Integer");

		int low = 0, flag = 0;
		int high = number.length - 1;
		/*
		 * 
		 * using while loop we have to iterate upto low <=high
		 * 
		 */
		while (low <= high) {
//for binary search we have to find mid value for current low and high
			int mid = (low + high) / 2;
			/*
			 * 
			 * if: we have to check whether the key value is left side else if: we have to
			 * check whether the key value is right side else if: its in mid position we
			 * have to print the key
			 */
			System.out.println(low + " " + mid + " " + high);
			if (number[mid] > key) {
				System.out.println(mid);
				high = mid - 1;
				// System.out.println(low+" "+high);
			} else if (number[mid] < key) {
				System.out.println(mid);
				low = mid + 1;
			} else if (number[mid] == key) {
				System.out.println(low + " " + mid + " " + high);
				// flag is used to check the key is found or not
				flag = 1;
				// print the result with position
				System.out.println("the key is found " + key + " in " + mid + " position");
				break;
			}
		}
		if (flag == 0)
			System.out.println("the key is not in the array");
	}

	static public void binarySearch(String word[], String key) {
//System.out.println("String");
		int low = 0;
		byte flag = 0;
		int high = word.length - 1;
		/*
		 * 
		 * using while loop we have to iterate upto low <=high
		 * 
		 */
		while (low <= high) {
			// for binary search we have to find mid value for current low and high
			int mid = (low + high) / 2;
			/*
			 * 
			 * if: we have to check whether the key value is left side else if: we have to
			 * check whether the key value is right side else if: its in mid position we
			 * have to print the key
			 */
			if (word[mid].compareTo(key) > 0) {

				high = mid - 1;
			} else if (word[mid].compareTo(key) < 0) {

				low = mid + 1;
			} else if (word[mid].compareTo(key) == 0) {

				// flag is used to check the key is found or not
				flag = 1;
				// print the result with position
				System.out.println("the key is found " + key + " in " + mid + " position");
				break;
			}

		}
		System.out.println(flag);
		if (flag == 0)
			System.out.println("the key is not in the array");
	}

	static public void binarySearch1(int number[]) {
//System.out.println("Integer");
		Scanner scanner = new Scanner(System.in);
		int low = 0, flag = 0;
		int high = number.length - 1;
		String check = "false";
		/*
		 * 
		 * using while loop we have to iterate upto low <=high
		 * 
		 */
		int choice = 0;
		do {

			while (low <= high) {
//for binary search we have to find mid value for current low and high
				int mid = (low + high) / 2;
				if (check != "true") {
					System.out.println("if ur guess number is " + number[mid]);
					System.out.println("true or false");
					check = scanner.next();

					if (check.equals("true")) {
						System.out.println("the key is found " + number[mid]);
						flag = 1;
						break;
					}
				}
				if (high != mid && mid != low && check.equals("false")) {
					System.out.println(
							"ur guess number is \n1.less than " + number[mid] + " \n2.greater than " + number[mid]);
					choice = scanner.nextInt();
				}
				/*
				 * 
				 * if: we have to check whether the key value is left side else if: we have to
				 * check whether the key value is right side else if: its in mid position we
				 * have to print the key
				 */
				System.out.println(low + " " + mid + " " + high);
				if (choice == 1 && high != mid && mid != low && check != "true") {

					high = mid - 1;

				} else if (choice == 2 && high != mid && mid != low && check != "true") {

					low = mid + 1;

				}

				else if (low == high) {
					// flag is used to check the key is found or not
					flag = 1;
					// print the result with position
					System.out.println("the key is found " + number[low]);
					check = "true";
					break;
				}
			}

		} while (check == "false");
		if (flag == 0)
			System.out.println("the key is not in the array");
		scanner.close();
	}

	/**
	 * 
	 * @param rupeeCount its an integer array
	 * @return sorted array
	 */
	static public int[] sorting(int number[]) {
//System.out.println("Integer");
		/*
		 * using for loop initializing i=1 i iterate upto arr.length
		 * 
		 */

		for (int i = 1; i < number.length; i++) {
			int key = number[i];
			int j = i - 1;
			/*
			 * 
			 * using while loop we have to check j upto 0
			 * 
			 * 
			 */
			while (j >= 0 && number[j] > key) {
				// if the key value is less than arr[j] means store the value in arr[j+1]j
				number[j + 1] = number[j];
				j = j - 1;
			}
			number[j + 1] = key;
		}
		return number;
	}

	/**
	 * 
	 * @param rupeeCount its an string array
	 * @return sorted array
	 */
	static public String[] sorting(String word[]) {
//System.out.println("String");
		/*
		 * using for loop initializing i=1 i iterate upto arr.length
		 * 
		 */

		for (int i = 1; i < word.length; i++) {
			String key = word[i];
			int j = i - 1;
			/*
			 * 
			 * using while loop we have to check j upto 0
			 * 
			 */
			while (j >= 0 && word[j].compareTo(key) > 0) {
				// if the key value is less than arr[j] means store the value in arr[j+1]j
				word[j + 1] = word[j];
				j = j - 1;
			}
			word[j + 1] = key;
		}
		return word;
	}

	/**
	 * 
	 * @param rupeeCount its an integer array
	 * @return sorted array
	 */
	static public int[] sort(int number[]) {
//System.out.println("Integer");
		/*
		 * using for loop initializing i=0 i iterate upto arr.length-1
		 * 
		 */
		for (int i = 0; i < number.length - 1; i++) {
			/*
			 * using inner for loop initializing j=0 j iterate upto arr.length
			 * 
			 */
			for (int j = i; j < number.length; j++) {
				/*
				 * 
				 * if:the next value is greater than swap the values
				 * 
				 */
				if (number[j] < number[i]) {
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		return number;
	}

	/**
	 * 
	 * @param rupeeCount its an String array
	 * @return sorted array
	 */

	static public String[] sort(String word[]) {// System.out.println("string");
		/*
		 * using for loop initializing i=0 i iterate upto arr.length-1
		 * 
		 */
		for (int i = 0; i < word.length - 1; i++) {
			/*
			 * using inner for loop initializing j=0 j iterate upto arr.length
			 * 
			 */
			for (int j = i; j < word.length; j++) {
				/*
				 * 
				 * if:the next value is greater than swap the values
				 * 
				 */
				if (word[j].compareTo(word[i]) < 0) {
					String temp = word[i];
					word[i] = word[j];
					word[j] = temp;
				}
			}
		}
		return word;
	}
//**********************************************************************

//**********************************************************************
	/**
	 * find funtion to check whether the number is or not using binary search
	 * 
	 */
	static boolean check = false;

	static public void find() {
//getting an input from the user with the help of scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int limit = scanner.nextInt();
		/*
		 * 
		 * using while loop to check the given number is power of 2 or not its not means
		 * again user enter another number check() is function call to check the number
		 * 
		 */
		while (check(limit) != false) {
			System.out.println("enter the number");
			limit = scanner.nextInt();

		}
		/*
		 * array declaration to store upto n-1
		 * 
		 */
		int number[] = new int[limit];
		/*
		 * 
		 * using for loop initializing i=0; i iterate upto n-1
		 * 
		 */
		for (int i = 0; i < number.length; i++) {
			number[i] = i;
		}
		System.out.println("think your guess number");
		binarySearch1(number);
		scanner.close();

	}

	private static boolean check(int number) {
		int multiply = 1;
		for (int i = 0; i < 1000; i++) {
			multiply = multiply * 2;
			if (multiply == number)
				return false;

		}
		return true;
	}
//**********************************************************************

//**********************************************************************
	/**
	 * 
	 * @param a its a string array
	 * @param low initial value 
	 * @param high last value
	 * @return sorted string array
	 */

    static public String[] mergeSort(String word[],int low,int high)
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
    		mergeSort(word, low, mid);
    		
    		mergeSort(word,mid+1,high);
    		/*
    		 * function calling
    		 * to merge the values
    		 * 
    		 */
    		merge(word, low, mid, high);
    	}
    	return word;
    }

    
    /**
	 * 
	 * @param rupeeCount string array
	 * @param l low position
	 * @param m mid position
	 * @param h last position
	 */
	static void merge(String word[], int low, int mid, int high) 
    { 
        /*
         * initializing two variable
         * n1 and n2 for length for string array
         * 
         */
        int number1 = mid - low + 1; 
        int number2 = high - mid; 
        //temporary array
        String left[] = new String[number1]; 
        String right[] = new String[number2]; 
  
        //to store the arr values into string array
        for (int i=0; i<number1; ++i) 
            left[i] = word[low + i]; 
        for (int j=0; j<number2; ++j) 
            right[j] = word[mid + 1+ j]; 
  
  
        int i = 0, j = 0; 
  
       
        int key = low; 
        while (i < number1 && j < number2) 
        { 
        	/*
        	 * 
        	 * if: to compare with next element <=0 means add in arr[k]=l[i]
        	 * else arr[k]=r[i]
        	 * 
        	 */
            if (left[i].compareTo(right[j])<=0) 
            { 
                word[key] = left[i]; 
                i++; 
            } 
            else
            { 
                word[key] = right[j]; 
                j++; 
            } 
            key++; 
        } 
  
     
        while (i < number1) 
        { 
            word[key] = left[i]; 
            i++; 
            key++; 
        } 
  
       
        while (j < number2) 
        { 
            word[key] = right[j]; 
            j++; 
            key++; 
        } 
    } 
//**********************************************************************
	
	
//**********************************************************************	
	static Scanner scanner=new Scanner(System.in);
	static int remainingAmount=0,count=0,balance=10000;
	static int rupeeCount[]= {100,100,100,100,100,100,100,100,100};
	/**
	 * 
	 * @return return the total amount
	 * 
	 */
	static public int menu() 
	{
		String check;int initial=0;
		/*
		 * 
		 * using do while loop
		 * iterate upto c=no;
		 * 
		 */
		do
		{
		System.out.println("welcome");
		//these are the choice in menu
		
		System.out.println("1.snickers-20 \n2.pepsi-40 \n3.lays-50 \n4.buiscuit-100");
		System.out.println("enter ur choice ");
		int choice=scanner.nextInt();
		/*
		 * 
		 * function call to get the amount of particular product
		 * 
		 */
		 initial = initial+priceAmount(choice);
		System.out.println("you want more yes/no");
		check=scanner.next();
		}while(check.equals("yes"));
		return  initial;
	}

	/**
	 * 
	 * @param food its getting an option 
	 * @return price of the product
	 */
	public static int priceAmount(int food) 
	{
		if(food==1)
			return 20;
		else if(food==2)
			return 40;
		else if(food==3)
			return 50;
		else
			return 100;
	}
	/**
	 * 
	 * @param price its used to get the remaining amount to the user
	 * @return balance
	 */
	public static int change(int price) 
	{
		System.out.println("ur item cost "+price);
		System.out.println("insert the amount ");
		int amount=scanner.nextInt();
		/*
		 * 
		 * function call to check the machine balance
		 * 
		 */
		boolean flag=machineBalance(amount);
		if(flag)
		{
		while(amount<price)
		{
			System.out.println("give sufficient amount");
			amount=scanner.nextInt();
		}
		return amount-price;
		}
		else
		{
			System.out.println("dosent have sufficient balance try another machine");
			return -1;
		}
	}

	/**
	 * 
	 * @param amount its check the balance
	 * @return true or false
	 */
	private static boolean machineBalance(int amount) 
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			return true;
		}

			return false;
	}
	/**
	 * 
	 * @param change is used to give change amount to user with minimum note
	 * 
	 */
	public static void changeout(int change)
	{
	/*
	 * 
	 * using while loop
	 * itearte upto arr[0]!=0 && change>=1000
	 * 
	 */
	while(change>=1000 && rupeeCount[0]!=0)
	{
		
		change=change-1000;
		
		count++;
		rupeeCount[0]--;
		
	}
	/*
	 * 
	 * if: count!=0 print the how much 1000 rupees notes to user
	 * then count=0;
	 * 
	 */
		if(count!=0)
		{
		System.out.println(1000+" * "+count+"="+(1000*count));
		count=0;
		}
	while(change>=500&& rupeeCount[1]!=0)
	{
		
		change=change-500;
		count++;
		rupeeCount[1]--;
	}
		if(count!=0)
		{
		System.out.println(500+" * "+count+"="+(500*count));
		count=0;
		}

	while(change>=200&& rupeeCount[2]!=0)
	{
		
		change=change-200;
		count++;
		rupeeCount[2]--;
	}
		if(count!=0)
		{
		System.out.println(200+" * "+count+"="+(200*count));
		count=0;
		}

	while(change>=100&& rupeeCount[3]!=0)
	{
		change=change-100;
		count++;
		rupeeCount[3]--;
	}	
		if(count!=0)
		{
		System.out.println(100+" * "+count+"="+(100*count));
		count=0;
		}

	while(change>=50&& rupeeCount[4]!=0)
	{
		change=change-50;
		count++;
		rupeeCount[4]--;
	}	
		if(count!=0)
		{
		System.out.println(50+" * "+count+"="+(50*count));
		count=0;
		}

	while(change>=20&& rupeeCount[5]!=0)
	{
		change=change-20;
		count++;
		rupeeCount[5]--;
	}
		if(count!=0)
		{
		System.out.println(20+" * "+count+"="+(20*count));
		count=0;
		}

	while(change>=10&& rupeeCount[6]!=0)
	{
		change=change-10;
		count++;
		rupeeCount[6]--;	
	}
		if(count!=0)
		{
		System.out.println(10+" * "+count+"="+(10*count));
		count=0;
		}
	while(change>=5&& rupeeCount[7]!=0)
	{
		change=change-5;
		count++;
		rupeeCount[7]--;
	}
		if(count!=0)
		{
		System.out.println(5+" * "+count+"="+(5*count));
		count=0;
		}

	while(change>=1&& rupeeCount[8]!=0)
	{
		change=change-1;
		count++;
		rupeeCount[8]--;
	}	
		if(count!=0)
		{
		System.out.println(1+" * "+count+"="+(1*count));
		count=0;
		}
	}
//**********************************************************************	
	
	
	
//**********************************************************************	
	
	/**
	 * 
	 * @param year year
	 * @param month month
	 * @param date date
	 */
static public void dayOfWeek(int year,String month,int date)
{
	int add=(year%100)+((year%100)/4);
	// to find the year code
		int yearCode=add%7,monthCode=0,centuryCode=0;
		/*
		 * 
		 * using switch case
		 * to find the month code
		 * 
		 */
	switch(month)
	{
		case "jan":monthCode=0;break;
		case "feb":monthCode=3;break;
		case "mar":monthCode=3;break;
		case "apr":monthCode=6;break;
		case "may":monthCode=1;break;
		case "jun":monthCode=4;break;
		case "jul":monthCode=6;break;
		case "aug":monthCode=2;break;
		case "sep":monthCode=5;break;
		case "oct":monthCode=0;break;
		case "nov":monthCode=3;break;
		case "dec":monthCode=5;break;
	}
	/*
	 * 
	 * using if loop 
	 * find the century code
	 * 
	 */
	if(year>=1700 && year<1800) centuryCode=4;
	if(year>=1800 && year<1900) centuryCode=2;
	if(year>=1900 && year<2000) centuryCode=0;
	if(year>=2000 && year<2100) centuryCode=6;
	if(year>=2100 && year<2200) centuryCode=4;
	if(year>=2200 && year<2300) centuryCode=2;
	if(year>=2300 && year<2400) centuryCode=0;
	
	//add all the yearcode,monthcode and centurycode
	int lastValue=yearCode+monthCode+centuryCode+date;
    //to check the odd days
	lastValue=lastValue%7;
	/*
	 * 
	 * using switch case
	 * to print the day
	 * 
	 */
	switch(lastValue)
	{
	case 0:System.out.println("sunday");break;
	case 1:System.out.println("monday");break;
	case 2:System.out.println("tuesday");break;
	case 3:System.out.println("wednesday");break;
	case 4:System.out.println("thursday");break;
	case 5:System.out.println("friday");break;
	case 6:System.out.println("saturday");break;
	}
	}
//**********************************************************************


//**********************************************************************

/**
 * 
 * @param temp its used to convert into fahrenheit and celsius
 * 
 */
static public void conversionToFahrenheit(int temperature)
{
//formula to convert the temperature
int fahrenheit=(temperature*9/5)+32;

//print the result
System.out.println(fahrenheit+"°F");
}
static public void conversionToCelsius(int temperature)
{
int celsius=(temperature-32) * 5/9;
System.out.println(celsius+"°C");
}
//**********************************************************************

				
//**********************************************************************
static public void calculateMonthlyPayment(double principle,double year,double loan)
{
	double number=12*year;
	double rate=loan/(12*100);
	double power=Math.pow((1+rate),-number );
	double monthlyPayment=(power*rate)/(1-power);
	System.out.println("the monthly payment is:");
	System.out.println(monthlyPayment);
}
//**********************************************************************




//**********************************************************************
static public void findingSquareRoot(Double number)
{
	double epsilon=1e-15;
	while(number<0)
	{
	System.out.println("enter another number");	
	number=scanner.nextDouble();
	}
	double temp=number;
	while(  Math.abs(temp-number/temp)   >   epsilon*temp  )
	{
		temp=((number/temp)+temp)/2.0;
	}
	System.out.println("the square root of "+number+" is");
	System.out.println(temp);
}

//**********************************************************************




//**********************************************************************
/**
 * 
 * @param number decimal number into convert binary
 */
static public String toBinary(int number)
{

int temp=number;
//to concantenate the values
String binary="";
/*
 * 
 * using while loop
 * iterate upto num!=0
 * 
 */
while(number!=0)
{
	int remainder=number%2;
	binary=remainder+binary;
	number=number/2;
}
//to primt the binary value for decimal number
System.out.println("the binary value of "+temp+" is ("+binary+")2");
/*
 * function call
 * to print the nibble values for given binary 
 * 
 */


return binary;  

}
static public void padding(String number)
{
for (int i = number.length(); i < 32; i++) {
	number="0"+number;
}
System.out.println("the binary value represent in 4 byte string is:");
System.out.println(number);
}
/**
* 
* @param number binary value in string 
*/
static public void nibbles(String number)
{

String nibble="";
for (int i = number.length(); i < 8; i++) {
	number="0"+number;
}
char character[]=number.toCharArray();
// mid value to swap the binary value for nibble calculation 
int mid=character.length/2;
for(int i=mid;i<character.length;i++)
{
	nibble=nibble+character[i];
}
for(int i=0;i<mid;i++)
{
	nibble=nibble+character[i];
}
System.out.println("the nibble value is "+nibble);
char finalCharacter[]=nibble.toCharArray();
// to convert string into integer 

//to count the digits of number
int count=nibble.length(),j=0,sum=0,nibbleLength=nibble.length()-1;int num;
while(count!=0)
{
	if(finalCharacter[nibbleLength]==0)
		num=(int)finalCharacter[nibbleLength]-47;
	else
		num=(int)finalCharacter[nibbleLength]-48;
	j++;
	int dec=1;
	/*
	 * if loop for only rem=1 
	 * j used as power 
	 */
	if(num==1)
	{
		for(int k=0;k<j-1;k++)
		{
			dec=dec*2;
			
		}
		// sum to calculate the value
		sum=sum+dec;
		
	}
	nibbleLength--;
	count--;
}
// to print the results
System.out.println(sum);
}
//**********************************************************************


}
