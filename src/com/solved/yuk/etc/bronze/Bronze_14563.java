package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Bronze_14563 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {
            LinkedList<Integer> list = new LinkedList<>();
            for (int j = 1; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    list.add(j);
                }
            }
            int sum = list.stream().mapToInt(Integer::intValue).sum();
            if (sum == arr[i]) {
                System.out.println("Perfect");
            } else if (sum > arr[i]) {
                System.out.println("Abundant");
            } else {
                System.out.println("Deficient");
            }
        }
    }
}