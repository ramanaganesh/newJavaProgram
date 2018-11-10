package com.datastructureprogram;

public class Calender1 {
 static void print(String mon,int year)
 {
	int y=(year/400),add=0,mc=0,Rem=0,sum=0,h=0;int flag=0;
	String days[]= {"su","mo","tu","we","th","fr","sa"};
	int n[]= {0,0,0,0,0,0,0};
		y=y*400;
		
		int rem=year-y;
				
				 int r1=rem%100;
				
			 rem=rem/100;
			  rem=rem*100;

			 if(rem==100)
				 add=add+5;
			 else if(rem==200)
				 	add+=3;
			 else if(rem==300)
			 		add+=1;
			 else
				 add+=0;
		
		int quo=r1/4;
		
		int r=r1-quo;
		
		int f=(quo*2)+(r*1);
		
		add=add+(f%7);
		if((year)%400==0 || (year)%4==0 && (year)%100!=0)
		{ 	
			add=add-1;
		}
		
	switch(add)
		{
		case 0:System.out.println("sunday");break;
		case 1:System.out.println("monday");break;
		case 2:System.out.println("tuesday");break;
		case 3:System.out.println("wednesday");break;
		case 4:System.out.println("thurday");break;
		case 5:System.out.println("friday");break;
		case 6:System.out.println("saturday");break;
		
		}
	
		switch(mon)
		{
			case "jan":mc=1;break;
			case "feb":mc=2;break;
			case "mar":mc=3;break;
			case "apr":mc=4;break;
			case "may":mc=5;break;
			case "jun":mc=6;break;
			case "jul":mc=7;break;
			case "aug":mc=8;break;
			case "sep":mc=9;break;
			case "oct":mc=10;break;
			case "nov":mc=11;break;
			case "dec":mc=12;break;
		}
	
	sum=add;
	for(int i=1;i<mc;i++)
	  {

		if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
		{
					sum=sum+31;
					//System.out.println(sum);
					
		}
		else if(i==4 || i==6 || i==9 || i==9 || i==11)
		{
						sum=sum+30;
						//System.out.println(sum);
						
		}	else
			if((year)%400==0 || (year)%4==0 && (year)%100!=0)
			{ 	
				sum+=29;
				//System.out.println(sum);
				
			}
			else
			{
				sum+=28;
				//System.out.println(sum);
				
	  }
	  }

	int k=1;Rem=sum%7;
	

	for(int q=0;q<7;q++)
	{
		System.out.print(days[q]+"   ");
	}
	if(Rem<=4)
		h=4;
	else
		h=5;
		for(int i=0;i<=h;i++)
		{{
				for(int q=0;q<7;q++)
				{
					n[q]=0;
				}
		}
			System.out.println();
		
			
			
			for(int j=1;j<=7;j++)
			{
				
				switch(Rem)
				{
				case 0:
				n[Rem]=k;
				Rem++;
				k++;
				break;
				case 1:
				n[Rem]=k;
				Rem++;
				k++;
				break;
				case 2:
				n[Rem]=k;
				Rem++;
				k++;
				break;
				case 3:
				n[Rem]=k;
				Rem++;
				k++;
				break;
				case 4:
				n[Rem]=k;
				Rem++;
				k++;
				break;
				case 5:
				n[Rem]=k;
				Rem++;
				k++;
				break;
				case 6:
				n[Rem]=k;
				Rem++;
				k++;
				break;
				
				}
				
				if(mc==1 || mc==3 || mc==5 || mc==7 || mc==8 || mc==10 || mc==12)
				{
							if(k==32)
								break;
							
				}
				else if(mc==4 || mc==6 || mc==9 || mc==9 || mc==11)
				{
								if(k==31)
									break;
								
				}	else
					if(year%400==0 || year%4==0 && year%100!=0)
					{ 	
						if(k==30)
							break;
						
					}
					else
					{
						if(k==29)
							break;
					}				
               
			}
			
			for(int q=0;q<7;q++)
			{
				
				String temp=n[q]+"";
				if(n[q]==0)
					System.out.print("     ");
				else
				{
				if(temp.length()==1)
					System.out.print(n[q]+"    ");
				else
					System.out.print(n[q]+"   ");
				}
				if(year%400==0 || year%4==0 && year%100!=0 )
				{ 	
					if(n[q]==29 && mc==2)
					{
						flag=1;
						break;
					}	
				}
				else
				{
					if(n[q]==28 && mc==2)
					{
						flag=1;
						break;
					}	
				}	
				if(flag==1)
					break;
			}
			 if(Rem==7)
             	Rem=0;
			 
		}
		
	
	}			
		
 }
 

