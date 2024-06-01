import java.lamg.*;
import java.util.*;

public class rootsOfQuad {
public static void main(String[] args) {
    Scanner val=new Scanner(System.in);
int a,b,c;
double r1,r2;
System.out.println("Enter A,B,C :");
a=val.nextInt();
b=val.nextInt();
c=val.nextInt();
r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
System.out.println("Roots are : "+r1+ " " +r2);
}
}
