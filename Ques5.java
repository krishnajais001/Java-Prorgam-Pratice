 /* 5. Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/

import java.lang.*;
import java.util.*;
class Ques5{
	public static void main(String args[]){
		int a,b,c;
		Scanner val = new Scanner(System.in);
		System.out.print("Input first number:");
		a=val.nextInt();
			System.out.print("Input Second number:");
		b=val.nextInt();
		c=a*b;
			System.out.print("Expected Output :"+c);
		
	}
}