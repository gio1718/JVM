package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class third_task {
    public static void main(String[] args) {

        int a, b;
        int even_sum = 0;
        int odd_sum = 0;

        int[] randnumber = new int[40];

        Scanner sca = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter A: ");
        a = sca.nextInt();

        System.out.println("Enter B: ");
        b = sca.nextInt();

        if (a > b) {
            System.out.println("A > B");
            int temp;
            temp = a;
            a = b;
            b = temp;
        }

        int limit = (((b - a) + 1) + a);
        for (int i = 0; i < randnumber.length; i++) {
            int num = rand.nextInt(limit);
            randnumber[i] = num;
        }

        System.out.println("Random nums: " + Arrays.toString(randnumber));

        ArrayList<Integer> even_list = new ArrayList<>();
        ArrayList<Integer> odd_list = new ArrayList<>();
        for (int num : randnumber) {
            if (num % 2 == 0) {
                even_list.add(num);
            } else {
                odd_list.add(num);
            }
        }

        System.out.println("Even nums count: " + even_list.size());
        System.out.println("Odd nums count: " + odd_list.size());

        for (int odds : odd_list) {
            odd_sum += odds;
        }
        for (int evens : even_list) {
            even_sum += evens;
        }
        System.out.println("ლუწების ჯამი: " + even_sum);
        System.out.println("კენტების ჯამი: " + odd_sum);
        int[] rand_even = new int[5];
        int[] rand_odd = new int[5];
        for (int i = 0; i < 5; i++) {
            int num_even = rand.nextInt(even_sum);
            int num_odd = rand.nextInt(odd_sum);
            rand_even[i] = even_sum;
            rand_odd[i] = num_odd;
        }
        System.out.println("5 random რიცხვი ლუწების ჯამიდან: " + Arrays.toString(rand_even));
        System.out.println("5 random რიცხვი კენტების ჯამიდან: " + Arrays.toString(rand_odd));
    }
}
