// Ben Pentecost

import java.util.*;

public class Fibonacci {

    public static void computeFibonacciNumbers(int n) {
        long a = 0, b = 1;
        System.out.print(a + " " + b); // program will print first two numbers in the sequence
        for (int i = 2; i < n; i++) {
            long c = a + b;
            System.out.print(" " + c); // program will print the current number in the sequence
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Please input the amount of numbers in the sequence you want to obtain: ");
            int n = sc.nextInt();

            while(n < 1) {
                System.out.println("Please input a value greater than 0. ");
                n = sc.nextInt();
            }

            computeFibonacciNumbers(n);
        }
    }

}
