import java.lang.*;
import java.util.*;

class checkSquareRoot{
	public static void main(String args[]){
		Scanner val=new Scanner(System.in);
		double num,sqrt;
		System.out.print("Enter Num :");
		num=val.nextDouble();
		sqrt=Math.sqrt(num);
		System.out.print("Square Root is :"+sqrt);
		
	}
}