package com.company;

import com.company.A;

import java.util.Scanner;
class B extends A {
    int y;
    public B(String phrase) {
        super(phrase);
    }

    public void b_method_one() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter y: ");
        y = scan.nextInt();
    }
    public void b_method_two() {
        System.out.println("Sum: " + (x+y));
    }
}