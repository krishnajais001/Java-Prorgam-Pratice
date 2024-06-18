import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        int n;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter a num :");
        n=val.nextInt();
       int  mul=1;
       for ( int i = 1; i<=n; i++) {
        mul=mul*i;
        System.out.println(mul+" * "+i+" = "+mul);
       }
}
}
