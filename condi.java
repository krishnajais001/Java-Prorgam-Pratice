import java.lang.*;
import java.util.*;
public class condi {
    public static void main(String[] args) {
        int age;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter Age :");
        age=val.nextInt();

        if(age>18){
            System.out.println("You are eligible for vote");
        }else{
            System.out.println("You aren't eligible for vote");
        }

    }
    
}