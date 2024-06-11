import java.lang.*;
import java.util.*;
public class tolowerCase {
    public static void main(String[] args) {
        String str;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter String type Value :");
        str=val.next();
        String str1=str.toLowerCase();
        System.out.println(" String After Conversion :"+str1);
    }
}
