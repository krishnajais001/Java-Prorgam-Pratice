import java.util.*;
import java.lang.*;

public class toUpperCase {
    public static void main(String[] args) {
        String str;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter String type value :");
        str=val.next();
        String str1=str.toUpperCase();
        System.out.println("String after Converted into UpperCase :"+str1);

    }
}
