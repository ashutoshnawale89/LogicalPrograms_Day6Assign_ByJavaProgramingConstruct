package com.sixdayasignment.program;

public class ReverseNumberUC4 {
	public static void main(String[] args) {

		int i=121;  // PUT THE NUMBER
		int reverse=0,remainder=0;
		int temp=i;
		while (temp != 0) { 
			remainder=temp%10;
			reverse=(reverse*10)+ remainder;
			temp=temp/10;
		}
		if (i==reverse)  {
			System.out.println("THE NUMBER IS REVERSE or PALINDROME = " + reverse );
		} else   {
			System.out.println("THE NUMBER IS REVERSE or NOT-PALINDROME = " + reverse );
		}


	}
}
