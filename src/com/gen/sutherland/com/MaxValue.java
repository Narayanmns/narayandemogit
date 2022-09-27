package com.gen.sutherland.com;

public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks[]= {90,68,64,45,45,92,100,42,98,69,97};
		int max=0;
	//	int smax=0;
		int small=0;
		for (int i=0;i<=marks.length-1;i++)
		{
			if(marks[i]>max)
			{
				small=max;
			//	smax=max;
				max=marks[i];
			}
			else
			{
			//	if(marks[i]>smax && marks[i]!=max)
					if(marks[i]>small && marks[i]!=max)
			
				{
					//smax=marks[i];
					small=marks[i];
		}
			}}
		System.out.println("max value is;" +max);
		//System.out.println("Secnd max value is ;"+smax);
		System.out.println("Small value is ;"+small);
	}
	

		}
