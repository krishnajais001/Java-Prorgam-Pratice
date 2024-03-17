/* 12. Write a Java program that takes three numbers as input to calculate and print the 
 average of the numbers.
 */
 
 import java.lang.*;
 import java.util.*;
 
 class Ques12{
	 public static void main(String args[]){
		 Scanner val=new Scanner(System.in);
		 double fristNumber,secondNumber,thridNumber,avg;
		 System.out.print("First Number :");
		 fristNumber=val.nextDouble();
		 
		 System.out.print("Second Number :");
		 secondNumber=val.nextDouble();
		 
		 System.out.print("Third Number :");
		 thridNumber=val.nextDouble();
		 avg=(fristNumber+secondNumber+thridNumber)/3;
		 System.out.print("Average is :"+avg);
	 }
 }