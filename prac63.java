import java.util.*;
public class prac63 {
    public static void main(String[] args) {
        int day;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter Day :");
        day=val.nextInt();
        if (day==1) {
            System.out.println(" Monday");
        } else if(day==2) {
            System.out.println(" Tuesday");
        }else if(day==3) {
            System.out.println(" Wednesday");
        }else if(day==4) {
            System.out.println(" Thrusday");
        }else if(day==5) {
            System.out.println(" Friday");
        }else if(day==6) {
            System.out.println(" Saturday");
        }else if(day==7) {
            System.out.println(" Sunday");
        }
    }
    
}