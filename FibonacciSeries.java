package com.sixdayasignment.program;

public class Fibonacci_SeriesUC1 {
	public static void main(String[] args) {
		int N1=0, N2=1 ,N3=0;
		int count=10, num=0;


		while (num <= count) {
			num++;
			N3=N1+N2;
			N1=N2; N2=N3;
			System.out.println(N3);}
	}


}
