import java.lang.*;
public class method2{
    public static void main(String[] args) {
        String str="www.krishnaweb.com";
        Boolean str2=str.startsWith("www");
        System.out.println(str2);
        Boolean str3=str.endsWith(".com");
        System.out.println(str3);
        char str4=str.charAt(6);
        System.out.println(str4);
    }
}