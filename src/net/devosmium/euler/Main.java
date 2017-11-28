package net.devosmium.euler;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the project number");
        String problemNo = sc.next();
        switch (problemNo) {
            case "1":
                new problem1().solution();
            case "2":
                new problem2().solution();
        }
    }
    
}