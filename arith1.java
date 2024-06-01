import java.lang.*;
import java.uitl.*;
import java.util.Scanner;

public class arith1{
    public static void main (String args []){
        Scanner val= new Scanner(System.in);
        int a,b;
        System.out.print("Enter Value of A :");
        a=val.nextInt();
        System.out.print("Enter Value of B :");
        b=val.nextInt();
        System.out.println("Sum : "+(a+b));
        System.out.println("Sub : "+(a-b));
        System.out.println("Mul : "+(a*b));
        System.out.println("Div : "+(a/b));
        System.out.println("Rem : "+(a%b));
    }
}