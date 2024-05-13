import java.lang.*;
import java.util.*;
public class prac11{
    public static void main(String[] args) {
        double side,vol;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter Side : ");
        side=val.nextDouble();
        vol=side*side*side;
        System.out.println("Volume of Cube is : "+vol);
    }
}