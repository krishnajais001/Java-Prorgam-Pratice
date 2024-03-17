/*
13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/

import java.lang.*;
import java.util.*;

class Ques13{
	public static void main(String args[]){	
		Scanner val=new Scanner(System.in);
		double width,height,area,perimeter;
		System.out.print("Enter Height :");
		height=val.nextDouble();
		System.out.print("Enter Width :");
		width=val.nextDouble();
		area=height*width;
		perimeter=2*(height+width);
		System.out.println("Area of Rectangle :"+area);
		System.out.println("Perimeter of Rectangle :"+perimeter);
	}
}