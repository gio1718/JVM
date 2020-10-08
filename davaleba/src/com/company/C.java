package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sca = new Scanner(System.in);
        //method 1
        System.out.println("Method 1");
        System.out.println("Enter A: ");
        a = sca.nextInt();
        System.out.println("Enter B: ");
        b = sca.nextInt();
        System.out.println("Enter C: ");
        c = sca.nextInt();

        int first_a = a%10;
        System.out.println("Method 2: " + first_a);

        int last_b = b;
        while (last_b > 9) {
            last_b /= 10;
        }
        System.out.println("Method 3: " + last_b);

        int m, n, sum = 0;
        m = c;
        if ((m / 10) == 0) {
            sum = c;
        } else {
            while (m > 0) {
                n = m%10;
                sum = sum+n;
                m = m/10;
            }
        }
        System.out.println("Method 4: " + sum);
        //method 5
        int method_5 = a*b*c*first_a;
        System.out.println("Method 5: " + method_5);
        //method 6
        System.out.println("Method 6: " + last_b + method_5);
    }
}
