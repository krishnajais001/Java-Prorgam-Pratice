import java.lang.*;
import java.util.*;

public class areaOfTriangle3 {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int a,b,c,s;
        double area;
        System.out.println("Enter Value A : ");
        a=val.nextInt();
        System.out.println("Enter Value B : ");
        b=val.nextInt();
        System.out.println("Enter Value C: ");
        c=val.nextInt();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));   
    System.out.println("Area of Triangle : "+area);
    }
}
