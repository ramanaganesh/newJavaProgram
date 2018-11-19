package com.datastructureprogram;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) throws Exception
	{
		
	
	System.out.println("enter the word");
Scanner scanner=new Scanner(System.in);
String word=scanner.next();
MyDeque myDeque=new MyDeque(word.length()*2);
char character[]=word.toCharArray();
char check[]=new char[word.length()];
char check1[]=new char[word.length()];
int flag=0;
for (int i = 0; i < character.length; i++) {
	  	myDeque.addRear(character[i]);
}

for (int i = character.length-1; i >=0; i--) {
	//System.out.println(ch[i]);
  	myDeque.addFront(character[i]);
}

for(int i=0;i<character.length;i++)
{
	check[i]=(char)myDeque.removeRear();
	//System.out.print(chk[i]+" ");
	
}


for(int i=0;i<character.length;i++)
{
	check1[i]=(char)myDeque.removeFront();
	//System.out.print(chk1[i]+" ");
}





for (int i = 0; i < check1.length; i++) {
	
	if(check[i]!=check1[i])
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
scanner.close();
}
	
}
