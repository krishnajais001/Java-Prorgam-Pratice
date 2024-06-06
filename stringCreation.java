import java.lang.*;
import java.util.*;

public class stringCreation {
    public static void main(String[] args) {
        String str1="java"; // it is created in pool beacuse it uses string literal
        System.out.println("str1 :"+str1);
        String str2=new String("java");
        System.out.println("str2 :"+str2); // it is created in heap beacause of new keyword is in use and it not created another object due to the previous object created with same name
        
    }
}
