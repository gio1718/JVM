package com.company;

import java.util.Scanner;
public class A {
    int x;
    String hello;
    public A(String phrase) {
        hello = phrase;
    }
    public static void main(String[] args) {
        B con = new B("Hello");
        System.out.println(con.hello);
        con.method_one();
        con.method_two();
        con.method_three();
        con.b_method_one();
        con.b_method_two();
    }
    public void method_one() {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = sca.nextInt();
    }
    public void method_two() {
        System.out.println(x+12);
    }
    public void method_three() {
        if (x % 2 == 0) {
            System.out.println("X არის ლუწი");
        } else {
            System.out.println("X არის კენტი");
        }
    }
}