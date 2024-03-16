import java.lang.*;
import java.util.*;

class calcTax{
	public static void main(String args[]){
		String country;
		int amount;
		int gst;
		double calcTax;
		double grossAmount;
		Scanner val=new Scanner(System.in);
		System.out.print("Enter Country :");
		country=val.next();
		
		System.out.print("Enter Amount :$");
		amount=val.nextInt();
		
		System.out.print("Enter GST Rate :");
		gst=val.nextInt();
		
		calcTax=amount*gst/100;
		grossAmount=amount+calcTax;
		System.out.println("Enter Amount :$"+amount);
		System.out.println("GST Rate:"+gst);
		System.out.println("GST Amount:$"+calcTax);
		System.out.println("Gross Amount :$"+grossAmount);

	}
	
}