package com.sixdayasignment.program;

public class Prime_NumberUC3 {
	public static void main(String[] args) {

		int Number=67;  // PUT THE VALUE 
		int Division_Number=1; 
		int Value=1;

		while (Division_Number <= Number) {
			Division_Number++;

			if (Number%Division_Number==0)  {
				Value=Value*Division_Number;

			}
		}
		if (Value-Number == 0) {
			System.out.println("THE NUMBER  "+  Number  +"  IS THE PRIME NUMBER");
		} 
		else
		{ 
			System.out.println("THE NUMBER  "+  Number  +"  IS THE NON PRIME NUMBER");
		}
	}
}
