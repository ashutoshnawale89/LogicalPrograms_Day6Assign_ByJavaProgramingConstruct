package com.sixdayasignment.program;

public class PerfectNumberUC2 {
	public static void main(String[] args) {
		int Number=498;   //  PUT THE VALUE

		int TotalCount=0,count=0;

		while (count <= Number) {
			count++;
			if (Number%count==0)  {
				TotalCount= TotalCount + count;

				System.out.println("COUNT NUMBER = " + count);	 
				System.out.println("TOTAL ADDING IS = " + TotalCount);	
			}
		}
		//   NEW 
		int sum=TotalCount-(2*Number);
		System.out.println("PERFECT NUMBER CALCULATION IS = " + sum);
		if (sum == 0)
		{

			System.out.println("########   THE VALUE IS PERFECT NUMBER   #######");
		}    
		else 
		{
			System.out.println("######   THE VALUE IS NOT PERFECT NUMBER  #######");
		}
	}
}
