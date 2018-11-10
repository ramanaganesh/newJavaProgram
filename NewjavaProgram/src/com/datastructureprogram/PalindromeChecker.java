package com.datastructureprogram;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) throws Exception
	{
		
	
	System.out.println("enter the word");
Scanner s=new Scanner(System.in);
String word=s.next();
MyDeque q=new MyDeque(word.length()*2);
char ch[]=word.toCharArray();
char chk[]=new char[word.length()];
char chk1[]=new char[word.length()];
int flag=0;
for (int i = 0; i < ch.length; i++) {
	  	q.addRear(ch[i]);
}

for (int i = ch.length-1; i >=0; i--) {
	//System.out.println(ch[i]);
  	q.addFront(ch[i]);
}

for(int i=0;i<ch.length;i++)
{
	chk[i]=(char)q.removeRear();
	//System.out.print(chk[i]+" ");
	
}


for(int i=0;i<ch.length;i++)
{
	chk1[i]=(char)q.removeFront();
	//System.out.print(chk1[i]+" ");
}





for (int i = 0; i < chk1.length; i++) {
	
	if(chk[i]!=chk1[i])
	{
		flag=1;
		System.out.println("not palindrome");
		break;
	}
}
if(flag==0)
{
System.out.println("palindrome");	
}
s.close();
}
	
}
