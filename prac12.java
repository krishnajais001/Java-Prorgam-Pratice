import java.lang.*;
import java.util.*;
public class prac12{
    public static void main(String[] args) {
      double base,height,area;
      Scanner val= new Scanner(System.in);
      System.out.print("Enter Base : ");
      base=val.nextDouble();
      System.out.print("Enter Height : ");
      height=val.nextDouble();
      area=(base*height)/2;
      System.out.println("Ares of triangle :"+area);
    }
}