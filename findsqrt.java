import java.lang.*;
import java.util.*;

public class findsqrt {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        double sqrRoot,num;
        System.out.print("Enter a Number to find their Square Root :");
        sqrRoot=val.nextDouble();
        num=Math.sqrt(sqrRoot);
        System.out.println("Sqaure Root of "+sqrRoot +" "+"is :"+num);
}}
