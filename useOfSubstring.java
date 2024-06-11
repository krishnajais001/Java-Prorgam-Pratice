import java.lang.*;
import java.util.*;
public class useOfSubstring {
    public static void main(String[] args) {
        String str="krishnajais7091@gmail.com";
        String username,domain;
        username=str.substring(0,15);
        domain=str.substring(16);
        System.out.println("UserName is :"+username);
        System.out.println("Doamin :"+domain);
    }
}
