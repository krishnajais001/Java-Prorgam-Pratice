import java.lang.*;
import java.util.*;
public class prac10{
    public static void main(String[] args) {
        double leng,bred,height,volume;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter lenght : ");
        leng=val.nextDouble();
        System.out.print("Enter Bredth : ");
        bred=val.nextDouble();
        System.out.print("Enter Height : ");
        height=val.nextDouble();
        volume=leng*bred*height;
        System.out.println("Volume of Cuboid is : "+volume);
    }
}