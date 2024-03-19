/* 15. Write a Java program to swap two variables.
*/

import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter Second number: ");
        num2 = scanner.nextInt();

        // Swap the values of num1 and num2
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}
