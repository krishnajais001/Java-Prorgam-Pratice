import java.lang.*;
import java.util.*;

public class prac7{
    public static void main(String[] args) {
        double leng,bred,area,perim;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter Length :");
        leng=val.nextDouble();
        System.out.print("Enter Breadth :");
        bred=val.nextDouble();
        area=leng*bred;
        perim=2*(leng+bred);
        System.out.println("Area of Rectangle is : "+area);
        System.out.println("Perimeter of Rectangle is : "+perim);

    }
}