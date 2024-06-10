import java.lang.*;
import java.util.*;

public class condi2 {
    public static void main(String[] args) {
     int a,b,c;
     Scanner val=new Scanner(System.in);
     System.out.print("Enter Value of A :");
     a=val.nextInt();
     System.out.print("Enter Value of B :");
     b=val.nextInt();
     System.out.print("Enter Value of C : ");
     c=val.nextInt();
        if (a>b&&a>c) {
            System.out.println("A is Greter");
        }else if (b>c){
            System.out.println("B is Greter");
        }else{
            System.out.println("C is Greter");

        }
    }
}
