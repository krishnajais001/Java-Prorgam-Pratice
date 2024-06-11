import java.lang.*;
import java.util.*;
public class findenorodd {
    public static void main(String[] args) {
        int n;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter Number :");
        n=val.nextInt();
        if (n%2==0) {
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}