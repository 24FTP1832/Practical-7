package Practical7;

import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number, total = 0, count = 0, pos = 0, neg = 0;

        System.out.println("Enter an integer, the input ends if it is 0: ");
        while (true) {
            number = input.nextInt();
            if (number==0) break;

            total += number;
            count++;
            if (number > 0) {
                pos++;
            }
            else if (number < 0) {
                neg++;
            }
        }

        if (count == 0) {
            System.out.println("No number is entered except for 0 to end the program.");
        }
        else {
            double average = (double) total / count;
            System.out.println("The number of positive is " + pos);
            System.out.println("The number of negative is " + neg);
            System.out.println("The total is " + total);
            System.out.printf("The average is %.2f\n", average);
        }
    }
}
