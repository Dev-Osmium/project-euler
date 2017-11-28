package net.devosmium.euler;
/*
 * Problem Title: Multiples of 3 and 5
 * Problem URL: https://projecteuler.net/problem=1
 * I certify that this work is my own. ~Dev_Osmium
 */
public class problem1 {
    public static void solution() {
    int product = 0;
        for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				product += i;
		}
		System.out.println(Integer.toString(product));
    }


}
