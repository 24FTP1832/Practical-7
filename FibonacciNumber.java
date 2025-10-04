package Practical7;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the term : ");
        int term = input.nextInt();

        int f0 = 0, f1 = 1, temp;

        if (term == 0) {
            System.out.println("At term 0 the number is 0");
        }
        else if (term == 1) {
            System.out.println("At term 1 the number is 1");
        }
        else {
            for (int i = 2; i <= term; i++) {
                temp = f0 + f1;
                f0 = f1;
                f1 = temp;
            }
            System.out.println("At term " + term + " the number is " + f1);
        }
    }
}
