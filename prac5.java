import java.lang.*;
import java.util.*;
class prac5{
    public static void main (String args[]){
        String name;
        long rollno;
        int age;
         char branch;
        Scanner val=new Scanner(System.in);
        System.out.println("Enter Name :");
        name=val.nextLine();
        System.out.println("Enter Age :");
        age=val.nextInt();
        System.out.println("Enter Roll No. :");
        rollno=val.nextLong();
        System.out.println("Enter Branch :");
        branch=val.next().charAt(0);

        System.out.println("Enter Name :"+name);
        System.out.println("Enter Age :"+age);
        System.out.println("Enter Roll No. :"+rollno);
        System.out.println("Enter Branch :"+branch);

    }
}