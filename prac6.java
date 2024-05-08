import java.lang.*;
import java.util.*;

public class prac6{
    public static void main(String[] args) {
        double pi=3.14;
        double r,area,circum;

        Scanner val=new Scanner(System.in);
        System.out.print("Enter Radius :");
        r=val.nextDouble();
        area=pi*r*r;
        System.out.println("Area of circle :"+area);
        circum=2*pi*r;
        System.out.println("Circumfernece of Circle : "+circum);
    }
}