import java.lang.*;
import java.util.*;

class calAreaOfTriangle{
	public static void main(String args[]){
	Scanner val=new Scanner(System.in);
	double height,base,area;
	System.out.print("Enter Height :");
	height=val.nextDouble();
	System.out.print("Enter base :");
	base=val.nextDouble();
	area=(base*height)/2;
	System.out.print("Area of Triangle :"+area);
	};
}