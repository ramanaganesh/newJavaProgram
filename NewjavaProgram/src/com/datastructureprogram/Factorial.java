package com.datastructureprogram;
public class Factorial {
static long catalanNumber(int n)
{
	long x=2*n;
	x=fact(x);
	System.out.println(x);
	long y=n+1;
	y=fact(y);
	System.out.println(y);
	long z=fact(n);
	System.out.println(z);
	long possibleValue=x/(y*z);
	return possibleValue;
}

private static long fact(long y) {
	long fact=1;

	for(long i=1;i<=y;i++)
	{
		fact=fact*i;
	}
	return fact;
}
}