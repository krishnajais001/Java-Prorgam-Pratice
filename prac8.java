import java.lang.*;
import java.util.*;

public class prac8{
    public static void main(String[] args) {
        double side , area;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter Side : ");
        side=val.nextDouble();
        area=side*side;
        System.out.println("Area is : "+area);
    }
}