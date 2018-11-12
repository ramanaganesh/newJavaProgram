package com.objectorientedprograms;

import java.util.Random;

public class DeckOfCards {

	public void play()
	{
		
	
	String suits[]= {"clubs","hearts","diamond","spade"};
	String rank[]= {"2","3","4","5","6","7","8","9","10","king","queen","jack","ace"};

	Random r=new Random();
	String player1[]=new String[9];
	String player2[]=new String[9];
	String player3[]=new String[9];
	String player4[]=new String[9];
	String player[]=new String[36];
	int k=0;
		for(int j=0;j<9;j++)
		{
			
			player1[j]=suits[r.nextInt(4)]+"-"+rank[r.nextInt(13)];
			player[k]=player1[j];k++;
			player2[j]=suits[r.nextInt(4)]+"-"+rank[r.nextInt(13)];
			player[k]=player2[j];k++;
			player3[j]=suits[r.nextInt(4)]+"-"+rank[r.nextInt(13)];
			player[k]=player3[j];k++;
			player4[j]=suits[r.nextInt(4)]+"-"+rank[r.nextInt(13)];
			player[k]=player4[j];k++;
		
		
			 for(int i = 0; i<k-1;i++ ) 
			 {
		         for(int l = i+1; l<k; l++) 
		         {
		        	 if(player[i].equals(player[l])) 
		        	 {
		            		j--;
		            		k=k-4;
		            		break; 
		            }
		         }
		         
		      }
			 
		}	
		System.out.println();
		for(int i=0;i<9;i++)
		{
			System.out.print(player1[i]+"         "+player2[i]+"          "+player3[i]+"           "+player4[i]);
			System.out.println();
		}
	
	}
}