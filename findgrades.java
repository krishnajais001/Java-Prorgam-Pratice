import java.lang.*;
import java.util.*;

public class findgrades {
    public static void main(String[] args) {
        int m1,m2,m3,total;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter Marks 1 :");
        m1=val.nextInt();
        System.out.print("Enter Marks 2 :");
        m2=val.nextInt();
        System.out.print("Enter Marks 3 :");
        m3=val.nextInt();
        total=m1+m2+m3;
        float avg=total/3;
        if (avg>=80) {
            System.out.println("Grade A");
        } else if (avg >=60 && avg<80) {
            System.out.println("Grade B");
        }else if (avg >=50 && avg<60) {
            System.out.println("Grade C");
        }else if (avg >=40 && avg<50) {
            System.out.println("Grade D");
        }else{
            System.out.println("Grade D");
        }
    }
}
