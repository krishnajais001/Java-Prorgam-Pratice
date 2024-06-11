import java.lang.*;
import java.util.*;

public class findyoungornot {
    public static void main(String[] args) {
        int age;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter Age :");
        age=val.nextInt();
        if (age>=14 && age<=55) {
            System.out.println("You are Young");
        } else if (age>55) {
            System.out.println("You are old age");
        }else{
            System.out.println("You aren't Young");
        }
    }
}
