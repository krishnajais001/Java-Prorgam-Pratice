/* 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/

import java.lang.*;
import java.util.*;
class Ques6{
	public static void main(String args[]){
		Scanner val=new Scanner(System.in);
		double fristNumber,secondNumber,sum,sub,mul,div,rem;
		System.out.print("Input first number:");
		fristNumber=val.nextInt();
		System.out.print("Input first number:");
		secondNumber=val.nextDouble();
		
		sum=fristNumber+secondNumber;
		sub=fristNumber-secondNumber;
		mul=fristNumber*secondNumber;
		div=fristNumber/secondNumber;
		rem=fristNumber%secondNumber;
		
			System.out.println("Addition is :"+sum);
			System.out.println("Subtract is :"+sub);
			System.out.println("Multiply is :"+mul);
			System.out.println("Divide is :"+div);
			System.out.println("Remainder is :"+rem);
		
	}
}