package net.devosmium.euler;

/*
 * Problem Title: Even Fibonacci Numbers
 * Problem URL: https://projecteuler.net/problem=2
 * I certify that this work is my own. ~Dev_Osmium
 */
public class problem2 {

    public static void solution() {
        int number1 = 1;
        int number2 = 2;
        int product = 0;


            int sum = 0;
            int x = 1;  // Represents the current Fibonacci number being processed
            int y = 2;  // Represents the next Fibonacci number in the sequence
            while (x <= 4000000) {
                if (x % 2 == 0)
                    sum += x;
                int z = x + y;
                x = y;
                y = z;
            }
        System.out.println("Answer:" + Integer.toString(sum));

    }

}

