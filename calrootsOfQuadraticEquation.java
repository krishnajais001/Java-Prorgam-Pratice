import java.lang.*;
import java.util.*;
class calrootsOfQuadraticEquation{
	public static void main(String args[]){
		int a,b,c;
		double r1,r2,rootValue;
		Scanner val=new Scanner(System.in);
		System.out.print("Input A Value :");
		a=val.nextInt();
		
		System.out.print("Input B Value :");
		b=val.nextInt();
		
		System.out.print("Input C Value :");
		c=val.nextInt();
		
		rootValue=Math.sqrt(b*b-4*a*c);
		r1=(-b+rootValue)/(2*a);
		r2=(-b-rootValue)/(2*a);
		System.out.println("Root 1 :"+r1);
		System.out.println("Root 2 :"+r2);
	}
}