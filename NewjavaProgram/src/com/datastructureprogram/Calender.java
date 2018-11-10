package com.datastructureprogram;

public class Calender {

		Object a[][];
	static void print(String mon,int year)
	{
		int add=(year%100)+((year%100)/4);
		int yearCode=add%7,mc=0,cc=0,sum=0,week=0,rem=0;
		String day=" ";
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
	if(year>=1700 && year<1800) cc=4;
	if(year>=1800 && year<1900) cc=2;
	if(year>=1900 && year<2000) cc=0;
	if(year>=2000 && year<2100) cc=6;
	if(year>=2100 && year<2200) cc=4;
	if(year>=2200 && year<2300) cc=2;
	if(year>=2300 && year<2400) cc=0;

	int last=yearCode+0+cc;
	
	if(year%400==0 || year%4==0 && year%100!=0)
	{ 	
		last=last%7;
	}
	else
		last=last%7+1;
	switch(last)
	{
	case 0:System.out.println("sunday");break;
	case 1:System.out.println("monday");break;
	case 2:System.out.println("tuesday");break;
	case 3:System.out.println("wednesday");break;
	case 4:System.out.println("thurday");break;
	case 5:System.out.println("friday");break;
	case 6:System.out.println("saturday");break;
	}
	for(int i=1;i<mc;i++)
	  {

		if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
		{
					sum=sum+31;
					
		}
		else if(i==4 || i==6 || i==9 || i==9 || i==11)
		{
						sum=sum+30;
						
		}	else
			if(year%400==0 || year%4==0 && year%100!=0)
			{ 	
				sum+=29;
				
			}
			else
			{
				sum+=28;
				
	  }
	  }
	week=sum/7;
	if(year%400==0 || year%4==0 && year%100!=0)
	{ 	
		rem=rem%7;
	}
	else
	{
		rem=rem%7+1;
		if(rem==-1)
			rem=0;
	}
	System.out.println(week);
	System.out.println(rem);
	int k=1;
		for(int i=0;i<=4;i++)
		{
			for(int j=1;j<=7;j++)
			{
				
				switch(rem)
				{
				case 0:day="Su";
						rem++;
						//System.out.println(day+" "+(k++));break;
				case 1:day="mo";
				rem++;
				//System.out.println(day+" "+(k++));
				break;
				case 2:day="tu";
				rem++;
				//System.out.println(day+" "+(k++));
				break;
				case 3:day="we";
				rem++;
				System.out.println(day+" "+(k++));
				break;
				case 4:day="th";
				rem++;
				System.out.println(day+" "+(k++));
				break;
				case 5:day="fr";
				rem++;
				System.out.println(day+" "+(k++));
				break;
				case 6:day="sa";
				rem++;
				System.out.println(day+" "+(k++));break;
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
                if(rem==7)
                	rem=0;
			}
		}
	}
}

