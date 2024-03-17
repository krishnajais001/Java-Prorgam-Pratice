/*
11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/
import java.lang.*;
import java.util.*;

class Ques11{
	public static void main (String args[]){
		Scanner val=new Scanner(System.in);
		double radius , area,perimeter;
		double pi=3.18;
		System.out.print("Radius :");
		radius=val.nextDouble();
		area=pi*radius*radius;
		perimeter=2*pi*radius;
		System.out.println("Area of circle :"+area);
		System.out.println("Perimeter of Circle :"+perimeter);
	}
}