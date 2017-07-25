package com.ekotwick;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        X x = new X(scanner.nextInt());
        x.x();
    }
}
