import java.util.Scanner;

public class loop3 {
    public static void main(String[] args) {
        int n;
        Scanner val=new Scanner(System.in);
        System.out.print("Enter a num :");
        n=val.nextInt();
       int  sum=0;
       for ( int i = 1; i<=n; i++) {
        sum=sum+i;
        System.out.println(sum +"+"+i+"="+sum);
       }
    }
}
