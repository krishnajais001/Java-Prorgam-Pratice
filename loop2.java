import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        int n;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter Number :");
        n=val.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
