package com.solved.yuk.etc.bronze;

import java.util.Scanner;

public class Bronze_2522 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int p=0; p<n; p++) {
            for(int q=0; q<n-p-1; q++) {
                System.out.print(" ");
            }
            for(int q=0; q<=p; q++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int p=1; p<n; p++) {
            for(int q=0; q<p; q++) {
                System.out.print(" ");
            }
            for(int q=0; q<=n-p-1; q++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
