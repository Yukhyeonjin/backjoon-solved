package com.solved.yuk.etc.bronze;

import java.util.Scanner;

public class Bronze_10539 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int [n];
        int count = 2;

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();

        }

        int sum = 0;
        for(int i = 1; i < n; i++) {
            sum = arr[i] * count;
            for(int j = 0; j < i; j++) {
                sum -= arr[j];

            }
            count++;
            arr[i] = sum;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }


    }
}
